package pieces;

import main.Board;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Piece {

    public int col, row, xPos, yPos;
    public boolean isWhite;
    public String name;
    public int value;

    BufferedImage sheet;
    {
        try {
            sheet = ImageIO.read(ClassLoader.getSystemResourceAsStream("pieces.png"));
        }catch (IOException error){
            error.printStackTrace();
        }
    }

    protected int sheetScale = sheet.getWidth()/6;

    Image sprite;

    Board board;

    public Piece(Board board) {
        this.board = board;
    }

    public void paint(Graphics2D graphics2D){
        graphics2D.drawImage(sprite, xPos, yPos, null);
    }

}
