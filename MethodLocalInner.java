/*
        Nama    : St.Hatijah H.Ilyas
	Stambuk	: 13020180061
	Tanggal : 7 Mei 2020
	Waktu	: 22.42 WITA 	
*/

public class MethodLocalInner {
   	public void display(){
      		int bil = 17;
      
	class MethodLocal{
         	public void print() {
            		System.out.println("Ini adalah Method Local Inner dengan Bilangan "+bil);
         	}
      	}
      
	MethodLocal tugas = new MethodLocal();
      	tugas.print();
}
 	public static void main(String args[]){
      		MethodLocalInner pbo = new MethodLocalInner();
      		pbo.display();
   	}
}