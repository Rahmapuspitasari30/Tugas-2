/* Nim 	: 13020210093 
   Nama	: Rahma Puspitasari
   Hari/tanggal pengerjaan : Kamis 16 Maret 2023
   Waktu pengerjaan : 13.45 */

/* contoh pemakaian IF dua kasus komplementer */
/* Membaca sebuah nilai, */
/* menuliskan 'Nilai a positif , nilai a' jika a >=0 */
/* 'Nilai a negatif , nilai a', jika a <0 */

import java.util.Scanner;

public class If2 {

	public static void main(String [] args) {
		int a;
		Scanner masukan=new Scanner(System.in);

		/* Program */
		System.out.print ("Contog IF dua kasus \n");
		System.out.print("Ketikkan suatu nilai integer : ");
		a=masukan.nextInt();

		if (a >= 0){
			System.out.println ("Nilai a positif "+ a);
		}else  /* a< 0 */
		{
			System.out.println ("Nilai a negatif "+ a);
		}
}


}