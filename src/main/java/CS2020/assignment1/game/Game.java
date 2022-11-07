/*package CS2020.assignment1.game;
import java.util.Scanner;

public class Game extends GameControls{
    public Game(int width, int height, int noOfShips){
        PlayerGameGrid.printGrid(int width, int height, int noOfShips);
        OpponentGameGrid.printGrid(int width, int height, int noOfShips);
    }

	public AbstractGameGrid getPlayersGrid (){
        return PlayerGameGrid.printGrid();
    }
	
	public AbstractGameGrid getOpponentssGrid (){
        return OpponentGameGrid.printGrid();
    }


    public void exitGame (String input){
        if (input == "exit"){
            System.out.println("Exiting game – thank you for playing... ");
            System.exit(0);
        }

    }

    public boolean checkVictory (){
        int count = 0;
        int count2 = 0;
        for (x = 0; x < ;x++){
            for (y = 0; y< ; y++){
                if (PlayerGameGrid.gameGrid[x][y] == "X"){
                    count += 1;
                    }else if(OpponentssGameGrid.gameGrid[x][y] == "X"){
                        count2 += 1;
                    }
                }    
            }
        }

    }

    public void playRound (String input){
        int xCoordinate = String.valueOf(input[0]);
        int yCoordinate = String.valueOf(input[2]);


    }




}*/
