/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simplestatupgame;

import java.util.ArrayList;

/**
 *
 * @author catom
 */
public class StartUpBust {

    private GameHelper helper = new GameHelper();
    private ArrayList<Startup> startups = new ArrayList<Startup>();
    private int numOfGuesses=0;

    private void setUpGame() {
        Startup stup1 = new Startup();
        stup1.setName("Poniez");
        Startup stup2 = new Startup();
        stup2.setName("Hacqi");
        Startup stup3 = new Startup();
        stup3.setName("Cabista");

        startups.add(stup1);
        startups.add(stup2);
        startups.add(stup3);
        
        System.out.println("your goal is to sink three Startups");
        System.out.println("poniez, hacqi, cabista");
        System.out.println("try to sink them all in the fewest number of guesses");

        for (Startup startup : startups) {
            ArrayList<String> newLocation = helper.placeStartup(3);
            startup.setLocationCells(newLocation);

        }
    }

    private void startPlaying() {
        while (!startups.isEmpty()) {
            String userGuess = helper.getUserInput("Enter a guess");
            checkUserGuess(userGuess);

        }
        finishGame();
    }

    private void checkUserGuess(String userGuess) {
        numOfGuesses++;
        String result = "miss";

        for (Startup startupTotest : startups) {
            result = startupTotest.checkYourSelf(userGuess);
            if (result.equals("hit")) {
                break;
            }
            if(result.equals("kill"))
                startups.remove(startupTotest); 
            break;
        }
        System.out.println(result);
    }
    
    private void finishGame(){
        System.out.println("All Startups are dead! you stock is now worthless");
        if(numOfGuesses <=18){
            System.out.println("it only took you " + numOfGuesses + " Guesses.");
            System.out.println("you got out before your options sank");
        }else{
            System.out.println("Took you Long enough "+ numOfGuesses + " guesses");
            System.out.println("fish are dancing");
        }
    }
  public static void main(String[] args) {
      StartUpBust game = new StartUpBust();
      game.setUpGame();
      game.startPlaying();
      
  }
}
