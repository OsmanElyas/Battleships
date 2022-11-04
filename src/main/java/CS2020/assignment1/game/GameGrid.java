package CS2020.assignment1.game;
import java.util.Scanner;

public class GameGrid extends AbstractGameGrid{
    
    public GameGrid(int shipWidth, int shipHeight, int numberOfShips){
        this.width = shipWidth;
        this.height = shipHeight;
        this.noOfShips = numberOfShips;
    }
    
    public void initializeGrid(){
        for (int r = 0; r< width;r++){
            for (int c = 0; c < height;c++){
                System.out.print (board[r][c] + ".");
                }
            System.out.println();
            }
    }

    public void placeShip(){
        return true;
    }

    public void generateShips(int numberOfShips){
        return true;
    }

}