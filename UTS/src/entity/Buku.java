package entity;

/**
 *
 * @author asus
 */
public class Buku {
    private String id;
    private String nama;
    private String harga_buku;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getharga_buku() {
        return harga_buku;
    }

    public void setjharga_buku(String harga_buku) {
        this.harga_buku = harga_buku;
    }

    public Buku(String id, String nama, String harga_buku) {
        this.id = id;
        this.nama = nama;
        this.harga_buku = harga_buku;
    }


    public boolean equals(Object object) {
        Buku temp = (Buku) object;
        return id.equals(temp.getId());
    }
}

