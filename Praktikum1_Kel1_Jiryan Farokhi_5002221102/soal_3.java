/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author jirya
 */
public class soal_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan panjang tinggi segitiga bintang : ");
        int n = input.nextInt();
                
        for(int i=1; i<=n; i++) {
             for(int j=1; j<=i; j++) {
             System.out.print(" *");
           }
          System.out.println();
        }
    }
    
}
