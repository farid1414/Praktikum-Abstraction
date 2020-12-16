/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doramini;

/**
 *
 * @author MBSCo
 */

interface Robot 
{
    void setNama(String nama);
    void setTahun(int tahun);
    void displayData();
}

interface Doraemon
{
    void sayDora();
    void displayKantongAjaib();
}

class DoraMini implements Robot, Doraemon {

    String pemilik;
    String nama;
    int tahun;
    
    String getPemilik()
    {
        return pemilik;
    }
    
    void setPemilik(String pemilik)
    {
        System.out.println("Pemilik Dora Mini: " +pemilik);
    }
    
    @Override
    public void setNama(String nama)
    {
        System.out.println("Nama: " + nama);
    }
    
    @Override 
    public void setTahun(int tahun)
    {
        System.out.println("Dibuat tahun: " +tahun);
    }
    
    @Override 
    public void displayData()
    {
        setNama("DoraMini");
        setTahun(2020);
        setPemilik("M Faridz \n");
        System.out.println("--DoraMini Berkata --");
        sayDora();
        displayKantongAjaib();
    }
    
    @Override 
    public void sayDora()
    {
        System.out.println("Hallo, Nama saya Dora Mini");
    }

    @Override 
    public void displayKantongAjaib()
    {
        System.out.println("Saya juga seperti Doraemon yang memiliki kantung ajaib\n");
       
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DoraMini DoraMini = new DoraMini();
        DoraMini.displayData();
    }
    
}
