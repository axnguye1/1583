import java.util.Scanner;
public class ZombieApocalypse
{
		public static void main( String[] args )
		{
			//Setup Game Data
			Scanner input = new Scanner(System.in);
			boolean gameOver = false;
			int colSize = 10;
			int rowSize = 10;
			String floorTile = "🟩 ";
			int playerX = 0;
			int playerY = 0;
			String playerTile = "🏃🏻 ";
			int exitX = colSize - 1;
			int exitY = rowSize - 1;
			String exitTile = "🚔 ";
			int zombieX = 5;
			int zombieY = 5;
			String zombieTile = "🧟 ";
			int monsterX = 7;
			int monsterY = 7;
			String monsterTile = "🧟 ";
			int monstersX = 4;
			int monstersY = 7;
			String monstersTile = "🧟 ";


			//Game Loop
			while (gameOver == false) {				//start game loop
				//Draw Game Scene
			for(int y=0; y <rowSize; y++){
					for(int x=0; x <colSize; x++){
						if ( x == playerX && y == playerY){
							System.out.print(playerTile);
						}
						else if ( x == exitX && y == exitY){
								System.out.print(exitTile);
						}
						else if ( x == zombieX && y ==zombieY){
							System.out.print(zombieTile);
						}
						else if ( x == monsterX && y ==monsterY){
							System.out.print(monsterTile);
						}
						else if (x ==monstersX && y ==monstersY){
							System.out.print(monstersTile);
						}
						else{
						System.out.print (floorTile);
						}
					}
					System.out.print("\n");
			}
				//Get Player Input
			String choice = input.nextLine();
				//Execute Player Action
			if (choice.equals("w")){
				if(playerY > 0){
					playerY--;
				}
			}
			else if (choice.equals("s")){
				if(playerY < 9){
					playerY++;
				}	
			}
			else if (choice.equals("d")){
				if(playerX < 9){
				playerX++;
				}
			}
			else if (choice.equals("a")){
				if(playerX > 0){
				playerX--;
				}
			}
			//trying to constrain player 

				//Check Win Condition
			if (playerX == exitX && playerY == exitY){
				gameOver = true;
				System.out.println("You survived and made it to the exit!");
			}
				//Execute Monster Action
			int zombieChoice = (int) (Math.random()*4 );
			if (zombieChoice == 0) {
				zombieX = (zombieX + 1) % colSize;
			}
			else if (zombieChoice == 1) {
				zombieX = - -zombieX >= 0 ? zombieX : (colSize - 1);
			}
			else if (zombieChoice == 1) {
				zombieY = - -zombieY >= 0 ? zombieY : (rowSize - 1);
			}
			else if (zombieChoice == 3){
				zombieY= (zombieY + 1) %rowSize;
			}
			int monsterChoice = (int) (Math.random()*4 );
			if(monsterChoice == 0) {
				monsterX = (monsterX + 1) % colSize;
			}
			else if (monsterChoice == 1) {
				monsterX = - -monsterX >= 0 ? monsterX : (colSize - 1);
			}
			else if (monsterChoice == 1) {
				monsterY = - -monsterY >= 0 ? monsterY : (rowSize - 1);
			}
			else if (monsterChoice == 3){
				monsterY= (monsterY + 1) %rowSize;
			}
			int monstersChoice = (int) (Math.random()*4 );
			if(monstersChoice == 0) {
				monstersX = (monstersX + 1) % colSize;
			}
			else if (monstersChoice == 1) {
				monsterX = - -monstersX >= 0 ? monstersX : (colSize - 1);
			}
			else if (monstersChoice == 1) {
				monstersY = - -monstersY >= 0 ? monstersY : (rowSize - 1);
			}
			else if (monstersChoice == 3){
				monstersY= (monstersY + 1) %rowSize;
			}
				//Check Lose Condition
			
			if (zombieX == playerX && zombieY == playerY){
				gameOver = true;
}
			if (monsterX == playerX && monsterY == playerY){
				gameOver = true;
			}
			if (monstersX == playerX && monstersY == playerY){
				gameOver = true;
			}
				System.out.println("your brains were eaten by the zombie");
				} 		//end game loop
			}
		}
