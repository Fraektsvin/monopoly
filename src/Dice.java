
public class Dice {

    Die die1 = new Die(6);
    Die die2 = new Die(6);

    public int throwDice() {
        return die1.throwDie()+ die2.throwDie();

    }
    public boolean sameDice() {
        return die1.lastThrow()== die2.lastThrow();
    }
    public int lastThrow() {
        return die1.lastThrow()+die2.lastThrow();

    }
}