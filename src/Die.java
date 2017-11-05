
import java.util.Random;
/**
 *
 * @author Antonio
 */
public class Die {
    int sides;
    private int lastThrow;
    Random random = new Random();

    public Die(int sides) {
        this.sides = sides;
    }
    public int throwDie(){
        this.lastThrow = random.nextInt(sides + 1);
        return this.lastThrow;
    }

    public int lastThrow() {
        return lastThrow;
    }
}