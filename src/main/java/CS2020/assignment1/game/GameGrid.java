import AbstractGameGrid;
import java.util.Scanner;

public class GameGrid extends AbstractGameGrid{
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter width, height and number of ships: ");

    int width = myObj.nextInt();
    int height = myObj.nextInt();
    int noOfShips = myObj.nextInt();

}