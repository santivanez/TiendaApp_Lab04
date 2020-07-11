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
public class AddressUrbanizacion implements IAddressBuilder{

    private int nro;
    private String calle;
    private String avenida;
    private String urbanizacion;
    
    public AddressUrbanizacion withNro(int nro)  {
        this.nro = nro;
        return this;
    }

    public AddressUrbanizacion withCalle(String calle)  {
        this.calle = calle;
        return this;
    }
    
    public AddressUrbanizacion withAvenida(String avenida)  {
        this.avenida = avenida;
        return this;
    }
    
    public AddressUrbanizacion withUrbanizacion(String urbanizacion)  {
        this.urbanizacion = urbanizacion;
        return this;
    }
    
    @Override
    public Address build() {
        Address address = new Address();
        address.setNro(this.nro);
        address.setCalle(this.calle);
        address.setAvenida(this.avenida);
        address.setUrbanizacion(this.urbanizacion);
        return address;
    }

    
    
}
