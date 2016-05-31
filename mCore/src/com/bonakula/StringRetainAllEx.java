package com.bonakula;

import java.util.ArrayList;
/**
 * mutually exclusive items
 * @author madhu bonakula
 *
 */
public class StringRetainAllEx {
	
	public static void main(String...strings) {
		
		// create an empty array list   
	    ArrayList<String> color_list = new ArrayList<String>();
	    ArrayList<String> color_nonmatch_list = new ArrayList<String>();
	  
	    // use add() method to add values in the list  
	    color_list.add("White");  
	    color_list.add("Black");  
	    color_list.add("Red");
	    
	    color_nonmatch_list.add("sss");  
	    color_nonmatch_list.add("dd");  
	    color_nonmatch_list.add("Rssed");
	     
	   // create an empty array sample with an initial capacity   
	    ArrayList<String> sample = new ArrayList<String>();  
	      
	   // use add() method to add values in the list   
	    sample.add("Green");   
	    sample.add("Red");   
	    sample.add("White");  
	          
	    System.out.println("First List :"+ color_list);  
	    System.out.println("Second List :"+ sample);  
	      
	    sample.retainAll(color_list);  
	      
	    System.out.println("After applying the method, First List :"+ color_list);  
	    System.out.println("After applying the method, Second List :"+ sample);  
	    
	    sample.retainAll(color_nonmatch_list);
	    System.out.println("After applying the method, with not match list :"+ sample);
	      
	  }  

}
