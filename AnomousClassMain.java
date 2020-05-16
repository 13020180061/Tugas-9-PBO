/*
        Nama    : St.Hatijah H.Ilyas
	Stambuk	: 13020180061
	Tanggal : 7 Mei 2020
	Waktu	: 23.02 WITA 	
*/

public class AnomousClassMain{
	public static AnomousClass tugas = new AnomousClass(){
		@Override
		public void tampilNama(){
			System.out.println("Berorientasi Objek");
		}
	};

	public static void main(String[] args){
		AnomousClass pbo = new AnomousClass(){
		@Override
		public void tampilNama(){
			System.out.println("Pemrograman");
		}
	};

	pbo.tampilNama();
	tugas.tampilNama();
	}
}