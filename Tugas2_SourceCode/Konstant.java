/* Nim 	: 13020210093 
   Nama	: Rahma Puspitasari
   Hari/tanggal pengerjaan : Selasa 21 Maret 2023
   Waktu pengerjaan : 11.52 */


import java.util.Scanner;

/* Membaca jari-jari, menhitung luas lingkaran */
/* latihan pmakaian konstanta */

public class Konstant {

	public static void main(String[] args) {
		final float PHI = 3.1415f;
		float r;
		Scanner masukan=new Scanner(System.in);
		/* program */ /* baca data */

		System.out.print ("Jari-jari Lingkaran = ");
		r = masukan.nextFloat ();

		/* Hitung dan tulis Hasil */
			System.out.print ("Luas Lingkaran = "+ (PHI * r * r)+"\n");
			System.out.print ("Akhiri program \n ");
}


}