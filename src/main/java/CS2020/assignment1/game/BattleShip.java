import AbstractBattleShip;
import java.util.Random;

public class BattleShip extends AbstractBattleShip{

    public String getName{
        return name;
    }

    public int getHits{
        return hits;
    } 

    public String getShipOrientation{
        return shipOrientation;
    }

    public void setHits(int numberOfHits){
        this.numberOfHits = hits;
    }

    public int[][] getShipCoordinates{
        return shipCoordinates;
    }

    public void setShipCoordinates(int[][] coordinates){
        this.shipCoordinates = coordinates;
    }
}