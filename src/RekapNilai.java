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

            jumlahSah++;
        } while (nilai != SELESAI);
    }
}

