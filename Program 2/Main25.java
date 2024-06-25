import java.util.ArrayList;
import java.util.Scanner;

public class Main25 {
    public static void main(String[] args) {
        ArrayList<Mahasiswa25> list = new ArrayList<>();

        // Adding initial data
        list.add(new Mahasiswa25("001", "Alice", "01-01-2000"));
        list.add(new Mahasiswa25("002", "Bob", "02-02-2001"));
        list.add(new Mahasiswa25("003", "Charlie", "03-03-2002"));
        list.add(new Mahasiswa25("004", "David", "04-04-2003"));

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa");
            System.out.println("3. Lihat Mahasiswa");
            System.out.println("4. Cetak Semua Mahasiswa");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Masukkan NIM: ");
                    String nim = scanner.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan Tanggal Lahir: ");
                    String tglLahir = scanner.nextLine();
                    list.add(new Mahasiswa25(nim, nama, tglLahir));
                    break;
                case 2:
                    System.out.print("Masukkan NIM yang akan dihapus: ");
                    String nimToDelete = scanner.nextLine();
                    list.removeIf(mhs -> mhs.getNim().equals(nimToDelete));
                    break;
                case 3:
                    System.out.print("Masukkan NIM yang dicari: ");
                    String nimToFind = scanner.nextLine();
                    Mahasiswa25 mhs = list.stream()
                            .filter(mahasiswa -> mahasiswa.getNim().equals(nimToFind))
                            .findFirst()
                            .orElse(null);
                    if (mhs != null) {
                        System.out.println(mhs);
                    } else {
                        System.out.println("Mahasiswa tidak ditemukan");
                    }
                    break;
                case 4:
                    list.forEach(System.out::println);
                    break;
                case 5:
                    System.out.println("Keluar");
                    break;
                default:
                    System.out.println("Opsi tidak valid");
            }
        } while (choice != 5);

        scanner.close();
    }
}


