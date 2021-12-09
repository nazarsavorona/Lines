package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Position {
    public int row;
    public int col;

    public Position(int row, int col) {
        this.col = col;
        this.row = row;
    }

    @Override
    public boolean equals(@Nullable Object obj) {
        Position other = (Position) obj;
        return (this.row == other.row) && (this.col == other.col);
    }

    @NonNull
    @Override
    public String toString() {
        return "(" + row + "," + col + ")";
    }
}
