import java.util.ArrayList;

import org.javatuples.Pair;

public class OurLibary {
	
	//ArrayList of pairs
	ArrayList<Pair<String, Integer>> dictionary;
	
	
	//Constructor
	public OurLibary(){
	
		dictionary = new ArrayList<Pair<String, Integer>>();
	
	}
	
	//add method to insert new key value pair into dictionary
	void add_item(String a, int b) 
	{
		Pair<String, Integer> pair  = Pair.with(a, b);
		
		dictionary.add(pair);
		
	}
	
	//To display all the key value pairs in stored in dictionary
	void display() 
	{
	   System.out.println("Key:           Value");
	   for (int i = 0; i< dictionary.size();i++) 
	   {
		   Pair<String, Integer> p= dictionary.get(i); 
		   System.out.println(p.getValue0()+":      "+p.getValue1());
		   
	   }
	   
	}
	
}
