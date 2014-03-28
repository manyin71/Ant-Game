
public class World {
	
	Cell[][] cells;
	
	World(Cell[][] cells){
		this.cells = cells;
	}
	
	Cell getCellAt(int x, int y){
		return cells[x][y];
	}
	
	Cell[][] getAllCells(){
		return cells;
	}

}
