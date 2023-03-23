/* Nim 	: 13020210093 
   Nama	: Rahma Puspitasari
   Hari/tanggal pengerjaan : Selasa 21 Maret 2023
   Waktu pengerjaan : 12.48 */


import java.util.Scanner;

public class PrintRepeat {

	public static void main(String [] args) {
		int N;
		int i;
	Scanner masukan=new Scanner(System.in);
	/* program */
	System.out.print (" Nilai N >0 = ");
	/* Inisialisasi */
	N= masukan.nextInt();
	i = 1;
	/* First Elmt */
	System.out.print ("Print i dengan REPEAT : \n");
	do{
		System.out.print (i+"\n"); /* proses */
		i++; /* Next Elmt */
	}
	
	while (i <= N ); /* Kondisi pengulangan */


}



}