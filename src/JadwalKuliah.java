import java.util.Scanner;

public class JadwalKuliah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[][] jadwal = {
                {},
                {"13:00-14:40 | Rangkaian Listrik - A.201 Lab. T. Kom"},
                {"06:00-06:50 | Olahraga - Lapangan Stadion UNDIP",
                        "10:40-12:20 | Pemrograman Dasar - A.201 Lab. T. Kom",
                        "13:30-14:20 | Bahasa Inggris I - R. Dexlite Plus B"},
                {"16:10-17:50 | Pendidikan Agama Islam - A.202 Lab. T. Kom"},
                {"07:00-08:40 | Kimia - B.101 T. KOM",
                        "09:40-12:10 | Kalkulus I - A.201 Lab. T. Kom"},
                {"08:50-11:20 | Teknologi Informasi - A.202 Lab. T. Kom",
                        "13:00-15:30 | Fisika Dasar I - B.201 T. KOM"},
                {"09:00-09:50 | Praktikum Pemrograman Dasar - Lab. Rekayasa Perangkat Lunak"}
        };

        System.out.println("1=Senin | 2=Selasa | 3=Rabu | 4=Kamis | 5=Jumat | 6=Sabtu");
        System.out.print("Pilih hari: ");
        int hari = input.nextInt();

        System.out.println("\n===== JADWAL KULIAH HARI INI =====");

        if (hari >= 1 && hari <= 6) {
            String[] jadwalHari = jadwal[hari];
            if (jadwalHari.length > 0) {
                for (String mata : jadwalHari) {
                    System.out.println(mata);
                }
            } else {
                System.out.println("Tidak ada jadwal kuliah hari ini.");
            }
        } else {
            System.out.println("Tidak ada jadwal kuliah (Hari Minggu/Input tidak valid)");
        }

        input.close();
    }
}