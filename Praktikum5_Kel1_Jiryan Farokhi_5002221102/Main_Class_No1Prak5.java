/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Praktikumclass;

/**
 *
 * @author jirya
 */
public class bankoperation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        tabungan user1 = new tabungan("User 1", 5000);
//        tabungan user2 = new tabungan("User 2", 2000);
//
//        System.out.println("Saldo " + user1.getUsername() + ": " + user1.getSaldo());
//        System.out.println("Saldo " + user2.getUsername() + ": " + user2.getSaldo());
//
//        int transferAmount = 4000;
//        user1.transfer(user2, transferAmount);
//
//        System.out.println("Saldo " + user1.getUsername() + ": " + user1.getSaldo());
//        System.out.println("Saldo " + user2.getUsername() + ": " + user2.getSaldo());
//    }
// }
        
        tabungan user1 = new tabungan(5000);
//        tabungan user2 = new tabungan(5000);
        
        System.out.println("Saldo awal : " + user1.getSaldo());
        
        user1.simpanUang(3000);
        user1.ambilUang(6000);
        user1.simpanUang(3500);
        user1.ambilUang(4000);
        user1.ambilUang(1600);
        user1.simpanUang(2000);
        
        System.out.println("Saldo sekarang : " + user1.getSaldo());
    }
    
}