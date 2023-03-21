package com.aptech.test;

public class PriceCalculator {
    /**
     * @return the final price of the product to show in the UI.
     * @param basePrice the base price of the [Product].
     */
    public  double finalPrice(double basePrice){
        return  basePrice * 1.5;
    }
}
