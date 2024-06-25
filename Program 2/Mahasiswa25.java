public class Mahasiswa25 {
    private String nim;
    private String nama;
    private String tglLahir;

    public Mahasiswa25() {
    }

    public Mahasiswa25(String nim, String nama, String tglLahir) {
        this.nim = nim;
        this.nama = nama;
        this.tglLahir = tglLahir;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTglLahir() {
        return tglLahir;
    }

    public void setTglLahir(String tglLahir) {
        this.tglLahir = tglLahir;
    }

    @Override
    public String toString() {
        return "Mahasiswa25{" + "nim='" + nim + '\'' + ", nama='" + nama + '\'' + ", tglLahir='" + tglLahir + '\'' + '}';
    }
}

