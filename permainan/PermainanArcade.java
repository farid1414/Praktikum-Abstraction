/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package permainan;

/**
 *
 * @author MBSCo
 */
 class PermainanArcade extends Permainan {
     @Override 
     int hitungSkor(int hit, int miss)
     {
         int total =(hit*3)-(miss*1);
         System.out.println("Skor Perolehan: " +total);
         System.out.println("\n");
         return total;
     }
    
}
