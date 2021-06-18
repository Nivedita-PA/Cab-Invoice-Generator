package com.bridgelabz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InvoiceServiceTest {
    InvoiceGenerator invoiceGenerator = null;

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
      Ride[] rides = {new Ride(2.0,5),
                      new Ride(0.1,1)};
      InvoiceSummary invoicesummary = invoiceGenerator.calculateFare(rides);
      InvoiceSummary expectedInvoiceSummary = new InvoiceSummary(2,30.0);
      Assert.assertEquals(expectedInvoiceSummary,invoicesummary);
    }


}
