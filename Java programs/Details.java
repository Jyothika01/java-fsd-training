import java.util.*;
public class Details  {

	public static void main(String args[]){
	   ArrayList<Double> arraylist = new ArrayList<Double>();
	   arraylist.add(1.52);
	   arraylist.add(2.38);
	   arraylist.add(3.64);
	   arraylist.add(4.75);

	   /*Unsorted List: ArrayList content before sorting*/
	   System.out.println("Before Sorting:");
	   for(Double str: arraylist){
			System.out.println(str);
		}

	   /* Sorting in decreasing order*/
	   Collections.sort(arraylist, Collections.reverseOrder());

	   /* Sorted List in reverse order*/
	   System.out.println("ArrayList in descending order:");
	   for(Double str: arraylist){
			System.out.println(str);
		}
	}
}