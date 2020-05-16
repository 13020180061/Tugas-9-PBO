/*
    	Nama	: St.Hatijah H.Ilyas
	Stambuk : 13020180061
	Tanggal	: 7 Mei 2020
	Waktu	: 19.25 WITA
*/  

public class AbstInterKucing extends AbstInterBinatang<T1,T2> implements AbstInterKarnifora{
 private String suara;
 private String warnaBulu;

  public AbstInterKucing (String nama, int jmlKaki, String suara, String warnaBulu){
  AbstInterBinatang<String, Integer> a = AbstInterBinatang<"bbb">("aa");
  a String.nama, Integer.jmlKaki;
  this.suara=suara;
  this.warnaBulu=warnaBulu;
 }
  public void displayMakan(){
  System.out.println("Jenis: "+jenisK);
  System.out.println("Makanan: "+makananK);
 }
 public void displayBinatang(){
  System.out.println("Nama: "+getNama());
  System.out.println("Jumlah Kaki: "+getKaki());
 }
 public void displayData(){
  displayMakan();
  displayBinatang();
  System.out.println("Suara: "+suara);
  System.out.println("Warna Bulu: "+warnaBulu);
 }
}