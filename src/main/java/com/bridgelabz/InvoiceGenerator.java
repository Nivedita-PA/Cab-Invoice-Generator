package com.bridgelabz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class InvoiceGenerator {

    private static final double MIN_FARE_PER_KM = 10.0;
    private static final int MIN_FARE_PER_MIN = 1;
    private static final double MIN_FARE = 5.0;

    ArrayList<Ride> rides = new ArrayList<>();
    Map<Integer,ArrayList<Ride>> user = new HashMap<>();


    //Now taking this calculateFare as a local method//
    public double calculateFare(double distance, int time){
     double Fare = distance * MIN_FARE_PER_KM + time * MIN_FARE_PER_MIN;
       if(Fare <= MIN_FARE)
           return MIN_FARE;
           return Fare;
  }

  public InvoiceSummary calculateFare(ArrayList<Ride> rides){
        double totalFare = 0;
      for (Ride ride : rides) {
       totalFare += this.calculateFare(ride.distance, ride.time);//+totalFare
      }
      return new InvoiceSummary(rides.size(),totalFare);
  }

    public InvoiceSummary calculateFare(Map<Integer,ArrayList<Ride>> userRides) {
        ArrayList<Ride> rides = new ArrayList<>();
        double userFare = 0;
        Integer id = 0;
        for (Ride ride : rides) {
            userFare += this.calculateFare(ride.distance, ride.time);
        }
        userRides.put(id,rides);
        return new InvoiceSummary(userRides.size(),userFare);

    }
}
