package com.bridgelabz;

public class InvoiceGenerator {

    private static final double MIN_FARE_PER_KM = 10.0;
    private static final int MIN_FARE_PER_MIN = 1;

    public double calculateFare(double distance, int time){
      return distance * MIN_FARE_PER_KM + time * MIN_FARE_PER_MIN;
  }

}
