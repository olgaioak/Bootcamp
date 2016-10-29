

import java.util.ArrayList;

public class BootCampAdministration {

	//Create a private ArrayList with object of BootCampCandidates with name anArrayListOfBootCamps
	private ArrayList<BootCampCandidates> anArrayListOfBootCamps;

	
	//Create a constructor which receives an array with BootCampCandidate objects and 
	//initializes the anArrayListOfBootCamps ArrayList by adding all BootCampCandidate array's
	//elements in the the nArrayListOfBootCamps
	BootCampAdministration (BootCampCandidates [] candidatesArray){
		anArrayListOfBootCamps = new ArrayList<BootCampCandidates>();
		for (int i=0;i<candidatesArray.length;i++){
			this.anArrayListOfBootCamps.add(candidatesArray[i]); 
		}
		
	}
	
	//Create setters and getters for BootCampAdministration
	public void setArrayList (ArrayList<BootCampCandidates> anArrayListOfBootCamps){this.anArrayListOfBootCamps=anArrayListOfBootCamps;}
	public ArrayList<BootCampCandidates> getArrayList(){return this.anArrayListOfBootCamps;}
	
	//create an int method that returns the size of anArrayListOfBootCamps
	public int arraySize(ArrayList<BootCampCandidates> anArrayListOfBootCamp){
		return this.anArrayListOfBootCamps.size();
	}

	//Create a method that adds a new BootCampCandidate inside the ArrayList
	public void arrayAdd(BootCampCandidates c){
		this.anArrayListOfBootCamps.add(c);	
	}
	
	//Create a method that removes a candidate by name and returns true if found or false if not
	//HINT: you have to use get() to get the object and equals to compare it
	public boolean arrayRemove(String name){
		for(int i=0;i<this.anArrayListOfBootCamps.size();i++){
			if (this.anArrayListOfBootCamps.get(i).getName().equals(name)){
				this.anArrayListOfBootCamps.remove(i);
				return true;
			} 
		}
		return false;
		
	}

	//Create a method to search for a boot camp member by surname and returns a string with its information
	// if it's found and null if it's not found
	public String searchSurname(String surname){
		for(int i=0;i<this.anArrayListOfBootCamps.size();i++){
			if (this.anArrayListOfBootCamps.get(i).getSurname().equals(surname)){
				return this.anArrayListOfBootCamps.get(i).toString();
			}
		}
		return null;
		
	}

	//Create a method that can change a bootcampers age by having as input its name and surname
	public void changeAge (String name, String surname, int age){
		for(int i=0;i<this.anArrayListOfBootCamps.size();i++){
			if (this.anArrayListOfBootCamps.get(i).getSurname().equals(surname) & this.anArrayListOfBootCamps.get(i).getName().equals(name)){
				this.anArrayListOfBootCamps.get(i).setAge(age);
			}
		}
		 
	}

	
}
