/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio19taller2;
import java.util.Scanner;

public class Ejercicio19Taller2 {

    public static void main(String[] args) {
        double suma = 0, n = 0, num, prom;
        Scanner entrada = new Scanner(System.in);
        num = entrada.nextDouble();
        while(num > 0){
            suma = suma + num;
            n = n + 1;
            num = entrada.nextInt();
        }
        prom = suma/n;
        System.out.println("LA SUMA ES: " + suma + " Y EL PROMEDIO: " + prom);
    }
    
}
