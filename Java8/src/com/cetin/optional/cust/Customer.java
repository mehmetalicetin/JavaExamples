package com.cetin.optional.cust;

import java.util.Optional;

public class Customer {
    Optional<Address> address;

    public Optional<Address> getAddress() {
        return address;
    }

    public static Optional<Customer> getCustomer(){
        return Optional.ofNullable(new Customer());
    }
}
