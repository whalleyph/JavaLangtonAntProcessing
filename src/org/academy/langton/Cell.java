package org.academy.langton;

public class Cell {
    private String colour;
    private final GridPosition gridPosition;

    public Cell(int x, int y){
        gridPosition = new GridPosition(x, y);
        colour = "white";
    }

    public String toggleColour(){
        switch (colour) {
            case "white" -> colour = "black";
            case "black" -> colour = "red";
            case "red" -> colour = "white";
        }
        return colour;
    }

    public void setColour(String value){
        colour = value;
    }

    public String colour() {
        return colour;
    }

    public GridPosition gridPosition(){
        return gridPosition;
    }
}
