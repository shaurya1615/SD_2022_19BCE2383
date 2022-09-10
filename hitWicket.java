import java.util.*;
class hitWicket{
	static int playerCountA = 5;
	static int playerCountB = 5;
	static String[][] chessBoard = new String[5][5];
	static Scanner sc = new Scanner(System.in);

	public static void moveLeft(String move){
		System.out.println("Moved Left");
		playerCountB--;
		playerCountA--;
		displayGrid();
	}
	public static void playerMove(){
		String move = sc.nextLine();
		// if(move.length() != 4){
		// 	System.out.println("Please enter a valid move");
		// 	playerMove();
		// }
		char c = move.charAt(1);
		String s = String.valueOf(c);
		int num = Integer.parseInt(s);
		char action = move.charAt(3);
		
		if(move.charAt(0) == 'P' && num>0 && num<6){
			switch(action){
				case 'L':
					moveLeft(move);
					break;
			// 	case 'R':
			// 		moverRight(chessBoard);
			// 		break;
			// 	case 'F':
			// 		moverFront(chessBoard);
			// 		break;
			// 	case 'B':
			// 		moverBack(chessBoard);
			// 		break;
				default:
					System.out.println("Please enter a valid move");
					playerMove();
			}
		}
		else{
			System.out.println("Please enter a valid character");
			playerMove();
		}
	}

	public static void displayGrid(){
		System.out.println("--------------------Current Grid------------------------------");
		for(int i=0; i<5; i++){
			for(int j=0; j<5; j++){
				System.out.print(chessBoard[i][j]+" ");
			}
			System.out.println();
		}
	}


	public static void main(String args[]){
		// Scanner sc = new Scanner(System.in);
		// String[][] chessBoard = new String[5][5];
		for(int i=0; i<5; i++){
			for(int j=0; j<5; j++){
				chessBoard[i][j] = "-";
			}
		}
		// System.out.println("--------------------Player1 enter your squad------------------------------");
		// for(int i=0; i<5; i++){
		// 	String pawn = sc.nextLine();
		// 	chessBoard[4][i] = pawn;
			
		// }
		// displayGrid();
		// System.out.println("--------------------Player2 enter your squad------------------------------");
		// for(int i=0; i<5; i++){
		// 	String pawn = sc.nextLine();
		// 	chessBoard[0][i] = pawn;	
		// }
		// displayGrid();
		while(playerCountA != 0 || playerCountB != 0){
			System.out.println("--------------------Player A's Move------------------------------");
			playerMove();


			System.out.println("--------------------Player B's Move------------------------------");
			playerMove();
		}
	}
	
}