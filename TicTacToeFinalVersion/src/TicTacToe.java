import java.util.Arrays;
import java.util.Scanner;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;

public class TicTacToe extends Application 
{
	  @Override // Override the start method in the Application class
	  public void start(Stage primaryStage) 
	  { 
		  
		  Scanner input = new Scanner(System.in);
		  
		  // Create two new images to hold the X and the O
		  Image image1 = new Image("file:o.gif");
		  Image image2 = new Image("file:x.gif");
		    
		  // Create the new gridpane, set alignment and gaps
		  GridPane gpane = new GridPane();
		  	gpane.setPrefSize(150,150);
		    gpane.setAlignment(Pos.CENTER);
		    gpane.setHgap(5);
		    gpane.setVgap(5);
		    
		    Scene scene = new Scene(gpane, 500, 500);
			primaryStage.setTitle("Tic Tac Toe");
			primaryStage.setScene(scene);
			primaryStage.show();	
			
			//variables used in game play
			int row, col;
			boolean[][] tttBoard = new boolean[3][3];
			//tttboard is array of true/false to check if x or o are already placed in space on grid
			String[][] scoreBoard = new String[][]{{" "," "," "},{" "," "," "},{" "," "," "}};
			// scoreBOard used to keep track of score as well as place game board in console after each turn		
			
			for(int count = 1; count < 5; count++)
			{
				System.out.println("Pass number " + count);
				
				//Player O takes turn
				System.out.println("Player 'O', enter your row(1-3) and col (1-3): ");
				row = input.nextInt();
				col = input.nextInt();
				if(tttBoard[row - 1][col - 1])
					System.out.println("Space already taken, lose your turn.");
				else
				{
				gpane.add(new ImageView(image1), col - 1, row - 1);
				tttBoard[row - 1][col - 1] = true;
				scoreBoard[row - 1][col - 1] = "O";
				}
				System.out.println("[" + scoreBoard[0][0] + "]" + "[" + scoreBoard[0][1] + "]" + "[" + scoreBoard[0][2] + "]" );
				System.out.println("[" + scoreBoard[1][0] + "]" + "[" + scoreBoard[1][1] + "]" + "[" + scoreBoard[1][2] + "]" );
				System.out.println("[" + scoreBoard[2][0] + "]" + "[" + scoreBoard[2][1] + "]" + "[" + scoreBoard[2][2] + "]" );

				
				//Player X takes turn
					System.out.println("Player 'X', enter your row(1-3) and col(1-3): ");
					row = input.nextInt();
					col = input.nextInt();
					if(tttBoard[row - 1][col - 1])
						System.out.println("Space already taken, lose your turn.");
					else
					{
						gpane.add(new ImageView(image2), col - 1, row - 1);
						tttBoard[row - 1][col - 1] = true;
						scoreBoard[row - 1][col - 1] = "X";
					}
					System.out.println("[" + scoreBoard[0][0] + "]" + "[" + scoreBoard[0][1] + "]" + "[" + scoreBoard[0][2] + "]" );
					System.out.println("[" + scoreBoard[1][0] + "]" + "[" + scoreBoard[1][1] + "]" + "[" + scoreBoard[1][2] + "]" );
					System.out.println("[" + scoreBoard[2][0] + "]" + "[" + scoreBoard[2][1] + "]" + "[" + scoreBoard[2][2] + "]" );
			  }
			
			//variables to keep track of score
			String rowOne = scoreBoard[0][0] + scoreBoard[0][1] + scoreBoard[0][2] ;
			String rowTwo = scoreBoard[1][0] + scoreBoard[1][1] + scoreBoard[1][2] ;
			String rowThree =scoreBoard[2][0] + scoreBoard[2][1] + scoreBoard[2][2] ;
			String colOne =scoreBoard[0][0] + scoreBoard[1][0] + scoreBoard[2][0] ;
			String colTwo =scoreBoard[0][1] + scoreBoard[1][1] + scoreBoard[2][1] ;
			String colThree =scoreBoard[0][2] + scoreBoard[1][2] + scoreBoard[2][2] ;

			if( rowOne.equals("OOO") || rowTwo.equals("OOO") || rowThree.equals("OOO") || colOne.equals("OOO") || colTwo.equals("OOO") || colThree.equals("OOO"))
				{
					System.out.println("O Wins!");
				}
			
			if(rowOne.equals("XXX") || rowTwo.equals("XXX") || rowThree.equals("XXX") || colOne.equals("XXX") || colTwo.equals("XXX") || colThree.equals("XXX"))
				{
					System.out.println("X Wins!");
				}
	  }  
	  
	  public static void main(String[] args) 
	  {
	    launch(args);
	  }

		  
		  
	  
}
