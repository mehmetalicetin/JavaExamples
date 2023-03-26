package com.cetin.optional.cust;

import java.util.Optional;

import static com.cetin.optional.cust.Customer.getCustomer;

public class Run {
    public static void main(String[] args) {
        Optional<Customer> opt = getCustomer();
        Optional<ZipCode> optionalZipCode = opt.flatMap(Customer::getAddress).flatMap(Address::getZipCode);

        //Optional<ZipCode> optionalZipCode1 = opt.map(Customer::getAddress).map(Address::getZipCode);
    }
}
