package com.theironyard.davisUhlig;

public class Main {

    public static void main(String[] args) {

        GamePiece piece = new GamePiece();

        piece.move(2, 3);

        if (piece.positionX == 2 && piece.positionY == 3) {
            System.out.println("x position is 2, and y position is 3 as expected");
        } else {
            System.out.println("Move test failed");
        }


        piece.freeze();

        if (piece.frozen == true){
            System.out.println("test passed, frozen changed successfully to true");
        } else {
            System.out.println("test failed, frozen is equal to false");
        }

        piece.move(5, 8);

        if (piece.positionX == 2 && piece.positionY == 3) {
            System.out.println("position x is still 2, and position y is still 3 as expected");
        } else{
            System.out.println("Freeze test failed");
        }


        piece.unfreeze();

        if (piece.frozen == false) {
            System.out.println("test passed, frozen successfully changed back to false");
        } else {
            System.out.println("test failed, frozen is equal to true");
        }

        piece.move(4, 5);

        if(piece.positionX == 4 && piece.positionY == 5) {
            System.out.println("position x is 4, and position y is 5 as expected");
        } else {
            System.out.println("Unfreeze Test Failed");
        }

    }
}
