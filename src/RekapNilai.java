import java.util.Scanner;

public class RekapNilai {

    static final int SELESAI = -1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahSah = 0;
        int nilai;

        System.out.println("===== REKAP NILAI KELAS =====");
        System.out.println("Ketik -1 kalau sudah selesai.");

        do {
            // do-while dipakai karena nilai pertama harus diminta dulu sebelum ada yang bisa dinilai.
            System.out.print("Nilai ke-" + (jumlahSah + 1) + " : ");
            nilai = sc.nextInt();

            if (nilai == SELESAI) {
                break;
            }

            if (nilai < 0 || nilai > 100) {
                System.out.println("  ditolak — nilai harus 0..100");
                continue; // lewati sisa loop, jumlahSah tidak naik
            }
            // Percobaan dibalik: dengan "nilai >= 60" di paling atas, nilai 85 jadi grade D
            // karena 85 >= 60 sudah benar di cabang pertama, jadi cabang lain tidak dicek lagi.
            char grade;
            if (nilai >= 90) {
                grade = 'A';
            } else if (nilai >= 80) {
                grade = 'B';
            } else if (nilai >= 70) {
                grade = 'C';
            } else if (nilai >= 60) {
                grade = 'D';
            } else {
                grade = 'E';
            }

            String keterangan = switch (grade) {
                case 'A' -> "Sangat Baik";
                case 'B' -> "Baik";
                case 'C' -> "Cukup";
                case 'D' -> "Kurang";
                default -> "Tidak Lulus";
            };

            System.out.println("  Grade " + grade + " — " + keterangan);
            jumlahSah++;
        } while (nilai != SELESAI);
    }
}
