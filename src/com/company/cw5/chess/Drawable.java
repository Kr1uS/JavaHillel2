package com.company.cw5.chess;

public interface Drawable {
    default void draw() {
        System.out.println("default");
    }
}
