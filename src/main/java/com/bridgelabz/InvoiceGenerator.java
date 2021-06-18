package com.bridgelabz;

public class InvoiceGenerator {

    private static final double MIN_FARE_PER_KM = 10.0;
    private static final int MIN_FARE_PER_MIN = 1;
    private static final double MIN_FARE = 5.0;

    //Now taking this calculateFare as a local variable//
    public double calculateFare(double distance, int time){
     double Fare = distance * MIN_FARE_PER_KM + time * MIN_FARE_PER_MIN;
       if(Fare <= MIN_FARE)
           return MIN_FARE;
           return Fare;
  }

  public double calculateFare(Ride[] rides){
        double totalFare = 0;
      for (Ride ride : rides) {
       totalFare += this.calculateFare(ride.distance, ride.time);//+totalFare
      }
      return totalFare;
  }

}
