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
        //calculates total amount, total points and returns the statement
        double totalAmount = 0;
        int points = 0;
        for (Rental rental : rentalList) {
            switch (rental.get_movie().get_priceCode()) {
                case Movie.REGULAR:
                    totalAmount += 20;
                    if (rental.get_daysRented() > 2) {
                        totalAmount += (rental.get_daysRented() - 2) * 15;
                    }
                    break;
                case Movie.CHILDRENS:
                    totalAmount += 15;
                    if (rental.get_daysRented() > 2) {
                        totalAmount += (rental.get_daysRented() - 2) * 10;
                    }
                    break;
                case Movie.NEW_RELEASE:
                    totalAmount += 50;
                    if (rental.get_daysRented() > 2) {
                        totalAmount += (rental.get_daysRented() - 2) * 25;
                        points += rental.get_daysRented() - 2;
                    }
                    break;

            }
            points++;

        }

        return "Total Amount : " + totalAmount + "\n" + "Total Points Earned: " + points + "\n";
    }
}
