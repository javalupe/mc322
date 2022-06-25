import java.awt.Point;
import java.util.Random;

public class Coordinate extends Point {
    private static final Board board = Board.getInstance();
    private static final Random rand = new Random();

    public Coordinate(int x, int y){
        super(x, y);
    }

    public boolean equals(Coordinate coord){
        return (this.x == coord.x) && (this.y == coord.y);
    }

    public Coordinate clone(){
        return new Coordinate(this.x, this.y);
    }

    public static Coordinate randomCoordinate(){
        int x = rand.nextInt(board.getGridSize()) * board.getActorSize();
        int y = rand.nextInt(board.getGridSize()) * board.getActorSize();
        return new Coordinate(x, y);
    }

    public void towards(Direction dir){
        switch(dir){
            case UP: this.y -= 1; break;
            case DOWN: this.y += 1; break;
            case RIGHT: this.x += 1; break;
            case LEFT: this.x -= 1; break;
        }
    }
}