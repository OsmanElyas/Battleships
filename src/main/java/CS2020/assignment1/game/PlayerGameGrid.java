package CS2020.assignment1.game;

public class PlayerGameGrid extends GameGrid{
    public void printGrid(){
        for (int r = 0; r<board.length;r++){
            for (int c = 0; c <board.length;c++){
                System.out.print (board[r][c] + " ");
            }
            System.out.println();
        }
        
    }
}