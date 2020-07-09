package edu.patronesdiseno.srp.models.patterns;

import edu.patronesdiseno.srp.models.LineProduct;
import edu.patronesdiseno.srp.models.LowRangeLineProduct;
import edu.patronesdiseno.srp.models.Maintenance;
import edu.patronesdiseno.srp.models.StandardMaintenance;

public class LowProductFactory implements IProductFactory {

    @Override
    public LineProduct getLineProduct() {

        return new LowRangeLineProduct();
    }

    @Override
    public Maintenance getMaintenance() {

        return new StandardMaintenance();
    }
    
}