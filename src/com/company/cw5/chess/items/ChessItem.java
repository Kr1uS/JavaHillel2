package com.company.cw5.chess.items;

public abstract class ChessItem implements Item {
    private int x, y;
    private int value;

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public int getValue() {
        return value;
    }
}
