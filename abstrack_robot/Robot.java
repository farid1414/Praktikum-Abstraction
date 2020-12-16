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
abstract class Robot {
        String nama;
        String pemilik;
        int tahun;
          
          void setTahunpembuatan(int tahun)
          {
              System.out.println("Saya dubuat tahun" + tahun);
          }
          abstract void setNama(String nama);
          abstract void displayData();
}
