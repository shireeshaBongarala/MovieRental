package com.tw.objectbootcamp.MovieRentalProblem;


public class Rental {

    Movie _movie;
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

    public int calculatePoints() {
        int points =0;
        if(get_movie().get_priceCode()== Movie.NEW_RELEASE){
            points += get_daysRented() - 2;
        }
        points++;
        return points;
    }

    public double calculateAmount(){
        return _movie.calculateAmount(_daysRented);
    }
}
