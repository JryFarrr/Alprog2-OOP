/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laprakpraktikum2;

import java.util.Scanner;
/**
 * 
 * @author jirya
 */
public class SequentialSearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char[] data = {'A', 'B', 'C', 'E', 'F', 'B', 'A', 'D', 'G', 'F'};
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkkan karakter yang akan dicari : ");
        char key = input.next().charAt(0);
        int[] indeks = linearSearch(data,key);
        System.out.print("Huruf " + key+ " ditemukan sebanyak " + indeks.length + " kali yaitu pada urutan ke ");
        for(int i = 0; i < indeks.length; i++){
            if(i != indeks.length -1 ) {
            System.out.print(indeks[i] + ", ");
            } else {
                System.out.print(indeks[i]);
            }
        }
        
    } 
    public static int[] linearSearch(char [] data, char key){
    int[] indeks = new int[data.length];
    int i = 0;
    int count = 0;
    while (i < data.length) {
        if (key == data[i]) {
            indeks[count] = i + 1;
            count++;
        }
        i++;
     }
    int[] hasil = new int[count];
    for(int j = 0; j < count; j++){
        hasil[j] = indeks[j];
    }
    return hasil;
  }
    
    
}
    
