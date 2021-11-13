package com.company.cw5.chess;

import com.company.cw5.chess.items.Pawn;
import com.company.cw5.chess.items.Queen;
import com.company.cw5.chess.items.ChessItem;

public class ChessDesk implements Drawable{

    public ChessItem createItem(ChessItem chessItem) {
        ChessItem item = chessItem;
        return item;
    }

    public void placeItems(ChessItem item) {
        item.draw();
    }

    @Override
    public void draw() {
        System.out.println("Chess desk");
    }
}
