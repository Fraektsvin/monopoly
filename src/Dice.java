/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matador;

/**
 *
 * @author sigur
 */
public class Dice {
    
    Die die1 = new Die(6);
    Die die2 = new Die(6);
    
    
    public int throwDice() {
        return die1.throwDie() + die2.throwDie();
    }
    
    public boolean checkDice() {
        return die1.throwDie() == die2.throwDie();
    }
}
