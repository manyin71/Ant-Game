package world;
import errors.*;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class WorldGenerator {

	String path = "C:/Users/Joe/Desktop/Map.txt";
	BufferedReader bfr;
	int x;
	int y;
	Cell[][] cells;
	World world;
	
	
	//creates a world from a given path
	WorldGenerator(String path){
		
		this.path = path;
		try{
			world = generateWorld();
		}
		catch (InvalidFileException e){
			System.out.println(e);
		}
		
	}
	
	
	WorldGenerator(){
		randomWorld();
	}
	
	World generateWorld() throws InvalidFileException{
		
		//lines seperated with a space
		//read first line  for x coord
		//read second line for y coord
		//y more lines to read
		
		try {
			FileReader fr = new FileReader(path);
			bfr = new BufferedReader(fr);
		} catch (FileNotFoundException e) {
			//show error
		}
		
		//get the map size as integers and store
			try {
				x = Integer.parseInt(bfr.readLine());
				y = Integer.parseInt(bfr.readLine());
				cells = new Cell[x][y];
				
				for (int i = 0; i < x; i++){
					char[] lineCharacters = bfr.readLine().trim().toCharArray();
					if (lineCharacters.length != y){
						throw new InvalidFileException("Incorrect number of lines specified");
					}
					for (int j = 0; j < y; j++){
						Character current = lineCharacters[j];
						//make a new cell at i,j with the correct attributes that current represents
						
						//rockycell
						if (current == "#".charAt(0)){
							cells[i][j] = new Cell("Rocky");
							System.out.println("Rocky");
						}
						//clear cell
						else if (current == ".".charAt(0)){
							cells[i][j] = new Cell("Clear");
							System.out.println("Clear");
						}
						//red anthill
						else if (current == "+".charAt(0)){
							cells[i][j] = new Cell("Red Anthill");
							cells[i][j].setOccupied(true);
							System.out.println("Red Anthill");
						}
						//black anthill
						else if (current == "-".charAt(0)){
							cells[i][j] = new Cell("Black Anthill");
							cells[i][j].setOccupied(true);
							System.out.println("Black Anthill");
						}
						//food particles 1 to 9
						else if (Character.isDigit(current) && current != "0".charAt(0)){
							cells[i][j] = new Cell("Food");
							//add the food to the cell
							cells[i][j].addFood(Character.getNumericValue(current));
							System.out.println(current + " food");
						}
						else{
							
							throw new InvalidFileException("Invalid character at position " + i + " " + j);
						}
					}
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				
				e.printStackTrace();
			}
			
			//put all the cells created in a new world holder
			return new World(cells);
		
	}
	
	void randomWorld(){
		
		x = 150;
		y = 150;
	}
	
	public static void main(String[] args){
		new WorldGenerator("C:/Users/Joe/Desktop/Map.txt");
	}
}
