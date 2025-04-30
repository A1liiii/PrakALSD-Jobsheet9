import java.util.Scanner;

public class MahasiswaDemo15 {
    public static void main(String[] args) {
        StackTugasMahasiswa15 stack = new StackTugasMahasiswa15(5);
        Scanner scan = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\n\nMENU:");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("5. Melihat Tugas Terbawah");
            System.out.println("6. Jumlah Tugas yang Dikumpulkan");
            System.out.print("Pilih : ");
            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama : ");
                    String nama = scan.nextLine();
                    System.out.print("NIM : ");
                    String nim = scan.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = scan.nextLine();
                    Mahasiswa15 mhs = new Mahasiswa15(nama, nim, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                    break;
                case 2:
                    mhs = stack.pop();
                    if (mhs != null) {
                        System.out.println("Menilai tugas dari " + mhs.nama);
                        System.out.print("Masukkan nilai (0-100) : ");
                        int nilaiAngka = scan.nextInt();
                        mhs.tugasDinilai(nilaiAngka);
                        System.out.printf("Nilai Tugas %s adalah %d\n", mhs.nama, nilaiAngka);
                        String biner = stack.konversiDesimalKeBiner(nilaiAngka);
                        System.out.println("Nilai-Biner Tugas: " + biner);
                    }
                    break;
                case 3:
                    Mahasiswa15 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.nama);
                    }
                    break;
                case 4:
                    System.out.println("Daftar semua tugas");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;
                case 5:
                    Mahasiswa15 bawah = stack.peekBottom();
                    if (bawah != null) {
                        System.out.println("Tugas pertama dikumpulkan oleh " + bawah.nama);
                    }
                    break;
                case 6:
                    System.out.println("Jumlah tugas yang dikumpulkan saat ini: " + stack.jumlahTugas());
                    break;                                
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih >= 1 && pilih <= 6);
        scan.close();
    }
}
