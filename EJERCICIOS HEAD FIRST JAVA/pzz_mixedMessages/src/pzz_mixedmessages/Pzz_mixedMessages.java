
/*nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java;*/
package pzz_mixedmessages;

/**
 *
 * @author catom
 */
public class Pzz_mixedMessages {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 0;
        int y = 0;

        while(x<5){
                     
            y+=2;
            if(y>4){
                y-=1;
            }
            
            System.out.print(x + "" + y + " ");
            x++;
        }
    }

}
