/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.tictactoe;

import java.util.Scanner;

/**
 *
 * @author catom
 */
public class TicTacToe {

    public static void main(String[] args) {

        char[][] gameBoard = {{'1', '|', '2', '|', '3'},
        {'-', '+', '-', '+', '-'},
        {'4', '|', '5', '|', '6'},
        {'-', '+', '-', '+', '-'},
        {'7', '|', '8', '|', '9'}};
        print(gameBoard);
        placePiece(gameBoard);
    }  

    public static void placePiece(char[][] gameBoard) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your placement (1-9):");
        int pos = scan.nextInt();

        System.out.println(pos);

        switch (pos) {
            case 1:
                gameBoard[0][0] = 'X';

                break;
            case 2:
                gameBoard[0][2] = 'X';

                break;
            case 3:
                gameBoard[0][4] = 'X';

                break;
            case 4:
                gameBoard[2][0] = 'X';

                break;
            case 5:
                gameBoard[2][2] = 'X';

                break;
            case 6:
                gameBoard[2][4] = 'X';

                break;
            case 7:
                gameBoard[4][0] = 'X';

                break;
            case 8:
                gameBoard[4][2] = 'X';

                break;
            case 9:
                gameBoard[4][4] = 'X';

                break;
            default:
                throw new AssertionError();
        }
  print(gameBoard);
    }

public static void print(char[][] gameBoard) {
        
        for (char[] row : gameBoard) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
            
        }
    }
}
