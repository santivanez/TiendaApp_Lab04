package edu.patronesdiseno.srp.models.impl;

import edu.patronesdiseno.srp.models.patterns.ITax;

// Impuesto selectivo al consumo
public class ISCTax implements ITax {

    private Double percentage;

    public ISCTax() {
        this.percentage = 0.1;
    }

    @Override
    public Double getTax() {
        return this.percentage;
    }

}
