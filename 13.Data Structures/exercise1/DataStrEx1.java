package exercise1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class DataStrEx1<T> {
	
	public static <T> Set<T> intersection(List<T> list1, List<T> list2){
		Set<T> hset1 = new HashSet<T>();
		for (int i=0; i<list1.size();i++){
			if (list2.contains(list1.get(i))){
				hset1.add(list1.get(i));	
			}
		}
		
//		Iterator <T> it = list1.iterator<T>();
//		while (it.hasNext()){
//			if (list2.contains(list1.get(i))){
//				hset1.add(list1.get(i));	
//			}
//		}
		return hset1;
		
	}
	
	public static <T> Set<T> union(List<T> list1, List<T> list2){
		Set<T> hset1 = new HashSet<T>();
		hset1.addAll(list1);
		hset1.addAll(list2);
//		for (int i=0; i<list2.size();i++){
//			hset1.add(list2.get(i));
//		}
		return hset1;
		
	}
	
	public static void main(String []args){
		List<String> lista1 = new ArrayList<String>();
		lista1.add("Olga");
		lista1.add("Anna");
		List<String> lista2 = new ArrayList<String>();
		lista2.add("Dimitris");
		lista2.add("Dimitris");
		Set<String> set = union(lista1,lista2);
		System.out.println(set);
		Set<String> set1 = intersection(lista1,lista2);
		System.out.println(set1);
		
	}

}
