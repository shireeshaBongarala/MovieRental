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
            totalAmount += calculateAmount(rental);
            totalPoints  += calculatePoints(rental);
        }

        return "Total Amount : " + totalAmount + "\n" + "Total Points Earned: " + totalPoints + "\n";
    }

    private int calculatePoints(Rental rental) {
        int points =0;
        if(rental.get_movie().get_priceCode()== Movie.NEW_RELEASE){
            points += rental.get_daysRented() - 2;
        }
        points++;
        return points;
    }

    private double calculateAmount(Rental rental) {
        double amount =0;
        switch (rental.get_movie().get_priceCode()) {
            case Movie.REGULAR:
                amount += 20;
                if (rental.get_daysRented() > 2) {
                    amount += (rental.get_daysRented() - 2) * 15;
                }
                break;
            case Movie.CHILDRENS:
                amount += 15;
                if (rental.get_daysRented() > 2) {
                    amount += (rental.get_daysRented() - 2) * 10;
                }
                break;
            case Movie.NEW_RELEASE:
                amount += 50;
                if (rental.get_daysRented() > 2) {
                    amount += (rental.get_daysRented() - 2) * 25;

                }
                break;

        }
        return amount;
    }
}
