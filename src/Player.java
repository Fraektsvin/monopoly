
import java.util.ArrayList;
import java.util.List;

public class Player {
    String name;
    Field currentField;
    private int money;
    private List<OwnebleField> ownsList = new ArrayList<>();

    public Player(String name, Field currentField) {
        this.name = name;
        this.currentField = currentField;
        this.money = MonopolyConstants.START_MONEY;
    }
    
    public void move (Dice dice) {
        currentField.setNumber(currentField.getNumber() + dice.throwDice());
    }

    public void setPos(int pos) {
        this.pos = pos;
    }
    public int getMoney() {
        return money;
    }
/*
der bruges throw new runtimeexception for at lave en konsekvens, programmet går ned hvis dette er tilfældet.
 */
    public void pay(int amount) {
        if (this.money < amount) {
          throw new RuntimeException("Spilleren har ikke nok penge");
        }
        this.money -= amount;
    }

    public List<OwnebleField> getOwnsList() {
        return ownsList;
    }
}
