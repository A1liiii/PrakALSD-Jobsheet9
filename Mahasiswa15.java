public class Mahasiswa15 {
    public String nama, nim, kelas;
    public int nilai;

    public Mahasiswa15(String nama, String nim, String kelas) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        nilai = -1;
    }

    public void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }
}
