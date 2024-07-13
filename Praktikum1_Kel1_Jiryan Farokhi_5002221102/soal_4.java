/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author jirya
 */
public class soal_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.print("Masukkan panjang barisan yang diingkan : ");
        int n = input.nextInt();
        System.out.println("Hanya ingin menampilkan barisan 1-9 dan 5 tidak ditampilkan : ");
        
        for(int i=1; i<=n; i++) {
            if (i == 5){
               continue;
            }else if(i == 9){
               break;
            }  
          System.out.print(i + " ");
        }
    }
    
}
