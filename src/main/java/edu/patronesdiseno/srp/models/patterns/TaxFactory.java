package edu.patronesdiseno.srp.models.patterns;

import edu.patronesdiseno.srp.models.impl.IGVTax;
import edu.patronesdiseno.srp.models.impl.ISCTax;
import edu.patronesdiseno.srp.models.interfaces.ITax;

public class TaxFactory {

    public static final String IGV_TAX = "IGV";
    public static final String ISC_TAX = "ISC";

    private TaxFactory(){

    }

    public static ITax createTax(String taxType){
        switch(taxType){
            case IGV_TAX : return new IGVTax();
            case ISC_TAX : return new ISCTax();
            default : return null;
        }
    }

}
