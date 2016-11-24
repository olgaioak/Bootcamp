package org.afdemp.bootcamp.exercises;

public class Game {
    int dice=0;
    public String play(){
        int zaria=0;
        if(dice == 0){
            dice = (int) (Math.random()*6+1);
            return ""+dice;
        }
        else{
            zaria=dice;
            dice = (int) (Math.random()*6+1);
            if(dice>zaria){
                dice=0;
                return "The first player has won.";                
            }
            else{
                dice=0;
                return "The second player has won.";    
            }   
        }
        
    }
  }
	
