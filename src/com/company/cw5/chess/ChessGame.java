package com.company.cw5.chess;

import com.company.cw5.chess.items.ChessItem;
import com.company.cw5.chess.items.Pawn;
import com.company.cw5.chess.items.Queen;

public class ChessGame {

    public static final ChessDesk desk = new ChessDesk();

    public static void main(String[] args) {
        desk.draw();

        ChessItem item1 = desk.createItem(new Queen());
        ChessItem item2 = desk.createItem(new Pawn());

        boolean isQueen1 = item1 instanceof Queen;

        if (isQueen1) {
        Queen queen = (Queen) item1;
        queen.place(2, 3);
        }

        desk.placeItems(item1);
        desk.placeItems(item2);
    }

}
