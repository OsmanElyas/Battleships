package CS2020.assignment1.game;
import java.util.Random;

public class BattleShip extends AbstractBattleShip{

    public BattleShip(String Name) {
        this.name = Name;
        Random rand = new Random();
        int ran = rand.nextInt(2);
        if(ran == 0){
            this.shipOrientation = "vertical";
        } 
        else if (ran == 1) {
            this.shipOrientation = "horizontal";
        }

    }

    public String getName(){
        return name;
    }

    public int getHits(){
        return hits;
    } 

    public String getShipOrientation(){
        return shipOrientation;
    }

    public void setHits(int numberOfHits){
        this.hits = numberOfHits;
    }

    public int[][] getShipCoordinates(){
        return shipCoordinates;
    }

    public void setShipCoordinates(int[][] coordinates){
        this.shipCoordinates = coordinates;
    }

    public boolean checkAttack(int row, int column){
        return true;}

   public boolean checkAttack(int row, int column){
        if (numberOfHits < 3){
            return false;
        } else {
            for (let i = 0; i < shipCoordinates.length; i++) {
                if(row == i and column == i){
                    return true;
                }
        }
        }
        return true;
    }


}


