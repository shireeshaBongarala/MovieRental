package com.tw.objectbootcamp.MovieRentalProblem;


public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String _title;
    private int _priceCode;

    public Movie(String _title, int _priceCode) {
        this._title = _title;
        this._priceCode = _priceCode;
    }

    public String get_title() {
        return _title;
    }

    public int get_priceCode() {
        return _priceCode;
    }

    public double calculateAmount(int daysRented) {
        double amount =0;
        switch (get_priceCode()) {
            case REGULAR:
                amount += 20;
                if (daysRented > 2) {
                    amount += (daysRented - 2) * 15;
                }
                break;
            case CHILDRENS:
                amount += 15;
                if (daysRented > 2) {
                    amount += (daysRented - 2) * 10;
                }
                break;
            case NEW_RELEASE:
                amount += 50;
                if (daysRented > 2) {
                    amount += (daysRented - 2) * 25;

                }
                break;

        }
        return amount;
    }
}
