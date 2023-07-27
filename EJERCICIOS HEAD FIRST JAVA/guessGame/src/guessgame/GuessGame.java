/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guessgame;

/**
 *
 * @author catom
 */
public class GuessGame {

    Player p1;
    Player p2;
    Player p3;

    public void startGame() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        boolean p1Ok = false;
        boolean p2Ok = false;
        boolean p3Ok = false;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("I'm thinking of a number between 0 & 9...");

        while (true) {
            System.out.println("Number to guess is " + targetNumber);

            p1.guess();
            p2.guess();
            p3.guess();

            guessp1 = p1.number;
            System.out.println("Player one guessed " + guessp1);

            guessp2 = p2.number;
            System.out.println("Player two guessed " + guessp2);

            guessp3 = p3.number;
            System.out.println("Player one guessed " + guessp3);

            if (guessp1 == targetNumber) {
                p1Ok = true;
            }
            if (guessp2 == targetNumber) {
                p2Ok = true;
            }
            if (guessp3 == targetNumber) {
                p3Ok = true;
            }
            if (p1Ok || p2Ok || p3Ok) {
                System.out.println("We have a winner!");
                System.out.println("Player one got it right? " + p1Ok);
                System.out.println("Player two got it right? " + p2Ok);
                System.out.println("Player three got it right? " + p3Ok);
                System.out.println("Game is over");
                break;

            } else {
                System.out.println("Players will have to try again.");
            }

        }
    }
}
