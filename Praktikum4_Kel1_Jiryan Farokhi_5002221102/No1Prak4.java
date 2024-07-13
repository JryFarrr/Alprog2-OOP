/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugaspraktikum_online;

import java.util.Arrays;

public class Tugaspraktikum_online {

    public static void main(String[] args) {
        int[] arr = {1, 2};
        int index = 3;
        int value = 3;

        System.out.println("Array kondisi awal:");
        System.out.println(Arrays.toString(arr));

        try {
            arr = tambah_elements(arr, value, index);
            System.out.println("Array setelah disisipkan angka 3:");
            System.out.println(Arrays.toString(arr));
        } catch (IndexOutOfBoundsException e) {
            arr = tambah_elements(arr, value, arr.length);
            System.out.println("Error: index melebihi batas. Nilai akan dimasukkan di tengah.");
            System.out.println("Array setelah disisipkan angka 3 di tengah:");
            System.out.println(Arrays.toString(arr));
        }
    }

    private static int[] tambah_elements(int[] arr, int value, int index) {
        int[] newArr = new int[arr.length + 1];
        System.arraycopy(arr, 0, newArr, 0, index);
        System.arraycopy(arr, index, newArr, index + 1, arr.length - index);
        newArr[index] = value;
        return newArr;
    }
}
