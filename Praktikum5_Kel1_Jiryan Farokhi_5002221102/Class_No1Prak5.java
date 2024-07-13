/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikumclass;



public class tabungan {
    
    
//    private String username;
//    private int saldo;
//
//    public tabungan(String username, int saldo) {
//        this.username = username;
//        this.saldo = saldo;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public int getSaldo() {
//        return saldo;
//    }
//
//    public void setSaldo(int saldo) {
//        this.saldo = saldo;
//    }

//    public void transfer(tabungan penerima, int jumlah) {
//        if (jumlah > saldo) {
//            System.out.println("Transfer gagal. Saldo tidak mencukupi.");
//        } else {
//            saldo -= jumlah;
//            penerima.setSaldo(penerima.getSaldo() + jumlah);
//            System.out.println("Transfer berhasil dilakukan ");
//        }
//    }

    public int saldo;
    public int simpan;
    public int ambil;
    
    public tabungan(int saldoAwal){
        saldo = saldoAwal;
    }

    public void simpanUang(int jumlah) {
        saldo += jumlah;
        System.out.println("Jumlah uang yang disimpan : " + jumlah);
    }
    
    public void ambilUang(int jumlah){
        if(saldo >= jumlah){
           saldo -= jumlah;
           System.out.println("Jumlah uang yang diambil : " + jumlah);
        }else{
            System.out.println("Saldo tidak mencukupi untuk melakukan penarikan sejumlah " + jumlah);
        }
    }
    
    public int getSaldo(){
        return saldo;
    }
    
    
    
}
