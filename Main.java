package Pemlan;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Mhs> mahasiswa = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Masukkan NIM: ");
            String nim = scanner.nextLine();

            System.out.print("Masukkan Nama: ");
            String nama = scanner.nextLine();

            System.out.print("Masukkan Alamat: ");
            String alamat = scanner.nextLine();

            mahasiswa.add(new Mhs(nim, nama, alamat));

            System.out.print("Tambah lagi?");
            String tambah = scanner.nextLine();
            if (tambah.equalsIgnoreCase("t")) {
              break;
            }
        }

        System.out.println("==================================");
        for (Mhs Mhs : mahasiswa) {
            System.out.println(Mhs.getNim() + " | " + Mhs.getNama() + " | " + Mhs.getAlamat());
        }
    }
}
