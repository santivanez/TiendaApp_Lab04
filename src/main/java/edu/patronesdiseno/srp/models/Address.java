/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.patronesdiseno.srp.models;

/**
 *
 * @author Giannela HC
 */
public class Address {
    
    private int nro;
    private String calle;
    private String avenida;
    private String urbanizacion;
    private String condominio;
    private int nroEdificio;
    private String nombreEdificio;

    public Address() {
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getAvenida() {
        return avenida;
    }

    public void setAvenida(String avenida) {
        this.avenida = avenida;
    }

    public String getUrbanizacion() {
        return urbanizacion;
    }

    public void setUrbanizacion(String urbanizacion) {
        this.urbanizacion = urbanizacion;
    }

    public String getCondominio() {
        return condominio;
    }

    public void setCondominio(String condominio) {
        this.condominio = condominio;
    }

    public int getNroEdificio() {
        return nroEdificio;
    }

    public void setNroEdificio(int nroEdificio) {
        this.nroEdificio = nroEdificio;
    }

    public String getNombreEdificio() {
        return nombreEdificio;
    }

    public void setNombreEdificio(String nombreEdificio) {
        this.nombreEdificio = nombreEdificio;
    }

    @Override
    public String toString() {
        return "Address{" + "nro=" + nro + ", calle=" + calle + ", avenida=" + avenida + ", urbanizacion=" + urbanizacion + ", condominio=" + condominio + ", nroEdificio=" + nroEdificio + ", nombreEdificio=" + nombreEdificio + '}';
    }
    
    
}
