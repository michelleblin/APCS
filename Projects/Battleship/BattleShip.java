import java.util.Arrays;
import java.util.Scanner;


// have fun reading 200 lines of code ;)
public class BattleShip
{
  private String[][] board, playerTurns;
  private String[] shipName;
  private int[] shipLength;
  private int turns, shipsSunk;

  public BattleShip()
  {
    shipName = new String[]{"Carrier", "BattleShip", "Crusier", "Submarine", "Destroyer"};
    shipLength = new int[]{5, 4, 3, 3, 2};
    board = new String[10][10];
    playerTurns = new String[10][10];
    for(int i=0; i<board.length; i++)
    {
      Arrays.fill(board[i], "");
      Arrays.fill(playerTurns[i], "   ");
    }
    turns = 0;
    shipsSunk=0;
  }

  private void generateShips()
  {
    for(int i=0; i<shipName.length; i++)
      addShip(shipName[i], shipLength[i]);

    // for(String[] row: board)
    //     System.out.println(Arrays.toString(row));

  }

  // checks if the ship is in bounds and no overlap by
  // making sure that all the cell is an empty string
  private boolean shipLocValid(int row, int col, int dirction, int length)
  {
    if(dirction == 0)
    {
      if(col+length>9)
          return false;
      for(int i=col; i<col+length; i++)
        if(!board[row][i].equals(""))
          return false;
    }
    else
    {
      if(row+length>9)
          return false;
      for(int i=row; i<row+length; i++)
        if(!board[i][col].equals(""))
          return false;
    }

    return true;
  }

  /* generates random location(row, col) until a valid location is found
    direction: 0=horizontal  1=verticle
    fills cells with ship name */
  private void addShip(String name, int length)
  {
    int row = (int) (Math.random() * 10);
    int col = (int) (Math.random() * 10);
    int dirction = (int) (Math.random() * 2);
    while (!shipLocValid(row, col, dirction, length))
    {
       row = (int) (Math.random() * 10);
       col = (int) (Math.random() * 10);
    }
    if(dirction == 0)
       for(int i=col; i<col+length; i++)
         board[row][i] = name;
    else
       for(int i=row; i<row+length; i++)
         board[i][col] = name;
  }

  // checks if all 5 ships are sunk
  // returns true is all are sunk
  //         false if not
  private boolean gameOver()
  {
    return shipsSunk==shipName.length;
  }

  // loops through the whole board and checks if there are anymore referenes of the ships
  // return true if no more and increases shipsSunk
  //        false if there still are
  private boolean isSunk(String name)
  {
    for(String[] row: board)
      for(String col: row)
        if(col.equals(name))
          return false;
    shipsSunk++;
    return true;
  }

  // checks the cordinates(row, col) on the board to see if the ship is hit
  // if the cell is empty, it marks 'O' on the player's board and returns false
  // if the cell is not empty, it marks 'X' on the player's board and returns true
  private boolean hit(int row, int col)
  {
    if(board[row][col].equals(""))
    {
      playerTurns[row][col] = " O ";
      return false;
    }
    else
    {
      playerTurns[row][col] = " X ";
      board[row][col] = "";
      return true;
    }
  }

  // checks to see if attack is inside the board or not already targeted
  private boolean isValidAttack(int row, int col)
  {
    if(row>9 || row<0 || col>9 || col<0)
    {
      System.out.println("Out of bounds!");
      return false;
    }
    else if(!playerTurns[row][col].equals("   "))
    {
      System.out.println("Already targeted");
      return false;
    }
    return true;
  }

  // prints the player's board with row, col and grid
  private void printBoard()
  {
    System.out.println("    A   B   C   D   E   F   G   H   I   J ");
    for(int i=0; i<playerTurns.length; i++){
      for(int j=0; j<playerTurns[0].length+1; j++)
      {
        if(j==0)
          System.out.print(i +" ");
        else
          System.out.print("|" + playerTurns[i][j-1]);
      }
    System.out.println("\n");
    }
  }

  // prints the game instructions
  // asks for user input until game is over or user enters 'end'
  public void playGame()
  {
    Scanner kb = new Scanner(System.in);
    System.out.println("Welcome to Battleship!");
    System.out.println("Goal: sink all five ships in as few moves possible");
    System.out.println("X=hit   O=miss");
    System.out.println("Please enter location in row, col format(ex. A5)");
    System.out.println("enter 'end' to end game");
    System.out.print("Press enter to start");
    kb.nextLine();
    generateShips();
    String rowLetter = "ABCDEFGHIJ";
    String guess = "";
    while(!gameOver() && !guess.equals("end"))
    {
      printBoard();
      System.out.print("Enter Guess:   ");
      guess = kb.nextLine();
      int col = 100;
      int row = 100;
      // ensures the program doesm't break when Invalid input is given
      try{
          col = rowLetter.indexOf(guess.substring(0,1).toUpperCase());
          row = Integer.parseInt(guess.substring(1));
      }
      catch(StringIndexOutOfBoundsException | NumberFormatException ex)
      {
          if (!guess.equals("end"))
            System.out.println("Invalid input!");
          else
            System.out.println("BOO...YOU SUCK!!!");
          continue;
      }
      if(isValidAttack(row, col))
      {
        turns++;
        String currShip = board[row][col];
        if(hit(row, col))
        {
          if(isSunk(currShip))
            System.out.println("you sunk my " + currShip + "!");
          else
            System.out.println("hit");
        }
        else
          System.out.println("miss");
      }
    }
    if (!guess.equals("end"))
      System.out.println("Congradulations! It took you " + turns + " turns.");
  }


}
