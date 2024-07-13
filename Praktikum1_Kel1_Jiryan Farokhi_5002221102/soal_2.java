/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author jirya
 */
public class soal_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan batas bilangan : ");
        int batas_bilangan = input.nextInt();
        System.out.print("Masukkan bilangan X : ");
        int x = input.nextInt();
        
        for(int i = 1; i<= batas_bilangan; i++){
            if (i % x == 0){
                continue;
            }
            System.out.print(i + " ");
        }
        
    }
    
}
