/*
        Nama    : St.Hatijah H.Ilyas
	Stambuk	: 13020180061
	Tanggal : 6 Mei 2020
	Waktu	: 23.30 WITA 	
*/

public class MultipTypeParamMain {
	public static void main(String[] args) {
	MultipTypeParam<String, Integer> bio = new MultipTypeParam<>("Suga", 061);

	bio.setNama("Hatijah");
	bio.setNim(9993);

	System.out.println(bio.getNama());
	System.out.println(bio.getNim());
}
}