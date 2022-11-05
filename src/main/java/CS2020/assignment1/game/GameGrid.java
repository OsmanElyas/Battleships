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
        int gridHeight == this.gameGrid.length;
        int gridWidth == this.gameGrid[0].length;
        int startX;
        int startY;
        int shipsLength == 3;

        Random rand = new Random();
        
        if (ship.Orientation == "vertical"){
            startY = rand.nextInt(gridHeight - shipsLength + 1);
            startX = rand.nextInt(gridWidth) ;            
        }else{
            startY = rand.nextInt(gridHeight) ;   
            startX = rand.nextInt(gridHeight - shipsLength + 1);
        }

        //get random coordinates. make sure they dont overspill. put on grid and store location.

        for (int i = 1; i <= numberOfShips; i++){
            ships[i] = ;
        }




}