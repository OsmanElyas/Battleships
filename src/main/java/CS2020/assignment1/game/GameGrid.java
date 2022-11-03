package CS2020.assignment1.game;
import java.util.Scanner;

public class GameGrid extends AbstractGameGrid{
    public GameGrid{
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter width, height and number of ships: ");

        int width = myObj.nextInt();
        int height = myObj.nextInt();
        int noOfShips = myObj.nextInt();
    }

    public void initializeGrid(){

    }

    public void generateShips(int numberOfShips){
        
    }

}