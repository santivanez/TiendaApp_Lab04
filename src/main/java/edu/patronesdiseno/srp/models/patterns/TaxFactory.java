package edu.patronesdiseno.srp.models.patterns;

import edu.patronesdiseno.srp.models.impl.AnniversaryDiscount;
import edu.patronesdiseno.srp.models.impl.CouponDiscount;
import edu.patronesdiseno.srp.models.impl.IGVTax;
import edu.patronesdiseno.srp.models.impl.ISCTax;
import edu.patronesdiseno.srp.models.interfaces.IDiscount;

public class TaxFactory {

    public static final String IGV_TAX = "IGV";
    public static final String ISC_TAX = "ISC";

    private static ITax taxValue;

    private TaxFactory(){

    }

    public static ITax createTax(String taxType){
        switch(taxType){
            case IGV_TAX :  if(taxValue == null)
                                taxValue = new IGVTax();
                            return taxValue;
            case ISC_TAX : if(taxValue == null)
                                taxValue = new ISCTax();
                            return taxValue;
            default : return null;
        }
    }

}
