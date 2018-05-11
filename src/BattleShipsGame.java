import java.util.Scanner;

public class BattleShipsGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] map = new int[10][10];
		oceanMap(map);
		Scanner sc = new Scanner(System.in);
		System.out.println("Deploy your ships:");
		//System.out.println("");
		//System.out.println("Enter");

	}
	
	static void oceanMap(int[][] map){
		System.out.println("**** Welcome to Battle Ships game ****");
		System.out.println();
		System.out.println("Right now, the sea is empty.");
		System.out.println();
		System.out.println("   0123456789   ");
		for(int i=0;i<map.length;i++)
		{
			System.out.print(i+" |");
			for(int j=0;j<map[i].length;j++)
			{
				System.out.print(" ");
			}
			System.out.print("| "+i);
			System.out.println();
		}
		System.out.println("   0123456789   ");
	}

}
