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
public class Startup {

    private ArrayList<String> locationCells;
    private int numOfHits;
    private String name;

    public int getNumOfHits() {
        return numOfHits;
    }

    public void setNumOfHits(int numOfHits) {
        this.numOfHits = numOfHits;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocationCells(ArrayList<String> locs) {

        locationCells = locs;
    }

    public String checkYourSelf(String userInput) {
        String result = "miss";
        int index = locationCells.indexOf(userInput);

        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "kill";

            } else {
                result = "hit";
            }
        }
            return result;
 
    }
}