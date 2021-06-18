package com.bridgelabz;

public class InvoiceGenerator {

    private static final double MIN_FARE_PER_KM = 10.0;
    private static final int MIN_FARE_PER_MIN = 1;
    private static final double MIN_FARE = 5.0;

    public double calculateFare(double distance, int time){
     double totalFare = distance * MIN_FARE_PER_KM + time * MIN_FARE_PER_MIN;
       if(totalFare <= MIN_FARE)
           return MIN_FARE;
           return totalFare;
  }

}
