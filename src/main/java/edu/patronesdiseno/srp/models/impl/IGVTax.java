package edu.patronesdiseno.srp.models.impl;

import edu.patronesdiseno.srp.models.interfaces.ITax;

public class IGVTax implements ITax {

    private Double percentage;

    public IGVTax() {
        this.percentage = 0.18;
    }

    @Override
    public Double getTax() {
        return this.percentage;
    }
}
