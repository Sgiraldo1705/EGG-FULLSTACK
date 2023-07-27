/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author catom
 */
public class Revolver {

    public int posicionAct;
    public int posicionAgua;

    public Revolver() {
    }

    public Revolver(int posicionAct, int posicionAgua) {
        this.posicionAct = posicionAct;
        this.posicionAgua = posicionAgua;
    }

    public int getPosicionAct() {
        return posicionAct;
    }

    public void setPosicionAct(int posicionAct) {
        this.posicionAct = posicionAct;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    @Override
    public String toString() {
        return "Revolver{" + "posicionAct=" + posicionAct + ", posicionAgua=" + posicionAgua + '}';
    }

}
