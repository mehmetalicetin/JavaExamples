package com.cetin.optional.cust;

import java.util.Optional;

public class Address {
    Optional<ZipCode> zipCode;

    public Optional<ZipCode> getZipCode() {
        return zipCode;
    }
}
