package com.tw.objectbootcamp.MovieRentalProblem;


import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String _name;
    private List<Rental> rentalList = new ArrayList<Rental>();

    public Customer(String _name, List<Rental> rentalList) {
        this._name = _name;
        this.rentalList = rentalList;
    }

    public void addRental(Rental rental) {
        rentalList.add(rental);
    }

    public String get_name() {
        return _name;
    }

    public String getStatement() {
        double totalAmount = 0;
        int totalPoints = 0;
        for (Rental rental : rentalList) {
            totalAmount += rental.calculateAmount();
            totalPoints  += rental.calculatePoints();
        }

        return "Total Amount : " + totalAmount + "\n" + "Total Points Earned: " + totalPoints + "\n";
    }

}
