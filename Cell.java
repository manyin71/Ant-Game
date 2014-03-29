package world;

import errors.InvalidMoveException;

public class Cell {
	
	String state;
	int food = 0;
	Boolean occupied = false;;

	Cell(String state){
		this.state = state;
	}
	
	String getState(){
		return state;
	}
	
	Boolean isOccupied(){
		return occupied;
	}
	
	void setOccupied(Boolean set){
		occupied = set;
	}
	
	void addFood(int x){
		if(state.equals("Clear")){
			state = "Food";
			food += x;
		}
		else {
			food += x;
		}
	}
	
	void removeFood(int x) throws InvalidMoveException{
		
		food -= x;
		if (food == 0){
			state = "Clear";
		}
	
	}
	
	
}
