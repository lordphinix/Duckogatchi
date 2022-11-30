import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;


//Copyright Thomas Bird 2022


public class Duck {

	public static void main(String[] args) {
		String name = "NullDuck";
		int stomach =-1;
		int age = -1;
		int fun = -1;

		boolean dead = false;

		Scanner pager = new Scanner(System.in);
		
		File theDuck = new File("duck.txt");
		if (!theDuck.isFile()){
			System.out.println("What will you name your duck");
			name = pager.nextLine();
			stomach = 52;
			age = 0;
			fun = 50;
		} else {
			try {
				Scanner scantron = new Scanner(theDuck);
				name = scantron.nextLine();
				stomach = scantron.nextInt();
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
			gameTools.defaultDuck();
			gameTools.display();
			System.out.println("Stomach: "+stomach+"               "+"Fun: "+fun);
			gameTools.space();
			System.out.println("[F]eed                [E]xercise");
			System.out.println("[G]ames                [S]tudy]");
			System.out.println("           [Q]uit              ");
			gameTools.space();
			if (stomach <= 0){
				gameTools.starve();
				System.out.println(name+" has starved to death");
				theDuck.delete();
				input = "quit";
				dead = true;
			}
			if (stomach >= 100){
				gameTools.heart();
				System.out.println(name+" has had a heart attack");
				theDuck.delete();
				input = "quit";
				dead = true;
			}
			if (fun <= 0){
				gameTools.ownFun();
				System.out.println(name+" has thrown their head out of boredom");
				theDuck.delete();
				input = "quit";
				dead = true;
			}
			if (fun >= 100){
				gameTools.funOverload();
				System.out.println(name+" has exploded with joy");
				theDuck.delete();
				input = "quit";
				dead = true;
			} 
			if (dead==false){
				input = pager.nextLine();
			}

			if (input.equals("Feed")|| input.equals("feed")||input.equals("F")||input.equals("f")){
				gameTools.feed();
				stomach += 8;

			} else if (input.equals("Games")|| input.equals("games")||input.equals("G")||input.equals("g")){
				gameTools.gamer(pager);
				fun+=5;

			} else if (input.equals("Exercise")|| input.equals("exercise")||input.equals("E")||input.equals("e")){
				gameTools.run();
				stomach -= 8;

			} else if (input.equals("Study")|| input.equals("study")||input.equals("S")||input.equals("s")){
				gameTools.trivia(pager);
				fun-=5;
			}

		}
		pager.close();
		age++;
		if (dead == false){
			try {
				PrintWriter saver = new PrintWriter(theDuck);
				saver.println(name);
				saver.println(stomach);
				saver.println(age);
				saver.println(fun);
				saver.close();
			} catch (Exception e) {
				// ERRORCODE 0002 - Save Failure
			}
		}	
	}

}