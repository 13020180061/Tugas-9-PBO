/*
    	Nama	: St.Hatijah H.Ilyas
	Stambuk : 13020180061
	Tanggal	: 7 Mei 2020
	Waktu	: 19.23 WITA
*/  

public abstract class AbstInterBinatang<T1,T2>{
 protected T1 nama;
 protected T2 jmlKaki;

  public AbstInterBinatang(T1 nama, T2 jmlKaki){
  this.nama=nama;
  this.jmlKaki=jmlKaki;
 }
  public void setNama(T1 nama){
  this.nama=nama;
 }
 public T1 getNama(){
  return nama;
 }
 public void setKaki(T2 jmlKaki){
  this.jmlKaki=jmlKaki;
 }
 public T2 getKaki(){
  return jmlKaki;
 }
 public void displayBinatang(){
  System.out.println("Nama: "+getNama());
  System.out.println("Jumlah Kaki: "+getKaki());
 }
 }