package matador;

import java.util.Random;


public class Die {
    int sides;
    Random random = new Random();
    
    public Die(int sides) {
        this.sides = sides;
    }
    
    public int throwDie() {
        return random.nextInt(sides + 1);
    }
}
