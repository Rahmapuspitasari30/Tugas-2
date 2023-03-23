/* Nim 	: 13020210093 
   Nama	: Rahma Puspitasari
   Hari/tanggal pengerjaan : Selasa 21 Maret 2023
   Waktu pengerjaan : 12.32 */

import java.util.Scanner;

/* Baca N, */
/* Print i = 1 s/d N dengan ITERATE */

public class PrintIterasi {

	public static void main(String[] args ){
		int N;
		int i;
		Scanner masukan=new Scanner(System.in);

		System.out.print ("Nilai N >0 = "); /* Inisialisasi */
		N = masukan.nextInt();
		i = 1;	/* First Elmt */
		System.out.print ("Print i dengan ITERATE : \n");
		for (;;){
			System.out.println (i); /* Proses */
			if (i == N)
				/* Kondisi Berhenti */ break;
			else{
				i++; /* Next Elmt */
			}
		} /* ( i == N ) */

	}

}