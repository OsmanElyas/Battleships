package CS2020.assignment1.game;
import java.util.Random;

public class GameGrid extends AbstractGameGrid{

    public GameGrid(int Width, int Height, int noOfShips){
        this.width = Width;
        this.height = Height;
        this.numberOfShips = noOfShips;
        this.gameGrid = gameGrid[width][height];
    }
    
    public void initializeGrid(){

        for(int i = 0; i < width; i++){
            for (int c = 0; c < height; c++){
                gameGrid[i][c] = ".";
            }
        }
    }

    public void generateShips(int numberOfShips){
    for (int i = 1; i <= numberOfShips; i++){
        BattleShip ship[i] = new BattleShip("ship"+[i]);
        }
    }

    public void placeShip(AbstractBattleShip ship){
        for (int i = 1; i <= numberOfShips; i++){
            ships[i] = ;
            }
    }


}