package edu.patronesdiseno.srp.models.interfaces;

import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import edu.patronesdiseno.srp.models.*;
import edu.patronesdiseno.srp.models.impl.OrderItemPromocion;
import edu.patronesdiseno.srp.models.impl.OrderItemInternet;

@JsonTypeInfo(use =JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({ @Type(value = OrderItemPromocion.class, name= "orderitempromocion"), 
                @Type(value = OrderItemInternet.class, name= "orderiteminternet")} )
public interface IOrderItem {
    //Order order = null;
    //Product product = null;
    String idProduct = null;
    Integer quantity = null;
    Double price = null;

    public Double calculatePrice();

    public Order getOrder();

    public void setOrder(Order order);

    //public Product getProduct();

    public String getIdProduct();

    public Integer getQuantity();

    //public void setQuantity();

    public Double getPrice();

}