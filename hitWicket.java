import java.util.*;
class hitWicket{
	static String[][] chessBoard = new String[5][5];
	static int countA = 5;
	static int countB = 5;
	static Scanner sc = new Scanner(System.in);
	// MOVE LEFT
	public static void moveFront(String move, char player){
		String chara = move.substring(0,2);
		chara = player+"-"+chara;
		int row = 0;
		int col = 0;
		boolean found = false;
		for(int i=0; i<5; i++){
			for(int j=0; j<5; j++){
				if(chessBoard[i][j].equals(chara)){
					row = i;
					col = j;
					found = true;
				}
			}
		}
		if(!found){
			System.out.println("Character Doesn't Exist!!");
			playerMove(player);
		}
		if(player == 'A'){
			
			if((row-1)<0){
				System.out.println("You can not move here");
				playerMove(player);
			}
			String next = chessBoard[row-1][col];
			if(chessBoard[row-1][col] == "-"){
				chessBoard[row-1][col] = chara;
				chessBoard[row][col] = "-";
			}
			else if(next.charAt(0) == 'B'){
				chessBoard[row][col] = "-";
				countB--;
			}
			else{
				System.out.println("You can not move here");
				playerMove(player);
			}
		}
		else{
			
			if((row+1)>4){
				System.out.println("You can not move here");
				playerMove(player);
			}
			String next = chessBoard[row+1][col];
			if(chessBoard[row+1][col] == "-"){
				chessBoard[row+1][col] = chara;
				chessBoard[row][col] = "-";
			}
			else if(next.charAt(0) == 'A'){
				chessBoard[row][col] = "-";
				countA--;
			}
			else{
				System.out.println("You can not move here");
				playerMove(player);
			}
		}
		
		displayGrid();
	}

	// MOVE RIGHT
	public static void moveRight(String move, char player){
		String chara = move.substring(0,2);
		chara = player+"-"+chara;
		int row = 0;
		int col = 0;
		boolean found = false;
		for(int i=0; i<5; i++){
			for(int j=0; j<5; j++){
				if(chessBoard[i][j].equals(chara)){
					row = i;
					col = j;
					found = true;
				}
			}
		}
		if(!found){
			System.out.println("Character Doesn't Exist!!");
			playerMove(player);
		}
		if(player == 'A'){
			
			if((col+1)>4){
				System.out.println("You can not move here");
				playerMove(player);
			}
			String next = chessBoard[row][col+1];
			if(chessBoard[row][col+1] == "-"){
				chessBoard[row][col+1] = chara;
				chessBoard[row][col] = "-";
			}
			else if(next.charAt(0) == 'B'){
				chessBoard[row][col] = "-";
				countB--;
			}
			else{
				System.out.println("You can not move here");
				playerMove(player);
			}
		}
		else{
			
			if((col-1)<0){
				System.out.println("You can not move here");
				playerMove(player);
			}
			String next = chessBoard[row][col-1];
			if(chessBoard[row][col-1] == "-"){
				chessBoard[row][col-1] = chara;
				chessBoard[row][col] = "-";
			}
			else if(next.charAt(0) == 'A'){
				chessBoard[row][col] = "-";
				countA--;
			}
			else{
				System.out.println("You can not move here");
				playerMove(player);
			}
		}
		
		displayGrid();
	}

	// MOVE FORWARD
	public static void moveLeft(String move, char player){
		String chara = move.substring(0,2);
		chara = player+"-"+chara;
		int row = 0;
		int col = 0;
		boolean found = false;
		for(int i=0; i<5; i++){
			for(int j=0; j<5; j++){
				if(chessBoard[i][j].equals(chara)){
					row = i;
					col = j;
					found = true;
				}
			}
		}
		if(!found){
			System.out.println("Character Doesn't Exist!!");
			playerMove(player);
		}
		if(player == 'B'){
			if((col+1)>4){
				System.out.println("You can not move here");
				playerMove(player);
			}
			String next = chessBoard[row][col+1];
			if(chessBoard[row][col+1] == "-"){
				chessBoard[row][col+1] = chara;
				chessBoard[row][col] = "-";
			}
			else if(next.charAt(0) == 'B'){
				chessBoard[row][col] = "-";
				countA--;
			}
			else{
				System.out.println("You can not move here");
				playerMove(player);
			}
		}
		else{
			if((col-1)<0){
				System.out.println("You can not move here");
				playerMove(player);
			}
			String next = chessBoard[row][col-1];
			if(chessBoard[row][col-1] == "-"){
				chessBoard[row][col-1] = chara;
				chessBoard[row][col] = "-";
			}
			else if(next.charAt(0) == 'A'){
				chessBoard[row][col] = "-";
				countB--;
			}
			else{
				System.out.println("You can not move here");
				playerMove(player);
			}
		}
		
		displayGrid();
	}

	// MOVE BACK
	public static void moveBack(String move, char player){
		String chara = move.substring(0,2);
		chara = player+"-"+chara;
		int row = 0;
		int col = 0;
		boolean found = false;
		for(int i=0; i<5; i++){
			for(int j=0; j<5; j++){
				if(chessBoard[i][j].equals(chara)){
					row = i;
					col = j;
					found = true;
				}
			}
		}
		if(!found){
			System.out.println("Character Doesn't Exist!!");
			playerMove(player);
		}
		if(player == 'B'){
			
			if((row-1)<0){
				System.out.println("You can not move here");
				playerMove(player);
			}
			String next = chessBoard[row-1][col];
			if(chessBoard[row-1][col] == "-"){
				chessBoard[row-1][col] = chara;
				chessBoard[row][col] = "-";
			}
			else if(next.charAt(0) == 'A'){
				chessBoard[row][col] = "-";
				countA--;
			}
			else{
				System.out.println("You can not move here");
				playerMove(player);
			}
		}
		else{
			
			if((row+1)>4){
				System.out.println("You can not move here");
				playerMove(player);
			}
			String next = chessBoard[row+1][col];
			if(chessBoard[row+1][col] == "-"){
				chessBoard[row+1][col] = chara;
				chessBoard[row][col] = "-";
			}
			else if(next.charAt(0) == 'B'){
				chessBoard[row][col] = "-";
				countB--;
			}
			else{
				System.out.println("You can not move here");
				playerMove(player);
			}
		}
		
		displayGrid();
	}

	//VALIDATE PLAYER MOVE 
	public static void playerMove(char player){
		String move = sc.nextLine();
		char c = move.charAt(1);
		String s = String.valueOf(c);
		int num = Integer.parseInt(s);
		char action = move.charAt(3);
		
		if(move.charAt(0) == 'P' && num>0 && num<6){
			switch(action){
				case 'L':
					moveLeft(move, player);
					break;
				case 'R':
					moveRight(move, player);
					break;
				case 'F':
					moveFront(move, player);
					break;
				case 'B':
					moveBack(move, player);
					break;
				default:
					System.out.println("Please enter a valid move");
					playerMove(player);
			}
		}
		else{
			System.out.println("Please enter a valid character");
			playerMove(player);
		}
	}

	// DISPLAY THE GRID
	public static void displayGrid(){
		System.out.println("--------------------Current Grid------------------------------");
		for(int i=0; i<5; i++){
			for(int j=0; j<5; j++){
				System.out.print(chessBoard[i][j]+"                   ");
			}
			System.out.println();
		}
	}

	// Validate Characters
	public static boolean validate(String pawn, char player){
		char c = pawn.charAt(3);
		String s = String.valueOf(c);
		int num = Integer.parseInt(s);
		if(pawn.charAt(0) == player && num>0 && num<6 && pawn.charAt(2) == 'P')
			return true;
		else
			return false;
	}

	//Input Squad
	public static void addSquad(char player){
		for(int i=0; i<5; i++){
			String pawn = sc.nextLine();
			if(validate(pawn, player)){
				if(player == 'A')
					chessBoard[4][i] = pawn;
				else
					chessBoard[0][i] = pawn;
			}
			else{
				System.out.println("Enter a valid character");
				addSquad(player);
			}	
		}
		displayGrid();
	}


	// DRIVER CODE
	public static void main(String args[]){
		// Scanner sc = new Scanner(System.in);
		// String[][] chessBoard = new String[5][5];
		for(int i=0; i<5; i++){
			for(int j=0; j<5; j++){
				chessBoard[i][j] = "-";
			}
		}


		System.out.println("--------------------Player1 enter your squad------------------------------");
		addSquad('A');
		System.out.println("--------------------Player2 enter your squad------------------------------");
		addSquad('B');
		char player = 'A';
		while(countB > 0 && countA > 0){
			if(player == 'A'){
				System.out.println("--------------------Player A's Move------------------------------");
				playerMove(player);
				player = 'B';
			}
			else{
				System.out.println("--------------------Player B's Move------------------------------");
				playerMove(player);
				player = 'A';
			}
		}
		if(countB==0){
			System.out.println("Congratulations Player A you won");
		}
		if(countA==0){
			System.out.println("Congratulations Player B you won");
		}
	}
	
}