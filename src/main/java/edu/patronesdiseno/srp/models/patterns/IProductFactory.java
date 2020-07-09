package edu.patronesdiseno.srp.models.patterns;

import edu.patronesdiseno.srp.models.LineProduct;
import edu.patronesdiseno.srp.models.Maintenance;

public interface IProductFactory {

    public LineProduct getLineProduct();

    public Maintenance getMaintenance();
}