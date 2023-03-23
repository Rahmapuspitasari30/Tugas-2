/* Nim 	: 13020210093 
   Nama	: Rahma Puspitasari
   Hari/tanggal pengerjaan : Selasa 21 Maret 2023
   Waktu pengerjaan : 21.38 */

import java.util.Scanner;

/* contoh baca nilai x, */
/* Jumlahkan nilai yang dibaca dengan WHILE*/
public class PrintXWhile {

	public static void main(String[] args){
		int Sum;
		int x;
		Scanner masukan = new Scanner(System.in);

		Sum = 0; /* Inisialisasi */
		System.out.print ("Masukkan nilai x (int), akhiri dg 999 : ");
		x = masukan.nextInt(); /* First Elmt */
		while (x != 999)	/* Kondisi berhenti */{
			Sum = Sum + x; /* Proses*/
			System.out.print ("Masukkan nilai x (int), akhiri dg 999 : ");
			x = masukan.nextInt();	/* First Elmt */
		}
		System.out.println("Hasil penjumlahan = "+ Sum);	
/* Terminasi */

	}


}
