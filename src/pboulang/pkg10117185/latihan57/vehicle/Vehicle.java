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
public class Vehicle {
    //Atribute
    String myBrand;
    String myModel;
    
    //Constraction
    Vehicle(){
        System.out.println(this.getClass().getSimpleName());
    }
    
    //Function

    public String getMyBrand() {
        return myBrand;
    }

    public void setMyBrand(String parMyBrand) {
        myBrand = parMyBrand;
    }

    public String getMyModel() {
        return myModel;
    }

    public void setMyModel(String parMyModel) {
        myModel = parMyModel;
    }
    
}
