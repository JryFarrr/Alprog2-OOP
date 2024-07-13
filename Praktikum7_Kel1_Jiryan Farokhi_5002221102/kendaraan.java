/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum_ke7;

/**
 *
 * @author jirya
 */
public class kendaraan {
    private String warna;
    private String bahan_bakar;
    private int kapasitas_muatan;
    
    public kendaraan (String wn, String bb, int km){
        this.warna = wn;
        this.bahan_bakar = bb;
        this.kapasitas_muatan = km;
    }
    
    public void view(){
        System.out.println("Warna : " + warna);
        System.out.println("Bahan Bakar : " + bahan_bakar);
        System.out.println("Kapasitas Muatan : " + kapasitas_muatan);
    }     
    
}


class kendaraan_darat extends kendaraan {
    private int roda;
    
    kendaraan_darat (String wn, String bb, int km, int rd){
        super(wn, bb, km);
        this.roda = rd;
    }
    
    public void view(){
        super.view();
        System.out.println("Jumlah roda : " + roda);
    }
}


class kendaraan_laut extends kendaraan {
    private String jenisjangkar;
    
    kendaraan_laut (String wn, String bb, int km, String jj){
        super(wn, bb, km);
        this.jenisjangkar = jj;
    }
    
    public void view(){
        super.view();
        System.out.println("Jenis jangkar " + jenisjangkar);
    }
}

class sepeda_motor extends kendaraan_darat {
    private String merk;
    
    sepeda_motor(String wn, String bb, int km, int rd, String mk){
        super(wn, bb, km, rd);
        this.merk = mk;
    }
    
    public void view(){
        super.view();
        System.out.println("Jenis merek : " + merk);
    }
}



class perahu_layar extends kendaraan_laut {
    private int jumlahlayar;
    
    perahu_layar(String wn, String bb, int km, String jj, int jl){
        super(wn, bb, km, jj);
        this.jumlahlayar= jl;
    }
    
    public void view(){
        super.view();
        System.out.println("Jumlah layar : " + jumlahlayar);
    }
}