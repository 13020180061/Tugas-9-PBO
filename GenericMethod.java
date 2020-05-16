/*
        Nama    : St.Hatijah H.Ilyas
	Stambuk	: 13020180061
	Tanggal : 6 Mei 2020
	Waktu	: 23.52 WITA 	
*/

public class GenericMethod{
	public static <E> void printArray( E[] inputArray ) {
		for(E element : inputArray) {
         	System.out.printf("%s ", element);
      	}
      	System.out.println();
}

   	public static void main(String args[]) {
       		Integer[] intArray = {1, 2, 3, 4, 5};
      		Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
      		Character[] charArray = {'H', 'A', 'T', 'I', 'J', 'A', 'H'};

	        System.out.println("Array integerArray :");
      		printArray(intArray);   

      		System.out.println("\nArray doubleArray :");
      		printArray(doubleArray);   

	        System.out.println("\nArray characterArray :");
      		printArray(charArray);
   	}
}