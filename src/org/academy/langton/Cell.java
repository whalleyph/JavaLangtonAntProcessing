package org.academy.langton;

public class Cell {
    private CellColour colour;
    private final GridPosition gridPosition;

    public Cell(int x, int y){
        gridPosition = new GridPosition(x, y);
        colour = CellColour.WHITE;
    }

    public CellColour toggleColour(){
        switch (colour) {
            case CellColour.WHITE -> colour = CellColour.BLACK;
            case CellColour.BLACK -> colour = CellColour.RED;
            case CellColour.RED -> colour = CellColour.WHITE;
        }
        return colour;
    }

    public CellColour colour() {
        return colour;
    }

    public GridPosition gridPosition(){
        return gridPosition;
    }
}
