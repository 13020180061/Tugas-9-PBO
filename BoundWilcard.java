/*
        Nama    : St.Hatijah H.Ilyas
	Stambuk	: 13020180061
	Tanggal : 7 Mei 2020
	Waktu	: 01.00 WITA 	
*/

import java.util.Arrays;
import java.util.List;

public class BoundWilcard{
	public static double sum(List<? extends Number> numberlist){
		double sum = 0.0;
		for(Number x : numberlist) 
			sum += x.doubleValue();
			return sum;
	}

	public static void main(String[] args){
		List<Integer> integerList = Arrays.asList(1, 2, 3);
		System.out.println("Hasil Integer = " +sum(integerList));

		List<Double> doubleList = Arrays.asList(1.2, 2.3, 3.5);
		System.out.println("Hasil Double = " +sum(doubleList));
	}
}