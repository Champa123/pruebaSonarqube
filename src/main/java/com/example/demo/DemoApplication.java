package com.example.demo;

import com.example.demo.domain.Pedido;
import com.example.demo.domain.Usuario;
import com.example.demo.service.UsuarioService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        // Creación de pedidos iniciales
        Pedido pedido1 = new Pedido("item1", "user1", 3);
        Pedido pedido2 = new Pedido("item2", "user1", 1);

        // Creación de usuarios con pedidos
        Usuario usuario1 = new Usuario("Juan", "Pérez", "12345678", LocalDate.of(1990, 5, 20), Arrays.asList(pedido1));
        Usuario usuario2 = new Usuario("Ana", "García", "87654321", LocalDate.of(1985, 3, 14), Arrays.asList(pedido2));

        // Lista de usuarios
        List<Usuario> usuarios = Arrays.asList(usuario1, usuario2);

        // Creamos el servicio de usuarios
        UsuarioService usuarioService = new UsuarioService(usuarios);

        // Nuevo pedido a agregar
        Pedido nuevoPedido = new Pedido("item3", "user1", 2);

        // Agregamos el pedido al usuario con DNI "12345678"
        boolean exito = usuarioService.agregarPedidoAUsuario("12345678", nuevoPedido);

        if (exito) {
            System.out.println("Pedido agregado con éxito.");
        } else {
            System.out.println("No se encontró al usuario.");
        }

        // Verificamos el pedido añadido
        usuarioService.obtenerUsuarioPorDni("12345678")
                .ifPresent(usuario -> usuario.getPedidos()
                        .forEach(pedido -> System.out.println("Pedido: " + pedido.getItemId())));

        SpringApplication.run(DemoApplication.class, args);
    }

}
