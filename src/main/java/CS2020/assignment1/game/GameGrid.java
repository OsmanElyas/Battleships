package CS2020.assignment1.game;
import java.util.Random;

public class GameGrid extends AbstractGameGrid{

    public GameGrid(int width, int height, int noOfShips){

        this.gameGrid = new String[width][height];
        initializeGrid();

    }
    
    public void initializeGrid(){

        for(int i = 0; i < gameGrid.length; i++){
            for (int c = 0; c < gameGrid[0].length; c++){
                gameGrid[i][c] = ".";
            }
        }
    }

    public void generateShips(int numberOfShips){
        }

    public void placeShip(AbstractBattleShip ship){
        }





    public void placeShip(AbstractBattleShip ship){
        for (int i = 1; i <= numberOfShips; i++){
            ships[i] = ;
            }
    }*/


}