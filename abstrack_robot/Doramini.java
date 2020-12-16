/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstrack_robot;

/**
 *
 * @author MBSCo
 */
 class DoraMini extends Robot {
    void sayDora()
    {
        System.out.println("Hi,saya Dora Mini");
    }
    
    @Override 
    void setNama(String nama)
    {
        System.out.println("Nama panggilan saya" + nama);
    }
    
    @Override 
    void displayData()
    {
        sayDora();
        setNama("Dora");
        setTahunpembuatan(2020);
    }
    
}