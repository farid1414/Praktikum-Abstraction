/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package permainan;

import java.util.Scanner;

/**
 *
 * @author MBSCo
 */
public class Main_permainan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner inputUser = new Scanner(System.in);
    Permainan Arcade = new PermainanArcade();
    Permainan Strategi = new PermainanStrategi();
    
    System.out.println("-- Permainan Dimulai--");
    System.out.println("1.Arcade");
    System.out.println("2.Strategi");
    System.out.println("Masukkan pilihan anda");
    int pilihan=inputUser.nextInt();
    if(pilihan==1 )
    {
        Arcade.jalankan();
        System.out.println("\n Permainan Arcade");
        Arcade.hitungSkor(5,3);
    }
    else if(pilihan==2)
    {
        Strategi.jalankan();
        System.out.println("\n Permainan Strategi");
        Strategi.hitungSkor(10,5);
    }
    else 
    {
        System.out.println("\n Anda Salah Memilih");
    }
    }
    
}
