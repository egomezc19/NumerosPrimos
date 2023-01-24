/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg10numeroprimo;

/**
 *
 * @author egome
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int primerosDiez = 30;
        boolean primo;
        System.out.println("LOS 10 PRIMEROS NUMEROS PRIMOS SON:\n");
        // Estructura for
        for (int num = 2; num <= primerosDiez; num++) {
            primo = true;
            for (int i = num - 1; i > 1; i--) {
                if (num % i == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                System.out.println(num + " es primo " );
            }
        }
    }  
}
