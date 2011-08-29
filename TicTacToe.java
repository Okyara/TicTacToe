public class TicTacToe 
{
	public static void main(String[]args) 
	{
		String[] str_0 = {"OXO",
                                  "OXX",
                                  "XOX"};
                
		System.out.println("The result of the game is: " +whoWon(str_0));
	}//main

	public TicTacToe(){}
	
	public static String whoWon(String[] board)
	{
	  for(int i = 0; i < board.length; i++)
	  {
		if(board[i].charAt(0) == board[i].charAt(1) && board[i].charAt(0)==board[i].charAt(2) 
			&&  board[i].charAt(0) != '-' | board[i].charAt(1) != '-' | board[i].charAt(2) != '-')
			{
				return Character.toString(board[i].charAt(0));
			}
	  }//for
		
	  for(int i = 0; i < board.length; i++)
	  {
		if(board[0].charAt(i) == board[1].charAt(i) && board[0].charAt(i)==board[2].charAt(i)
		   &&  board[0].charAt(i) != '-' | board[1].charAt(i) != '-' | board[2].charAt(i) != '-')
		{
				return Character.toString(board[i].charAt(0));
		}
	  }//for
		
      if(board[0].charAt(2) == board[1].charAt(1) && board[1].charAt(1) == board[2].charAt(0)
		 &&  board[0].charAt(2) != '-' | board[1].charAt(1) != '-' | board[2].charAt(0) != '-')
	  {
				return Character.toString(board[0].charAt(2));
	  }//if
			
	  if(board[0].charAt(0) == board[1].charAt(1) && board[1].charAt(1) == board[2].charAt(2)
		 &&  board[0].charAt(0) != '-' | board[1].charAt(1) != '-' | board[2].charAt(2) != '-')
	  {
				return Character.toString(board[0].charAt(0));
	  }//if
			
	  for(int i = 0; i < board.length; i++)
	  {
		for(int j = 0; j < board.length ; j++)
		{
		  if(board[i].charAt(j) == '-')
		   {
			  return "NOT OVER";
		   }
		   else if(board[i].charAt(j) == 'X' | board[i].charAt(j) == 'O')
		   {	
			  continue;
		   }
			
		}//for
	  }//for
			
	  return "TIE";

	}
}
