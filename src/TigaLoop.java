import java.util.Scanner;

public class TigaLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Batas deret (n) : ");
        int n = input.nextInt();
        System.out.println();

        System.out.println("===== SATU DERET, TIGA LOOP =====");

        System.out.print("for      :");
        for (int i = 1; i <= n; i++) {
            System.out.print(" " + i);
        }
        System.out.println();

        System.out.print("while    :");
        int j = 1;
        while (j <= n) {
            System.out.print(" " + j);
            j++;
        }
        System.out.println();

        System.out.print("do-while :");
        int k = 1;
        do {
            System.out.print(" " + k);
            k++;
        } while (k <= n);
        System.out.println();
        System.out.println();

        int kurang = 0;
        for (int i = 1; i < n; i++) {
            kurang++;
        }
        int kurangSama = 0;
        for (int i = 1; i <= n; i++) {
            kurangSama++;
        }
        System.out.println("i <  n berputar : " + kurang + " kali");
        System.out.println("i <= n berputar : " + kurangSama + " kali");

        int tercapai = 0;
        System.out.print("Disaring :");
        // Kenapa tidak berhenti di i = 8 padahal 8 > 7? Soalnya continue ditulis lebih dulu
        // daripada break: pas i = 8 (genap), continue langsung lompat ke i++ jadi "if (i > 7)"
        // tidak sempat dicek. Baru pas i = 9 (ganjil) i > 7 jadi true dan break menghentikan loop.
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            if (i > 7) {
                break;
            }
            System.out.print(" " + i);
            tercapai++;
        }
        System.out.println();
        System.out.println("Sampai println  : " + tercapai + " kali");

        input.close();
    }
}
/*
Jalankan pertama (n = 5):
Batas deret (n) : 5

===== SATU DERET, TIGA LOOP =====
for      : 1 2 3 4 5
while    : 1 2 3 4 5
do-while : 1 2 3 4 5

i <  n berputar : 4 kali
i <= n berputar : 5 kali
Disaring : 1 3 5 7
Sampai println  : 4 kali

Jalankan kedua (n = 0):
Batas deret (n) : 0

===== SATU DERET, TIGA LOOP =====
for      :
while    :
do-while : 1

i <  n berputar : 0 kali
i <= n berputar : 0 kali
Disaring : 1 3 5 7
Sampai println  : 4 kali

Kesimpulan: do-while mengecek kondisinya sesudah badan loop dijalankan, jadi badannya
pasti jalan minimal sekali, makanya pas n = 0 cuma do-while yang tetap mencetak 1.
*/