public class Surat15 {
    String idSurat;
    String namaMahasiswa;
    String kelas;
    char jenisIzin;
    int durasi;

    public Surat15() {}

    public Surat15(String idSurat, String namaMahasiswa, String kelas, char jenisIzin, int durasi) {
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
    }

    public void tampilSurat() {
        System.out.printf("ID: %s | Nama: %s | Kelas: %s | Jenis: %s | Durasi: %d hari\n",
                          idSurat, namaMahasiswa, kelas, jenisIzin == 'S' ? "Sakit" : "Izin", durasi);
    }
}
