/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.patronesdiseno.srp.models.patterns;

import edu.patronesdiseno.srp.models.impl.IGVTax;
import edu.patronesdiseno.srp.models.interfaces.ITax;

/**
 *
 * @author Giannela HC
 */
public class IgvTaxFactory implements ITaxFactory{

    @Override
    public ITax createTax() {
        return new IGVTax();
    }
    
}
