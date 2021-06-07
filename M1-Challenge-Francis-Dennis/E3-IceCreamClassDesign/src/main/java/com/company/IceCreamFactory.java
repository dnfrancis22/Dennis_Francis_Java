package com.company;

import java.util.Objects;

public class IceCreamFactory {

    //  instance variables
    private String flavor;
    private int caseQty;
    private double pricePerCase;
    private int cartonsPerCase;

    //  Generated constructor with instance variables as parameters
    public IceCreamFactory(String flavor, int caseQty, double pricePerCase, int cartonsPerCase) {
        this.flavor = flavor;
        this.caseQty = caseQty;
        this.pricePerCase = pricePerCase;
        this.cartonsPerCase = cartonsPerCase;
    }

    //  getters and setters
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public int getCaseQty() {
        return caseQty;
    }

    public void setCaseQty(int caseQty) {
        this.caseQty = caseQty;
    }

    public double getPricePerCase() {
        return pricePerCase;
    }

    public void setPricePerCase(double pricePerCase) {
        this.pricePerCase = pricePerCase;
    }

    public int getCartonsPerCase() {
        return cartonsPerCase;
    }

    public void setCartonsPerCase(int cartonsPerCase) {
        this.cartonsPerCase = cartonsPerCase;
    }

    @Override
    //  Generated equals
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IceCreamFactory that = (IceCreamFactory) o;
        return caseQty == that.caseQty && Double.compare(that.pricePerCase, pricePerCase) == 0 && cartonsPerCase == that.cartonsPerCase && Objects.equals(flavor, that.flavor);
    }

    @Override
    //  Generated hashcode
    public int hashCode() {
        return Objects.hash(flavor, caseQty, pricePerCase, cartonsPerCase);
    }

    @Override
    //  Generated toString
    public String toString() {
        return "IceCreamFactory{" +
                "flavor='" + flavor + '\'' +
                ", caseQty=" + caseQty +
                ", pricePerCase=" + pricePerCase +
                ", cartonsPerCase=" + cartonsPerCase +
                '}';
    }
}
