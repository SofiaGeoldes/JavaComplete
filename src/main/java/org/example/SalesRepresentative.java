package org.example;

public class SalesRepresentative implements Comparable {
    private int amountOfRevenue;
    private int numberOfSales;
    private int quota;

    public SalesRepresentative(int numberOfSales, int quota) {
        this.numberOfSales = numberOfSales;
        this.quota = quota;
    }



    @Override
    public int compareTo(Object o) {
        amountOfRevenue = numberOfSales + quota;
        SalesRepresentative salesRepresentative2 = (SalesRepresentative) o; //casting
        int salesRepresentative2AmountOfRevenue = salesRepresentative2.numberOfSales * salesRepresentative2.quota;
        return (amountOfRevenue - salesRepresentative2AmountOfRevenue) * (-1);     //pozitiv, negativ sau 0 - contractul de la comparable; le-am inversat directia inmultind cu -1
    }

        @Override
        public String toString() {
            return "SalesRepresentative{" +
                    "amountOfRevenue=" + amountOfRevenue +
                    ", numberOfSales=" + numberOfSales +
                    ", quota=" + quota +
                    '}' + "\n";
        }

    }

