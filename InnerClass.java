/*
        Nama    : St.Hatijah H.Ilyas
	Stambuk	: 13020180061
	Tanggal : 7 Mei 2020
	Waktu	: 22.01 WITA 	
*/

public class InnerClass {
    	private static class Programming{
        	private String bahasa;
        private void setBahasa(String bahasa){
            this.bahasa = bahasa;
        }
        private String getBahasa(){
            return bahasa;
        }
}
    
    	public static void main(String[] args){
        	InnerClass.Programming bahasaku = new InnerClass.Programming();
	        bahasaku.setBahasa("PBO");

	        System.out.println("Saya Sedang Belajar : "+bahasaku.getBahasa());
    	}
}