package com.company;

import java.util.Objects;

public class IceCreamShop {

//  instance variables
    private String flavor;
    private int scoopQty;
    private double pricePerScoop;
    private boolean cone;
    private boolean cup;

//  Generated constructor with instance variables as parameters
    public IceCreamShop(String flavor, int scoopQty, double pricePerScoop, boolean cone, boolean cup) {
        this.flavor = flavor;
        this.scoopQty = scoopQty;
        this.pricePerScoop = pricePerScoop;
        this.cone = cone;
        this.cup = cup;
    }

//  getters and setters
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public int getScoopQty() {
        return scoopQty;
    }

    public void setScoopQty(int scoopQty) {
        this.scoopQty = scoopQty;
    }

    public double getPricePerScoop() {
        return pricePerScoop;
    }

    public void setPricePerScoop(double pricePerScoop) {
        this.pricePerScoop = pricePerScoop;
    }

    public boolean isCone() {
        return cone;
    }

    public void setCone(boolean cone) {
        this.cone = cone;
    }

    public boolean isCup() {
        return cup;
    }

    public void setCup(boolean cup) {
        this.cup = cup;
    }

    @Override
    //  Generated equals
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IceCreamShop that = (IceCreamShop) o;
        return scoopQty == that.scoopQty && Double.compare(that.pricePerScoop, pricePerScoop) == 0 && cone == that.cone && cup == that.cup && Objects.equals(flavor, that.flavor);
    }

    @Override
    //  Generated hashcode
    public int hashCode() {
        return Objects.hash(flavor, scoopQty, pricePerScoop, cone, cup);
    }

    @Override
    //  Generated toString
    public String toString() {
        return "IceCreamShop{" +
                "flavor='" + flavor + '\'' +
                ", scoopQty=" + scoopQty +
                ", pricePerScoop=" + pricePerScoop +
                ", cone=" + cone +
                ", cup=" + cup +
                '}';
    }
}
