import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;


//Copyright Thomas Bird 2022


public class Duck {

	public static void main(String[] args) {
		String name = "NullDuck";
		int Stomach =-1;
		int age = -1;
		int fun = -1;

		boolean dead = false;

		Scanner pager = new Scanner(System.in);
		
		File theDuck = new File("duck.txt");
		if (!theDuck.isFile()){
			System.out.println("What will you name your duck");
			name = pager.nextLine();
			Stomach = 52;
			age = 0;
			fun = 50;
		} else {
			try {
				Scanner scantron = new Scanner(theDuck);
				name = scantron.nextLine();
				Stomach = scantron.nextInt();
				age = scantron.nextInt();
				fun = scantron.nextInt();
				scantron.close();
			} catch (Exception e) {
				// ERRORCODE 0001 - Intialization Failure
			}
		}
		String input = "";
		Tools gameTools = new Tools();

		if (age >=15){
			System.out.println(name+" has died of old age");
			theDuck.delete();
			input = "quit";
			dead = true;
		}

		while (!input.equals("Quit")&& !input.equals("quit")&&!input.equals("Q")&&!input.equals("q")){
			gameTools.clear();
			System.out.println(name+" - "+age);
			gameTools.display();
			System.out.println("Stomach: "+Stomach+"               "+"Fun: "+fun);
			gameTools.space();
			System.out.println("[F]eed                [E]xercise");
			System.out.println("[G]ames                [S]tudy]");
			gameTools.space();
			input = pager.nextLine();
			if (Stomach <= 0){
				//Starve stub
			}
			if (Stomach >= 100){
				//Heart stub
			}
			if (fun <= 0){
				//Bored stub
			}
			if (fun >= 100){
				//Explosive stub
			} 



		}
		pager.close();
		age++;
		if (dead == false){
			try {
				PrintWriter saver = new PrintWriter(theDuck);
				saver.println(name);
				saver.println(Stomach);
				saver.println(age);
				saver.println(fun);
				saver.close();
			} catch (Exception e) {
				// ERRORCODE 0002 - Save Failure
			}
		}	
	}

}