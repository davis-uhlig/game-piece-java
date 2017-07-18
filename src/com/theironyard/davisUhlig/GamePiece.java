package com.theironyard.davisUhlig;

/**
 * Created by duhlig on 7/18/17.
 */
public class GamePiece {
    int positionX;
    int positionY;
    boolean frozen;
    String color;
    String name;

    public GamePiece() {
        this.positionX = 0;
        this.positionY = 0;
        this.frozen = false;
        this.color = "white";
        this.name = "car";
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public boolean isFrozen() {
        return frozen;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void move(int newX, int newY) {

        if (frozen == false) {
            this.positionX = newX;
            this.positionY = newY;
        } else {
            System.out.println("This piece is frozen and cannot be moved");
        }
    }

    public void freeze() {
        frozen = true;
    }

    public void unfreeze() {
        frozen = false;
    }
}
