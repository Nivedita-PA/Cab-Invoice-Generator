package com.bridgelabz;

import java.util.Objects;

public class InvoiceSummary {
    public final int totalRides;
    public final double totalFare;
    private final double avgFare;

    public InvoiceSummary(int totalRides, double totalFare) {
        this.totalRides = totalRides;
        this.totalFare = totalFare;
        this.avgFare = this.totalFare/this.totalRides;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InvoiceSummary)) return false;
        InvoiceSummary that = (InvoiceSummary) o;
        return totalRides == that.totalRides && Double.compare(that.totalFare, totalFare) == 0 && Double.compare(that.avgFare, avgFare) == 0;
    }

}
