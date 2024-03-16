// File : Mpoligon.java
// Nama : Nandha Trimerdiani Hidayat
// Deskripsi : drive class untuk poligon persegi panjang

package org.main;

import org.bangundatar.*;
import org.bangundatar.Segitiga;

public class Mpoligon {
    public static void main(String[] args) {
        persegiPanjang persegi = new persegiPanjang(10, 5, 4);
        persegi.printInfo();
        System.out.println("Luas Persegi Panjang : " + persegi.hitungLuas());

        Segitiga segitiga = new Segitiga(2, 3, 4);
        segitiga.printInfo();
        System.out.println(" Luas segitiga  : " + segitiga.hitungLuas());

    }
}
