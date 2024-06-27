package main;

import pieces.*;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Board extends JPanel {
    public int tileSize = 85;
    int cols = 8;
    int rows = 8;

    ArrayList<Piece> pieceArrayList = new ArrayList<>();

    public Board(){
        this.setPreferredSize(new Dimension(cols*tileSize, rows* tileSize));
        this.setBackground(Color.green);
        addPieces();
    }

    public void addPieces(){
        pieceArrayList.add(new Rook(this, 0, 0, false));
        pieceArrayList.add(new Knight(this, 1, 0, false));
        pieceArrayList.add(new Bishop(this, 2, 0, false));
        pieceArrayList.add(new Queen(this, 3, 0, false));
        pieceArrayList.add(new King(this, 4, 0, false));
        pieceArrayList.add(new Bishop(this, 5, 0, false));
        pieceArrayList.add(new Knight(this, 6, 0, false));
        pieceArrayList.add(new Rook(this, 7, 0, false));

        for (int i = 0; i < 8; i++) {
            pieceArrayList.add(new Pawn(this, i, 1, false));
            pieceArrayList.add(new Pawn(this, i, 6, false));
        }


        pieceArrayList.add(new Rook(this, 0, 0, true));
        pieceArrayList.add(new Knight(this, 1, 0, true));
        pieceArrayList.add(new Bishop(this, 2, 0, true));
        pieceArrayList.add(new Queen(this, 3, 0, true));
        pieceArrayList.add(new King(this, 4, 0, true));
        pieceArrayList.add(new Bishop(this, 5, 0, true));
        pieceArrayList.add(new Knight(this, 6, 0, true));
        pieceArrayList.add(new Rook(this, 7, 0, true));
    }

    public void paintComponent(Graphics g){
        Graphics2D g2D = (Graphics2D) g;
        for(int r=0; r<rows; r++){
            for(int c = 0; c<cols; c++){
                Color color = (c+r)%2==0?new Color(227,198,181):new Color(157,105,53);
                g2D.setColor(color);
                g2D.fillRect(c*tileSize, r*tileSize, tileSize, tileSize);
            }
        }

        for(Piece piece: pieceArrayList){
            piece.paint(g2D);
        }
    }
}
