package com.example.snelms.collapse;

import android.app.Activity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.GridLayout;
import android.widget.TextView;

import com.example.snelms.collapse.model.Board;
import com.example.snelms.collapse.ui.PieceView;

import org.xmlpull.v1.XmlPullParser;


public class Collapse extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collapse);


//        GridLayout myLayout = (GridLayout) findViewById(R.id.gameBoard);
//
//        XmlPullParser parser = (XmlPullParser) getResources().st(R.style.piece);
//        AttributeSet attributes = Xml.asAttributeSet(parser);
//
//        PieceView pieceView = new PieceView(this, sty);
//        pieceView.setLayoutParams(new GridLayout.LayoutParams(
//                GridLayout.LayoutParams.FILL_PARENT,
//                GridLayout.LayoutParams.FILL_PARENT));
//
//        myLayout.addView(pieceView);



        TextView gameBoard = (TextView) findViewById(R.id.gameBoard);

        Board game = new Board(3, 3);

        String gamePrint = "";

        for(int i=0; i<3; i++){
            gamePrint += "\n";
            for(int j=0; j<3; j++){
                gamePrint += game.getLayout()[i][j].getColor();
                gamePrint += "\t";
            }
        }


        gameBoard.setText(gamePrint);

    }

}
