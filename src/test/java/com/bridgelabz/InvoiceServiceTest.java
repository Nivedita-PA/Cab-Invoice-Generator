package com.bridgelabz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class InvoiceServiceTest {
    InvoiceGenerator invoiceGenerator = null;
    ArrayList<Ride> rides = new ArrayList<>();
    Map<Integer,ArrayList<Ride>> userRides = new HashMap<>();

    @Before
    public void setup() throws Exception {
        invoiceGenerator = new InvoiceGenerator();
    }

    @Test
    public void given_DistanceAnd_Time_Should_Return_TotalFare(){
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        double distance = 2.0;
        int time = 5;
        double totalFare = invoiceGenerator.calculateFare(distance, time);
        Assert.assertEquals(25, totalFare,0.0);
    }

    @Test
    public void given_LessDistance_AndTime_Should_Return_Minimum_Fare() {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        double distance = 0.1;
        int time = 1;
        double totalFare = invoiceGenerator.calculateFare(distance, time);
        Assert.assertEquals(5,totalFare,0.0);
    }

    @Test
    public void given_Multiple_Rides_Should_ReturnInvoiceSummary() {
      InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
       rides.add(new Ride(5,2));
       rides.add(new Ride(4,7));
      InvoiceSummary invoicesummary = invoiceGenerator.calculateFare(rides);
      InvoiceSummary expectedInvoiceSummary = new InvoiceSummary(2,99);
      Assert.assertEquals(expectedInvoiceSummary,invoicesummary);
    }

    @Test
    public void given_Multiple_Rides_By_UserID_Should_ReturnInvoiceSummary() {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        rides.add(new Ride(5,2));
        rides.add(new Ride(4,7));
        userRides.put(022,rides);
        InvoiceSummary invoicesummary = invoiceGenerator.calculateFare(userRides);
        InvoiceSummary expectedInvoiceSummary = new InvoiceSummary(2,99);
        Assert.assertEquals(expectedInvoiceSummary,invoicesummary);
    }
}
