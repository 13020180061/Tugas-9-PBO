/*
        Nama    : St.Hatijah H.Ilyas
	Stambuk	: 13020180061
	Tanggal : 6 Mei 2020
	Waktu	: 23.12 WITA 	
*/

public class GenericTypeMain {
	
	public static void main(String[] args){
		GenericType<Integer> nilaiInteger = new GenericType<>();
		nilaiInteger.setNilai(1711);
		System.out.println("Integer : " +nilaiInteger.getNilai());
		
		GenericType<String> nilaiString = new GenericType<>();
		nilaiString.setNilai("Contoh Menggunakan Generic Type");
		System.out.println("String : " +nilaiString.getNilai());

		GenericType<Boolean> nilaiBoolean = new GenericType<>();
		nilaiBoolean.setNilai(true);
		System.out.println("Boolean : " +nilaiBoolean.getNilai());
}
}