/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.patronesdiseno.srp.models.patterns;

import edu.patronesdiseno.srp.models.Address;
import edu.patronesdiseno.srp.models.patterns.IAddressBuilder;

/**
 *
 * @author Giannela HC
 */
public class AddressCondominio implements IAddressBuilder{

    private int nro;
    private String calle;
    private String avenida;
    private String condominio;
    private int nroEdificio;
    private String nombreEdificio;
    
    public AddressCondominio withNro(int nro)  {
        this.nro = nro;
        return this;
    }

    public AddressCondominio withCalle(String calle)  {
        this.calle = calle;
        return this;
    }
    
    public AddressCondominio withAvenida(String avenida)  {
        this.avenida = avenida;
        return this;
    }
    
    public AddressCondominio withCondominio(String condominio)  {
        this.condominio = condominio;
        return this;
    }

    public AddressCondominio withNroEdificio(int nroEdificio)  {
        this.nroEdificio = nroEdificio;
        return this;
    }   
    
    public AddressCondominio withNombreEdificio(String nombreEdificio)  {
        this.nombreEdificio = nombreEdificio;
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
        return address;
    }
    
}
