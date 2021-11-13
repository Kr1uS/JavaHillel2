package com.company.cw5.chess.items;

import com.company.cw5.chess.Drawable;

public interface Item extends Drawable, HasValue {

    int getX();
    int getY();

}
