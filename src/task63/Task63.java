/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task63;

/**
 *
 * @author a.yusupova
 * Осуществить разные варианты профилирования метода replaceSubS:
 */
public class Task63 {

    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
       String replaceSubS(String s, String subS, String newSubS) {
        String newS = "";
        int i = 0;
        int old_i = 0;
        i = s.indexOf(subS, i);
        while (i > -1) {
            newS = newS + s.substring(old_i, i) + newSubS;
            old_i = i + subS.length();
            i = s.indexOf(subS, old_i);
        }
        newS = newS + s.substring(old_i, s.length());
        return newS;
   }
}
