/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laprakpraktikum2;

/**
 *
 * @author jirya
 */
public class BinarySearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final long START = System.nanoTime();
        char[] data = {'a','c','e','g','i','k','o','q','r'};
        char key = 'r';
        int indeks;
        indeks = pencarianBinary(data, key);
        if (indeks == -1)
            System.out.println("Huruf " + key + " Tidak ditemukan ");
        else
            System.out.println("Huruf " + key + " berada pada indeks ke - " + (indeks));
        final long END = System.nanoTime();
        System.out.println("Time taken : " + ((END - START) / 1e+9) + " seconds");
     }
    
    public static int pencarianBinary(char[] data, char key) {
    int bawah = 0;
    int atas = data.length -1;

    
    while (bawah <= atas) {
        int tengah = (bawah + atas) / 2;
        if (key == data[tengah]) {
            return tengah;
        } else if (key > data[tengah]) {
            bawah = tengah + 1;
        } else {
            atas = tengah - 1;
        }
    }

    return -1;
  }
    
    
}
