package com.example.snelms.collapse.model;

import android.util.Log;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by snelms on 3/16/15.
 */
public class Board {

    // CONSTANTS
    private static final int SIZE = 3;
    private static final String COLORS[] = new String[] {"RED", "GREEN", "BLUE", "YELLOW"};

    public Piece[][] getLayout() {
        return mLayout;
    }

    public void setLayout(Piece[][] layout) {
        mLayout = layout;
    }

    // MEMBER VARIABLES
    Piece[][] mLayout = new Piece[SIZE][SIZE];

    public Board(int colors, int numbers) {

        Random randomGenerator = new Random();
        int randomColor;
        int randomNumber;

        String color;
        int number;


        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                randomColor = randomGenerator.nextInt(colors);
                randomNumber = randomGenerator.nextInt(numbers) + 1;

                Piece piece = new Piece(COLORS[randomColor], randomNumber);

                mLayout[i][j] = piece;
            }
        }
    }


}
