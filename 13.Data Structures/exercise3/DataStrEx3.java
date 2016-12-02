package exercise3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DataStrEx3<T, E> {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
	
	    hmap.put(12, "Chaitanya");
        hmap.put(2, "Rahul");
        hmap.put(7, "Singh");
        hmap.put(49, "Ajeet");
        hmap.put(3, "Anuj");
        
        HashMap<Integer, String> hmapp = new HashMap<Integer, String>();
        
        hmapp.put(2, "Rahul");
        hmapp.put(7, "Singh");
        hmapp.put(8, "Singh");
        
        HashMap<Integer, String> myhash = intersection(hmap,hmapp);
        System.out.println(myhash);
	
	}
	
	public static <T, E> HashMap<T, E> intersection(HashMap<T,E> hm1 , HashMap <T, E> hm2){
		
		HashMap<T, E> hmap = new HashMap<T, E>();
		
		Iterator<T> iterator = hm2.keySet().iterator();
		
		while(iterator.hasNext()){
			T entry2 =  iterator.next(); // entry2 einai to kathe kleidi tou hm2
				
			if (hm1.containsKey(entry2))
				hmap.put(entry2, hm2.get(entry2));
			}
	
		return hmap;

	}

}
