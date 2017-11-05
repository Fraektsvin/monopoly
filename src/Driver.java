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
public class Driver {

    Field[] board = new Field[40];

    Player player1 = new Player("Antonio", board[0]);
    Player player2 = new Player("Sigurd", board[0]);
    
    Dice dice = new Dice();

    public void runGame()  {
            int winningNumber = 10;
            System.out.println("Velkommen til Matador!");
            System.out.println("Spiller: " + player1.name + " står på feldt " + player1.currentField);
            System.out.println("Spiller: " + player2.name + " står på feldt " + player2.currentField);
        while (winningNumber < 0) {
            //Spiller 1's tur
            System.out.println(player1.name + "'s tur:");
            System.out.println("Spiller: " + player1.name + " står på feldt " + player1.currentField);
            System.out.println("Du kaster terningerne og slår " + dice.throwDice());
            player1.move(dice);
            System.out.println("Spiller: " + player1.name + " rykker frem til feldt nummer " + player1.currentField.getNumber());
            //Spiller 2's tur
            System.out.println(player2.name + "'s tur:");
            System.out.println("Spiller: " + player2.name + " står på feldt " + player2.currentField);
            System.out.println("Du kaster terningerne og slår " + dice.throwDice());
            player2.move(dice);
            System.out.println("Spiller: " + player2.name + " rykker frem til feldt nummer " + player2.currentField.getNumber());
            winningNumber--;
        }
    }
}
