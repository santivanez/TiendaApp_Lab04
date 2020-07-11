package edu.patronesdiseno.srp.models.patterns;

import edu.patronesdiseno.srp.models.impl.AnniversaryDiscount;
import edu.patronesdiseno.srp.models.impl.CouponDiscount;
import edu.patronesdiseno.srp.models.interfaces.IDiscount;

public class DiscountFactory {
    
    public static final String DISCOUNT_COUPON = "Coupon";
    public static final String DISCOUNT_ANNIVERSARY = "Anniversary";
    
    private static IDiscount instanceCoupon;
    private static IDiscount instanceAnniversary;

    private DiscountFactory(){
    
    }
    public static IDiscount createDiscount(String typeDiscount)   {

        switch(typeDiscount){
            case DISCOUNT_COUPON :  if(instanceCoupon == null)
                                         instanceCoupon = new CouponDiscount();
                                    return instanceCoupon;
            case DISCOUNT_ANNIVERSARY : if(instanceCoupon == null)
                                            instanceAnniversary = new AnniversaryDiscount();
                                        return instanceAnniversary;
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