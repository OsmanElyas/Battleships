package CS2020.assignment1.game;
import java.util.Scanner;

public class GameGrid extends AbstractGameGrid{

    public GameGrid(int Width, int Height, int noOfShips){
        this.width = Width;
        this.height = Height;
        this.numberOfShips = noOfShips;
    }
    
    public void initializeGrid(){
        for (int r = 0; r< width;r++){
            for (int c = 0; c < height;c++){
                System.out.print (gameGrid[r][c] + ".");
                }
            System.out.println();
            }
    }
    
    public void generateShips(int numberOfShips){
    for (int i = 0; i < numberOfShips; i++){
        String[] Ship[i] = {"*","*","*"};
        }
    }

    public void placeShip(AbstractBattleShip ship){
        return true;
    }



}