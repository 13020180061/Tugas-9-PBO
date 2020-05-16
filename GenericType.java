/*
        Nama    : St.Hatijah H.Ilyas
	Stambuk	: 13020180061
	Tanggal : 6 Mei 2020
	Waktu	: 23.01 WITA 	
*/

public class GenericType<T> {
	private T t;

	public void setNilai(T t){
		this.t = t;
	}
	
	public T getNilai(){
		return t;
	}
}