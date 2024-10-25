package com.example.demo.service;

import com.example.demo.domain.Pedido;
import com.example.demo.domain.Usuario;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class UsuarioService {

    List<Usuario> usuarios;

    public UsuarioService(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public static List<Usuario> filtrarUsuariosPorItemId(List<Usuario> usuarios, String itemId) {
        return usuarios.stream()
                .filter(usuario -> usuario.getPedidos().stream()
                        .anyMatch(pedido -> pedido.getItemId().equals(itemId)))
                .collect(Collectors.toList());
    }

    // Método para agregar un pedido a un usuario específico
    public boolean agregarPedidoAUsuario(String dni, Pedido nuevoPedido) {
        Optional<Usuario> usuarioOpt = usuarios.stream()
                .filter(usuario -> usuario.getDni().equals(dni))
                .findFirst();

        if (usuarioOpt.isPresent()) {
            Usuario usuario = usuarioOpt.get();
            usuario.getPedidos().add(nuevoPedido);
            return true; // Pedido agregado con éxito
        } else {
            return false; // Usuario no encontrado
        }
    }

    // Método para obtener un usuario por su DNI
    public Optional<Usuario> obtenerUsuarioPorDni(String dni) {
        return usuarios.stream()
                .filter(usuario -> usuario.getDni().equals(dni))
                .findFirst();
    }
}
