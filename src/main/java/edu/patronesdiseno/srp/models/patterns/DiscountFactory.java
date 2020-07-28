package edu.patronesdiseno.srp.models.patterns;

import edu.patronesdiseno.srp.models.impl.AnniversaryDiscount;
import edu.patronesdiseno.srp.models.impl.CouponDiscount;
import edu.patronesdiseno.srp.models.interfaces.IDiscount;

public class DiscountFactory {
    
    public static final String DISCOUNT_COUPON = "Coupon";
    public static final String DISCOUNT_ANNIVERSARY = "Anniversary";
    
    private static DiscountFactory instance;

    private DiscountFactory(){}
    
    public static DiscountFactory getFactory(){
        if(instance == null)
            instance= new DiscountFactory();
        return instance;
    }
    
    public IDiscount createDiscount(String typeDiscount)   {

        switch(typeDiscount){
            case DISCOUNT_COUPON :  
                                    return new CouponDiscount();
            case DISCOUNT_ANNIVERSARY : 
                                    return new AnniversaryDiscount();
            default : return null;
        }
    }    
//        
//        if (typeDiscount.equals(DISCOUNT_COUPON))  {
//
//            return new CouponDiscount();
//        }
//        
//        if (typeDiscount.equals(DISCOUNT_ANNIVERSARY))  {
//
//            return new AnniversaryDiscount();
//        }        
//        else {
//
//            return null;
//        }
    
}