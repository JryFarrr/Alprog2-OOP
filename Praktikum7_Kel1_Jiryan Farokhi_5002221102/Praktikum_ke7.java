/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum_ke7;


import java.util.Arrays;
/**
 *
 * @author jirya
 */
public class Praktikum_ke7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        kendaraan knd = new kendaraan ("MERAH", "BENSIN", 50);
        kendaraan_darat knd_darat = new kendaraan_darat ("BIRU", "SOLAR", 100, 4);
        kendaraan_laut knd_laut = new kendaraan_laut ("HIJAU", "BENSIN", 45, "HALL");
        sepeda_motor spd = new sepeda_motor ("MERAH", "BENSIN", 55, 2, "HONDA");
        perahu_layar ply = new perahu_layar ("PINK", "SOLAR",55, "STEVIN", 5);
        
        
        knd.view();
        System.out.println();
        knd_darat.view();
        System.out.println();
        knd_laut.view();
        System.out.println();
        spd.view();
        System.out.println();
        ply.view();
        
        
    }
    
}
