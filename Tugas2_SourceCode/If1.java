/* Nim 	: 13020210093 
   Nama	: Rahma Puspitasari
   Hari/tanggal pengerjaan : Kamis 16 Maret 2023
   Waktu pengerjaan : 13.45 */

/* contoh pemakaian IF satu kasus */
/* membaca nilai integer, menuliskan nilainya jika positif */

import java.util.Scanner;

public class If1 {

	public static void main(String[] args) {
		Scanner masukan=new Scanner(System.in);
		int a;

		/* program */

		System.out.print ("Contoh IF satu kasus \n");
		System.out.print ("Ketikkan suatu nilai integer : ");
		a = masukan.nextInt();
		if (a >= 0)
		System.out.print ("\nNilai a positif "+ a);

}



}