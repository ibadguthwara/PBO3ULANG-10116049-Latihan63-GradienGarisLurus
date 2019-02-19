/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3ulang.pkg10116049.latihan63.gradiengarislurus;

/**
 *
 * @author ibadguthwara
 * NAMA              : M. Ibad Guthwara
 * KELAS             : PBO 3 ULANG
 * NIM               : 10116049
 * DESKRIPSI PROGRAM : Membuat program gradien garis lurus
 *  
 */
public class PBO3ULANG10116049Latihan63GradienGarisLurus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Koordinat koordinat  = new Koordinat(2, 10, 5, 7);
        Koordinat koordinat2 = new Koordinat(5, 1, 3, 12);
        koordinat.hitungGradien();
        
        
        System.out.println("Garis yang melalui titik (" +koordinat.getX1() +"," 
                          + koordinat.getY1() + ") dan (" + koordinat.getX2() +
                          ","+ koordinat.getY2() + ")");
        System.out.println("memiliki gradien sebesar " + 
                          koordinat.hitungGradien());
        System.out.println("Garis yang melalui titik (" +koordinat2.getX1() 
                          +"," + koordinat2.getY1() + ") dan (" + 
                          koordinat2.getX2() +","+ koordinat2.getY2() + ")");
        System.out.println("memiliki gradien sebesar " + 
                          koordinat2.hitungGradien());
    }
    
}
