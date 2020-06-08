//A+ Computer Science  -  www.apluscompsci.com
//Name - Michelle Lin
//Date - 01.13.20
//Class - Period 5

import java.util.Scanner;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
		this("");
	}

	public RockPaperScissors(String player)
	{
		playChoice = player;
		int computer = (int) (Math.random() * 3);
		switch(computer)
		{
			case 0: 
				compChoice = "R";
				break;
			case 1: 
				compChoice = "P";
				break;
			case 2: 
				compChoice = "S";
				break;
		}
	}

	public String determineWinner()  //before
	{
		String winner="";
		if(playChoice.equals("R") && compChoice.equals("S"))
			winner = "Player wins <<Rock Breaks Scissors>>";
		else if(playChoice.equals("P") && compChoice.equals("R"))
			winner = "Player wins <<Paper Covers Rock>>";
		else if(playChoice.equals("S") && compChoice.equals("P"))
			winner = "Player wins <<Scissors Cuts Paper>>";
		else if(playChoice.equals("S") && compChoice.equals("R"))
			winner = "Computer wins <<Rock Breaks Scissors>>";
		else if(playChoice.equals("R") && compChoice.equals("P"))
			winner = "Computer wins <<Paper Covers Rock>>";
		else if(playChoice.equals("P") && compChoice.equals("S"))
			winner = "Computer wins <<Scissors Cuts Paper>>";
		else
			winner = "Draw Game!";

		return winner;
	}
	
	// better 2.5
	public String determineWinner3()
	{
		String winner="";
		if(playChoice.equals(compChoice))
			winner = "Draw Game!";
		else if(playChoice.equals("R"))
			if (compChoice.equals("S"))
				winner = "Player wins <<Rock Breaks Scissors>>";
			else
				winner = "Computer wins <<Paper Covers Rock>>";
		else if(playChoice.equals("P"))
			if(compChoice.equals("R"))
				winner = "Player wins <<Paper Covers Rock>>";
			else
				winner = "Computer wins <<Scissors Cuts Paper>>";
		else
			if(compChoice.equals("P"))
				winner = "Player wins <<Scissors Cuts Paper>>";
			else
				winner = "Computer wins <<Rock Breaks Scissors>>";
		

		return winner;
	}

	// better 2.0
	public String determineWinner2()
	{
		String winner ="";
		if (playChoice.equals(compChoice))
			winner = "Draw Game";
		else if(playChoice.equals("R") && compChoice.equals("S"))
			winner = "Player";
		else if (playChoice.equals("P") && compChoice.equals("R"))
			winner = "Player";
		else if (playChoice.equals("S") && compChoice.equals("P"))
			winner = "Player";
		else 
			winner = "Computer";
		return winner;
	}

	public String toString()
	{
		return "Player had " + playChoice + "\nComputer had " + compChoice;
		
	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		while(true)
		{
			System.out.print("Rock-Paper-Scissors choose your weapon[R, P, S]:: ");
			String player = kb.next().toUpperCase();
			RockPaperScissors rps = new RockPaperScissors(player);
			System.out.println(rps);
			System.out.println(rps.determineWinner());
			System.out.print("Do you want to play again?  ");
			if(!kb.next().equals("yes"))
				break;
		}
		kb.close();
	}
}