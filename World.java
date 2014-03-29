package world;

public class World {
	
	Cell[][] cells;
	
	World(Cell[][] cells){
		this.cells = cells;
	}
	
	/**
	 * Returns a cell for an ant to interact with based on their location
	 * @param x x coordinate on the world
	 * @param y y coordinate on the world
	 * @return The cell at coordinates x y
	 */
	Cell getCellAt(int x, int y){
		return cells[x][y];
	}
	
	/**
	 * Gets all the cells in the world. Used by GameDisplay for updating.
	 * @return All of the Cell objects held within the world object.
	 */
	Cell[][] getAllCells(){
		return cells;
	}

}
