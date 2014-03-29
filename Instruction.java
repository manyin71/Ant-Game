package ants;

import errors.InvalidFileException;

public class Instruction {
	
	String main;
	String sensedir;
	String lr;
	int marker;
	int flip;
	int state1;
	int state2;
	String condition;
	
	Instruction(String[] line) throws InvalidFileException{
		
		main = line[0];
		//set the rest based on what the main part is
		if(main.equals("sense")){
			sensedir = line[1];
			state1 = Integer.parseInt(line[2]);
			state2 = Integer.parseInt(line[3]);
			condition = line[4];
		}
		else if(main.equals("mark")){
			marker = Integer.parseInt(line[1]);
			state1 = Integer.parseInt(line[2]);
		}		
		else if(main.equals("unmark")){
			marker = Integer.parseInt(line[1]);
			state1 = Integer.parseInt(line[2]);
		}
		else if(main.equals("pickup")){
			state1 = Integer.parseInt(line[1]);
			state2 = Integer.parseInt(line[2]);
		}
		else if(main.equals("drop")){
			state1 = Integer.parseInt(line[1]);
		}
		else if(main.equals("turn")){
			lr = line[1];
			state1 = Integer.parseInt(line[2]);
		}
		else if(main.equals("move")){
			state1 = Integer.parseInt(line[1]);
			state2 = Integer.parseInt(line[2]);
		}
		else if(main.equals("flip")){
			flip = Integer.parseInt(line[1]);
			state1 = Integer.parseInt(line[2]);
			state2 = Integer.parseInt(line[3]);
		}
		else {
			throw new InvalidFileException("Instruction not well formed");
		}
		
	}

	public String getMain() {
		return main;
	}

	public String getSensedir() {
		return sensedir;
	}

	public String getLr() {
		return lr;
	}

	public int getMarker(){
		return marker;
	}
	public int getFlip() {
		return flip;
	}

	public int getState1() {
		return state1;
	}

	public int getState2() {
		return state2;
	}

	public String getCondition() {
		return condition;
	}
	
	

}
