
public class Cell {
	
	String state;
	int food = 0;

	Cell(String state){
		this.state = state;
	}
	
	String getState(){
		return state;
	}
	
	void addFood(int x){
		food += x;
	}
	
	void removeFood(int x){
		food -= x;
	}
	
	
}
