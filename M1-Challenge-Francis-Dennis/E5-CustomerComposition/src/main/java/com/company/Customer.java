package com.company;

import java.util.Objects;

public class Customer {

    private Profile customerProfile;
    private Address shippingAddress;
    private Address billingAddress;

    public Customer() {
    }

    public Customer(Profile customProfile, Address shippingAddress, Address billingAddress) {
        this.customerProfile = customProfile;
        this.shippingAddress = shippingAddress;
        this.billingAddress = billingAddress;
    }

    public Profile getCustomerProfile() {
        return customerProfile;
    }

    public void setCustomerProfile(Profile customerProfile) {
        this.customerProfile = customerProfile;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(customerProfile, customer.customerProfile) && Objects.equals(shippingAddress, customer.shippingAddress) && Objects.equals(billingAddress, customer.billingAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerProfile, shippingAddress, billingAddress);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerProfile=" + customerProfile +
                ", shippingAddress=" + shippingAddress +
                ", billingAddress=" + billingAddress +
                '}';
    }
}
