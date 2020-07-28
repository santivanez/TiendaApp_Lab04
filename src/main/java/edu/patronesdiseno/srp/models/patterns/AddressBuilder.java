/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.patronesdiseno.srp.models.patterns;

import edu.patronesdiseno.srp.models.Address;

/**
 *
 * @author Giannela HC
 */
public class AddressBuilder implements IAddressBuilder{

    private int nro;
    private String calle;
    private String avenida;
    private String condominio;
    private int nroEdificio;
    private String nombreEdificio;
    private String urbanizacion;
    
    public AddressBuilder withNro(int nro)  {
        this.nro = nro;
        return this;
    }

    public AddressBuilder withCalle(String calle)  {
        this.calle = calle;
        return this;
    }
    
    public AddressBuilder withAvenida(String avenida)  {
        this.avenida = avenida;
        return this;
    }
    
    public AddressBuilder withCondominio(String condominio)  {
        this.condominio = condominio;
        return this;
    }

    public AddressBuilder withNroEdificio(int nroEdificio)  {
        this.nroEdificio = nroEdificio;
        return this;
    }   
    
    public AddressBuilder withNombreEdificio(String nombreEdificio)  {
        this.nombreEdificio = nombreEdificio;
        return this;
    }  
    
    public AddressBuilder withUrbanizacion(String urbanizacion)  {
        this.urbanizacion = urbanizacion;
        return this;
    }
    
    @Override
    public Address build() {
        Address address = new Address();
        address.setNro(this.nro);
        address.setCalle(this.calle);
        address.setAvenida(this.avenida);
        address.setCondominio(this.condominio);
        address.setNroEdificio(this.nroEdificio);
        address.setNombreEdificio(this.nombreEdificio);
        address.setUrbanizacion(this.urbanizacion);
        return address;
    }
    
}
