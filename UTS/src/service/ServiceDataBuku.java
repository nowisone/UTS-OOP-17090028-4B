package service;

import java.util.*;
import entity.*;
/**
 *
 * @author asus
 */
public class ServiceDataBuku {
    private static List<Buku> data = new LinkedList<Buku>();

    public void addData(Buku lp) {
        data.add(lp);
        System.out.println("Data telah tersimpan");
    }

    public void updateData(Buku lp) {
        int index = data.indexOf(lp);
        if(index >= 0) {
            data.set(index, lp);
            System.out.println("Data telah berubah");
        }
    }

    public void deleteData(String id) {
        int idx = data.indexOf(new Buku(id, "", ""));
        if(idx >= 0) {
            data.remove(idx);
            System.out.println("Data telah terhapus");
        }
    }

    public void showAllData() {
        int i=1;
        System.out.println("\nData di List :");
        for(Buku lp : data) {
            System.out.println("data ke-" + i++);
            System.out.println("  ID : " + lp.getId());
            System.out.println("  NAMA : " + lp.getNama());
            System.out.println("  HARGA BUKU : " + lp.getharga_buku());
        }
    }
}

