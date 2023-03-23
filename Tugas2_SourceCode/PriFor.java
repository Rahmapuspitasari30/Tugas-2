/* Nim 	: 13020210093 
   Nama	: Rahma Puspitasari
   Hari/tanggal pengerjaan : Selasa 21 Maret 2023
   Waktu pengerjaan : 12.06 */

import java.util.Scanner;

/* Baca N, Print 1  s/d N dengan FOR */

public class PriFor {

	public static void main(String[] args) {
		int i,N;
		Scanner masukan=new Scanner(System.in);

		System.out.print (" Baca N, print 1 s/d N ");
		System.out.print (" N = ");

		N=masukan.nextInt();

		for (i = 1; i <= N; i++){
		System.out.println (i); };
		System.out.println ("Akhiri program \n");
		}


}