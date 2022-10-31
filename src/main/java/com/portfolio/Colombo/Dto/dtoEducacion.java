/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.Colombo.Dto;

import javax.validation.constraints.NotBlank;

public class dtoEducacion {
    @NotBlank
    private String anioE;
    @NotBlank
    private String nombreE;
    @NotBlank
    private String descripcionE;

    //constructores
    public dtoEducacion() {
    }

    public dtoEducacion(String anioE, String nombreE, String descripcionE) {
        this.anioE = anioE;
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
    }

    //getters and setters

    public String getAnioE() {
        return anioE;
    }

    public void setAnioE(String anioE) {
        this.anioE = anioE;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }
    
    
    
}
