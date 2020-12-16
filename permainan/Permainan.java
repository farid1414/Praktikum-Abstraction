/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package permainan;
import java.util.*;
/**
 *
 * @author MBSCo
 */
abstract class Permainan {
    Scanner inputUser = new Scanner(System.in);
    String namaPemain;
    int levelPemain;
    
    void setNamaPemain(String namaPemain)
    {
        System.out.print("Masukkan nama: ");
        namaPemain =inputUser.nextLine(); 
    }
    
    void setLevelPemain(int levelPemain)
    {
        System.out.print("Silahkan pilih level: ");
        levelPemain =inputUser.nextInt();
        if(levelPemain >=1 && levelPemain<=20)
            {
                System.out.println("Level Normal");
            }
        else if(levelPemain >=21 && levelPemain<=80)
            {
                System.out.println("Level Medium");
            }
        else if(levelPemain >=81 && levelPemain<=100)
            {
                System.out.println("Level Hard");
            } 
        else {
            System.out.println("Level tidak tersedia");
            System.out.println("Level terendah : 1");
            System.out.println("Level tertinggi : 100");
        }
    }
    
    String getNamaPemain()
    {
        return namaPemain;
    }
    int getLevelPemain()
    {
        return levelPemain;
    }
    
    void jalankan()
    {
        setNamaPemain(namaPemain);
        setLevelPemain(levelPemain);
    }
    abstract int hitungSkor(int hit, int miss);
}
