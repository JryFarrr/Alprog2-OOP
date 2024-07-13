/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author jirya
 */
public class soal_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan panjang deret fibonacci yang diinginkan : " );
        int n = input.nextInt();
        int n1 = 1, n2 = 1;
        int nextnumber = 0;
        System.out.println();
        for (int i = 1; i <= n ; i++){
            if(i==1){
                System.out.print(n1 + " ");
                continue;
            }
            if(i==2){
                System.out.print(n2 + " ");
                continue;
            }
            nextnumber = n1+n2;
            n1 = n2;
            n2 = nextnumber;
            
            System.out.print(nextnumber + " ");
        }
   
    }
    
}
