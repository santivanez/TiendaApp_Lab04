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
public class AddressUrbanizacion extends Address{

    
    @Override
    public String getAddress(int num, String nombre) {
        return "Urbanización : " +nombre +" nro. casa: "+num;
    }
    
}
