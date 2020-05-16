/*
        Nama    : St.Hatijah H.Ilyas
	Stambuk	: 13020180061
	Tanggal : 7 Mei 2020
	Waktu	: 00.34 WITA 	
*/

import java.util.Arrays;
import java.util.List;

public class UnboundWilcard {
   public static void printAll(List<?> list) {
      for (Object item : list)
         System.out.println(item + " ");
   }

   public static void main(String[] args) {
      List<Integer> integerList = Arrays.asList(1, 2, 3);
      printAll(integerList);
      List<Double> doubleList = Arrays.asList(1.2, 2.3, 3.5);
      printAll(doubleList);
   }
}