import java.util.*;
public class Pgm1  {

	public static void main(String args[]){
	   ArrayList<Double> arraylist = new ArrayList<Double>();
	   arraylist.add(1.52);
	   arraylist.add(2.38);
	   arraylist.add(3.64);
	   arraylist.add(4.75);

	   System.out.println("ArrayList:");
	   for(Double arr: arraylist){
			System.out.println(arr);
		}

	   Collections.sort(arraylist, Collections.reverseOrder());

	   System.out.println("ArrayList in descending order:");
	   for(Double arr: arraylist){
			System.out.println(arr);
		}
	}
}

or

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDouble {

	public static void main(String[] args) {
		ArrayList<Double> s=new ArrayList<Double>();
		s.add(45.01);
		s.add(56.23659);
		s.add(21.231);
		s.add(96.2356);
		s.add(2.013);
		s.add(11.23);
		System.out.println("Before Sorting : " + s);
		
		System.out.println("----------------------------------");
		Collections.sort(s,Collections.reverseOrder());
		System.out.println("After Sorting : " + s);
		
		

	}

}
