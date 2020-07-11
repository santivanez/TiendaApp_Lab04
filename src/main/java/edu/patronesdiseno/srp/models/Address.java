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
public abstract class Address {
    public static final String URBAN = "Urbanizacion";
    public static final String CONDOMIN = "Condominio";
    
    public static Address createAddress(String type){
        switch(type){
            case URBAN:
                return new AddressCondomini();
            case CONDOMIN: 
                return new AddressUrbanizacion();
            default : return null;
        }
        
    }
    
    public abstract String getAddress(int num, String nombre);
    
}
