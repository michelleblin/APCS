//A+ Computer Science  -  www.apluscompsci.com
//Name - Michelle Lin
//Date - 01.13.20
//Class - Period 5

import java.util.Scanner;

public class RoShamBest
{
	private int playChoice;
    private int compChoice;


	public RoShamBest()
	{
		this("");
	}

	public RoShamBest(String player)
	{   
        String key = "RPS";
		playChoice = key.indexOf(player);
        compChoice = (int) (Math.random() * 3);

	}

    private boolean winnerPlayer()
    {   
		return (playChoice >0) ? compChoice == (playChoice-1): compChoice == (playChoice+2);
    }

    public String determineWinner()
    {
        String winner = "";
        if(playChoice == compChoice)
            winner = "Draw Game";
        else if (winnerPlayer())
            winner = "Player";
        else
            winner = "Computer";
        return winner;
    }

	public String toString()
	{
        String key = "RPS";
		return "Player had " + key.charAt(playChoice) + "\nComputer had " + key.charAt(compChoice);
		
	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		while(true)
		{
			System.out.print("Rock-Paper-Scissors choose your weapon[R, P, S]:: ");
			String player = kb.next().toUpperCase();
			RoShamBest game = new RoShamBest(player);
			System.out.println(game);
			System.out.println(game.determineWinner());
			System.out.print("Do you want to play again?  ");
			if(!kb.next().equals("yes"))
				break;
		}
		kb.close();
	}
}