/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Entities.Revolver;

public class RevolverService {

    private Revolver rev = new Revolver();

    public void llenarRevolver() {
        int max = 6;
        int min = 1;
        int range = max - min + 1;

        rev.setPosicionAct((int) (Math.random() * range) + min);
        rev.setPosicionAgua((int) (Math.random() * range) + min);

    }
    int posAct = rev.getPosicionAct();
    int posAgua = rev.getPosicionAgua();

    public boolean mojar() {

        if (posAct == posAgua) {
            return true;
        } else {
            return false;
        }
    }
public void siguienteChorro(){
    if (posAct< 6) {
        posAct++;
        
    }else{
        posAct=1;
    }
rev.toString();
}

    @Override
    public String toString() {
        return "RevolverService{" + "rev=" + rev + ", posAct=" + posAct + ", posAgua=" + posAgua + '}';
    }

}
