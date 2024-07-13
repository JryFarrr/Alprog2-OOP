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
public class No1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] data = {18, 28, 36, 38, 81, 82, 93};
       System.out.println("Masukkan angka yang akan di cari : ");
       Scanner input = new Scanner(System.in);
       int n = input.nextInt();
       System.out.println("data setelah diurutkan : ");
       InsertSort(data);
       System.out.println(Arrays.toString(data));
       int indeks;
       indeks = pencarianBinary(data, n);
       if (indeks == -1)
            System.out.println("Huruf " + n + " Tidak ditemukan ");
        else
            System.out.println("Huruf " + n + " berada pada urutan ke - " + (indeks));
    }
    
    public static void InsertSort (int[] arr){
        int n = arr.length;
        int v, j;
        for(int i = 1; i < n; i++){
            v = arr[i];
            j = i-1;
            
            while(j >= 0 && arr[j]>v){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = v;
        }
    }
    
    public static int pencarianBinary(int[] data, int key) {
    int bawah = 0;
    int atas = data.length-1;

    
    while (bawah <= atas) {
        int tengah = (bawah + atas) / 2;
        if (key == data[tengah]) {
            return tengah+1;
        } else if (key > data[tengah]) {
            bawah = tengah + 1;
        } else {
            atas = tengah - 1;
        }
    }

    return -1;
  }
    
    
  
}
