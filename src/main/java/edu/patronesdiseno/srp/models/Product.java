package edu.patronesdiseno.srp.models;

import edu.patronesdiseno.srp.models.patterns.HighProductFactory;
import edu.patronesdiseno.srp.models.patterns.LowProductFactory;

public class Product {
    private String id;
    private String name;
    private Double basePrice;
    private String lineProduct;
    private String maintenance;

    public Product(String id)   {
        this.id = id;
    }    

    public String getId() {
        return id;
    }

    public Double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(Double basePrice) {
        this.basePrice = basePrice;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLineProduct() {
        return lineProduct;
    }

    public void setLineProduct(String lineProduct) {
        this.lineProduct = lineProduct;
    }

    public String getMaintenance() {
        return maintenance;
    }

    public void setMaintenance(String maintenance) {
        this.maintenance = maintenance;
    }

    public Product()   {

        //HighProductFactory factoryProduct = new HighProductFactory();
        LowProductFactory  factoryProduct = new LowProductFactory();

        this.lineProduct = factoryProduct.getLineProduct().getLine();
        this.maintenance = factoryProduct.getMaintenance().getPeriod();
    }
}