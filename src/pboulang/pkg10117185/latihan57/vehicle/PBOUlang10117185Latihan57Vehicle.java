/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang.pkg10117185.latihan57.vehicle;

/**
 *
 * @author user
 * Nama     : Andhyka Widariyanto
 * NIM      : 10117185
 * Kelas    : PBO - Ulang
 * Tugas    : Latihan 57 - Vehicle
 */
public class PBOUlang10117185Latihan57Vehicle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bicycle sep = new Bicycle();
        sep.setMyBrand("Trek Bike");
        sep.setMyModel("7.4FX");
        sep.setMyGearCount(23);
        System.out.println("Brand : "+sep.myBrand);
        System.out.println("Model : "+sep.myModel);
        System.out.println("Jumlah gear : "+sep.myGearCount);
        System.out.println("");
        
        Skateboard ske = new Skateboard();
        ske.setMyBrand("Ally Skate");
        ske.setMyModel("Rocket");
        ske.setMyBoardLength(54.5);
        System.out.println("Brand : "+ske.myBrand);
        System.out.println("Model : "+ske.myModel);
        System.out.println("Panjang Board : "+ske.myBoardLength);
    }
    
}
