package com.example.snelms.collapse.model;

/**
 * Created by snelms on 3/16/15.
 */
public class Piece {


    String mColor;
    int mNumber;

    public String getColor() {
        return mColor;
    }

    public void setColor(String color) {
        mColor = color;
    }

    public int getNumber() {
        return mNumber;
    }

    public void setNumber(int number) {
        mNumber = number;
    }


    public Piece(String color, int number) {
        mColor = color;
        mNumber = number;
    }



}




