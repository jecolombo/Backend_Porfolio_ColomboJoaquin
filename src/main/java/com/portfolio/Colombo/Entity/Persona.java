package com.portfolio.Colombo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String nombre;
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String apellido;
    
    @NotNull
    private String descripcion;
    
    private String img;
    @NotNull
    private String titulo;
    
    private String portada;
    
    private String instagram;
    private String email;
    private String github;
    private String linkedin;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String descripcion, String img, String titulo, String portada, String instagram, String email, String github, String linkedin) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.descripcion = descripcion;
        this.img = img;
        this.titulo = titulo;
        this.portada = portada;
        this.instagram = instagram;
        this.email = email;
        this.github = github;
        this.linkedin = linkedin;
    }
    
    
    
}
