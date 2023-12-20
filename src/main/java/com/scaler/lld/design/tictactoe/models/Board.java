package com.scaler.lld.design.tictactoe.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Board {
    
    List<List<BoardCell>> cells = new ArrayList<>(); 

    public Board(int rows, int columns) {
        List<BoardCell> columnCells = Collections.nCopies(columns, new BoardCell());
        List<List<BoardCell>> rowCells = Collections.nCopies(rows, columnCells);
        this.cells = rowCells;
    }

    public void print() {
        
    }
}
