package ds_15;

//Java program to change
//elements of HashMap

import java.io.*;
import java.util.*;
class Hashmap7 {
 public static void main(String args[])
 {

     // Initialization of a HashMap
     HashMap<Integer, String> hm
         = new HashMap<Integer, String>();

     // Change Value using put method
     hm.put(1, "Geeks");
     hm.put(2, "Geeks");
     hm.put(3, "Geeks");

     System.out.println("Initial Map " + hm);

     hm.put(2, "For");

     System.out.println("Updated Map " + hm);
 }
}
