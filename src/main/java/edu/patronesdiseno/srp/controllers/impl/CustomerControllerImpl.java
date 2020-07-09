package edu.patronesdiseno.srp.controllers.impl;

import edu.patronesdiseno.srp.config.Paths;
//import edu.patronesdiseno.srp.config.Paths;
import edu.patronesdiseno.srp.controllers.CustomerController;
import edu.patronesdiseno.srp.models.Customer;
import edu.patronesdiseno.srp.repositories.CustomerRepository;
import io.javalin.http.Context;
import io.javalin.http.BadRequestResponse;
import io.javalin.http.NotFoundResponse;
//import org.bson.types.ObjectId;
import org.eclipse.jetty.http.HttpHeader;
import org.eclipse.jetty.http.HttpStatus;


public class CustomerControllerImpl implements CustomerController {
    private static final String ID = "id";

    private CustomerRepository customerRepository;

    public CustomerControllerImpl(CustomerRepository postRepository) {
        this.customerRepository = postRepository;
    }

    @Override
    public void create(Context context) {

        Customer customer = context.bodyAsClass(Customer.class);
        System.out.println("Cliente: " + customer);

        //if (customer.getId() != null) {
        //    throw new BadRequestResponse(String.format("Unable to create a new post with existing id: %s", customer));
        //}

        customerRepository.create(customer);
        context.status(HttpStatus.CREATED_201)
                .header(HttpHeader.LOCATION.name(), Paths.formatPostLocation(customer.getId().toString()));

    }

    @Override
    public void delete(Context context) {
        customerRepository.delete(context.pathParam(ID));

    }

    @Override
    public void find(Context context) {
        String id = context.pathParam(ID);
        Customer customer = customerRepository.find(id);

        if (customer == null) {
            throw new NotFoundResponse(String.format("A customer with id '%s' is not found", id));
        }

        context.json(customer);

    }

    @Override
    public void findAll(Context context) {
        context.json(customerRepository.findAll());
    }

    @Override
    public void update(Context context) {
        Customer customer = context.bodyAsClass(Customer.class);
        String id = context.pathParam(ID);

        if (customer.getId() != null && !customer.getId().toString().equals(id)) {
            throw new BadRequestResponse("Id update is not allowed");
        }

        customerRepository.update(customer, id);

    }
    
}