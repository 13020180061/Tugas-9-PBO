/*
        Nama    : St.Hatijah H.Ilyas
	Stambuk	: 13020180061
	Tanggal : 6 Mei 2020
	Waktu	: 23.23 WITA 	
*/


public class MultipTypeParam <T1,T2> {
	private T1 nama;
	private T2 nim;
	
	public MultipTypeParam(T1 nama, T2 nim){
		this.nama = nama;
		this.nim = nim;
	}

	public T1 getNama() {
		return nama;
	}
	
	public void setNama(T1 nama) {
		this.nama = nama;
	}

	public T2 getNim() {
		return nim;
	}

	public void setNim(T2 nim) {
		this.nim = nim;
	}
}