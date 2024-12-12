package org.example;

import java.util.TreeSet;

/**
 * Hello world!
 * DESCRIPTION
 *
 * implement a bubble sort algorithm to sort an array of SalesRepresentative objects in descending order
 * the sorting should be done based on the amount of revenue generated via sales
 * each representative has a number of sales, and a quota / sale
 * after the sorting, the first object should be the representative with the most revenue generated
 * the last object in the array should be the representative with the least revenue generated
 * e.g.
 *
 * sales guy 1 has 10 sales with a quota of 500$. He has achieved 5000$ worth of sales
 * sales guy 2 has 7 sales with a quota of 800$. He has achieved 5600$ worth of sales
 *
 *
 * Sorting code example
 *
 * SalesRepresentative [ ] representatives = ...
 *
 * SalesRepresentative [ ] sortedRepresentatives = sort(representatives);
 *
 * // you need to implement the sort(SalesRepresentative [ ] representatives) method. This can not be a static method.
 *
 *
 *
 * NOTES
 *
 * respecting the naming conventions
 * JavaDoc
 * the code compiles
 * Main class and algorithm classes must be separate
 * homework must be pushed to GIT
 *
 * Subiectiv
 * SalesRepresentative
 * amount of revenue
 * number of sales
 * price
 *
 * Verbe
 * sort()
 *
 * Obiecte
 * SalesRepresentative
 *
 *
 *
 *
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        TreeSet<SalesRepresentative> representatives = new TreeSet<>();
        SalesRepresentative representative1 = new SalesRepresentative(10, 40);
        SalesRepresentative representative2 = new SalesRepresentative(10, 30);
        SalesRepresentative representative3 = new SalesRepresentative(10, 50);
        SalesRepresentative representative4 = new SalesRepresentative(10, 60);

        representatives.add(representative1);
        representatives.add(representative2);
        representatives.add(representative3);
        representatives.add(representative4);

        System.out.println(representatives);
    }
}
