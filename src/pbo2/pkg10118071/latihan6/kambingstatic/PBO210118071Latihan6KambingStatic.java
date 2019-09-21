/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118071.latihan6.kambingstatic;

/**
 *
 * @author 
 * NAMA              : David Aditya Winarto
 * KELAS             : PBO2
 * NIM               : 10118071
 * Deskripsi Program : Program ini berisi program untuk membuat dan mengakses
 *                     variabel static
 * 
 */
public class PBO210118071Latihan6KambingStatic {

    /**
     * @param args the command line arguments
     */
    // NAMA_KAMBING sebagain konstanta
    public static final String NAMA_KAMBING = "MIDUN";
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Mamalia.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + " memiliki kambing sebanyak " + Mamalia.jumlahKambing);
    }
    
}
