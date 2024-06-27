package pieces;
import main.Board;

import java.awt.image.BufferedImage;

public class Queen extends Piece{
    public Queen(Board board, int col, int row, boolean isWhite){
        super(board);
        this.col = col;
        this.row = row;
        this.isWhite = isWhite;
        this.xPos = col*board.tileSize;
        this.yPos = row*board.tileSize;
        this.name = "Knight";

        this.sprite = sheet.getSubimage(1*sheetScale, isWhite?0:sheetScale, sheetScale, sheetScale).getScaledInstance(board.tileSize, board.tileSize, BufferedImage.SCALE_SMOOTH);
    }
}