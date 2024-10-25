package com.example.demo.domain;


import java.time.LocalDate;
import java.util.List;

// Clase Usuario
public class Usuario {
    private String nombre;
    private String apellido;
    private String dni;
    private LocalDate fechaNacimiento;
    private List<Pedido> pedidos;

    public Usuario(String nombre, String apellido, String dni, LocalDate fechaNacimiento, List<Pedido> pedidos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.pedidos = pedidos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
}

