
package matador;


public class Player {
    String name;
    Field currentField;
    
    public Player(String name, Field currentField) {
        this.name = name;
        this.currentField = currentField;
    }
    
    public void move (Dice dice) {
        currentField.setNumber(currentField.getNumber() + dice.throwDice());
    }
}
