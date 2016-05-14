package com.tw.objectbootcamp.MovieRentalProblem;


public class Rental {

    private Movie _movie;
    private int _daysRented;

    public Rental(Movie _movie, int _daysRented) {
        this._movie = _movie;
        this._daysRented = _daysRented;
    }

    public Movie get_movie() {
        return _movie;
    }

    public int get_daysRented() {
        return _daysRented;
    }

    public double calculateAmount() {
        double amount =0;
        switch (get_movie().get_priceCode()) {
            case Movie.REGULAR:
                amount += 20;
                if (get_daysRented() > 2) {
                    amount += (get_daysRented() - 2) * 15;
                }
                break;
            case Movie.CHILDRENS:
                amount += 15;
                if (get_daysRented() > 2) {
                    amount += (get_daysRented() - 2) * 10;
                }
                break;
            case Movie.NEW_RELEASE:
                amount += 50;
                if (get_daysRented() > 2) {
                    amount += (get_daysRented() - 2) * 25;

                }
                break;

        }
        return amount;
    }

    public int calculatePoints() {
        int points =0;
        if(get_movie().get_priceCode()== Movie.NEW_RELEASE){
            points += get_daysRented() - 2;
        }
        points++;
        return points;
    }
}
