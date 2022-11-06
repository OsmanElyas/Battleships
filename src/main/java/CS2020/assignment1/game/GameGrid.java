package CS2020.assignment1.game;
import java.util.Random;

public class GameGrid extends AbstractGameGrid{

    public GameGrid(int width, int height, int noOfShips){

        this.gameGrid = new String[width][height];
        initializeGrid();
        generateShips(noOfShips);

    }
    
    public void initializeGrid(){

        for(int i = 0; i < gameGrid.length; i++){
            for (int c = 0; c < gameGrid[0].length; c++){
                gameGrid[i][c] = ".";
            }
        }
    }

    public void generateShips(int numberOfShips){
    ships = new BattleShip[numberOfShips];
    for (int i = 0; i < numberOfShips; i++){
        ships[i] = new BattleShip("Ship "+(i+1));
        }
    }

    public void placeShip(AbstractBattleShip ship){
            //get random coordinates. make sure they dont overspill. put on grid and store location.


        int gridHeight == this.gameGrid.length();
        int gridWidth == this.gameGrid[0].length();
        int shipsLength == 3;
        int[][] shipsCoordinates = new int[3][2];
        int startX;
        int startY;
        
        

        Random rand = new Random();
        
        if (ship.Orientation == "vertical"){
            startY = rand.nextInt(gridHeight - shipsLength + 1);
            startX = rand.nextInt(gridWidth) ;   
            for(i = 0; i < 3; i++){
                shipsCoordinates[i][0] = startX;
                shipsCoordinates[i][1] = startY + i;
            }    
        }else{
            startY = rand.nextInt(gridHeight) ;   
            startX = rand.nextInt(gridHeight - shipsLength + 1);
            for(i = 0; i < 3; i++){
                shipsCoordinates[i][0] = startX + 1;
                shipsCoordinates[i][1] = startY;
            }  
            
        }
        ship.setShipCoordinates(shipsCoordinates);

    }


}