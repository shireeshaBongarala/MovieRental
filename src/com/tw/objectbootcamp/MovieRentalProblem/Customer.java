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

        return "Total Amount : " + getTotalAmount() + "\n" + "Total Points Earned: " + getTotalPoints() + "\n";
    }

    private int getTotalPoints() {
        int totalPoints = 0;
        for (Rental rental : rentalList) {
            totalPoints  += rental.calculatePoints();
        }
        return totalPoints;
    }

    public double getTotalAmount(){
        double totalAmount =0;
        for(Rental rental : rentalList){
            totalAmount+= rental.calculateAmount();
        }
        return totalAmount;
    }

}
