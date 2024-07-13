/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugaspraktikum_2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author jirya
 */
public class No2 {

    public static void main(String[] args) {
       int[] data = {15, -2, 0, 10, 59, 5, -10, 53, -25, 36};
       Scanner input = new Scanner(System.in);
       System.out.println("data setelah diurutkan : ");
       bubblesort(data);
       System.out.println(Arrays.toString(data));
        System.out.println("5 Nilai terbesar : ");
       tampil5terbesar(data); 
      
       
    }
    
      public static void tampil5terbesar (int [] arr){
        int[] data = new int[5];
        for(int i = 0; i < 5; i++){
            data[i] = arr[i];
        }
        System.out.println(Arrays.toString(data));
    }
   
    public static void bubblesort(int[]arr){
        int n = arr.length;
        int temp = 0;
        for(int i = 0; i < n; i++){
            for(int j = 1; j < n; j++){
                if(arr[j-1] < arr[j]){ 
                temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;   
            }
        }
      }
    }
    
}
