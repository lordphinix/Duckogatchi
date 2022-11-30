import java.util.Random;
import java.util.Scanner;

// Class containg useful 'helper' methods for use across the whole game. Mostly things that need to be repeatedly printed.
public class Tools {

    String[][] screen;

    public Tools(){
        screen = new String[10][33];
        for (int i = 0; i< screen.length;i++){
            for (int j = 0; j< screen[0].length;j++){
                screen[i][j]=" ";
            }
        }
        for (int i = 1; i< screen[0].length-1;i++){
            screen[0][i] = "_";
            screen[screen.length-1][i] = "_";
        }
        for (int i = 1; i< screen.length;i++){
            screen[i][0] = "|";
            screen[i][screen[0].length-1] = "|";
        }

        defaultDuck();

    }

    // prints two lines to simulate a space between two objects
    public void space(){
        System.out.println();
        System.out.println();
    }

    //Prints a number of lines to give the impression that the screen is cleared. Wish I knew how to do an actual clear.
    public void clear(){
        for (int i = 0; i < 30; i++){
            System.out.println();
        }
    }

    public void display(){
        for (int i = 0; i< screen.length;i++){
            for (int j = 0; j< screen[0].length;j++){
                System.out.print(screen[i][j]);
            }
            System.out.println();
        }
    }

    public void defaultDuck(){
        screen[screen.length-1][14] = "^";
        screen[screen.length-1][16] = "^";
        screen[screen.length-2][14] = "(";
        screen[screen.length-2][16] = ")";
        screen[screen.length-2][13] = "/";
        screen[screen.length-2][17] = "\\";
        screen[screen.length-3][15] = "O";
        screen[screen.length-3][16] = "-";
    }

    public void feed(){
        int hor = 16;
        for(int i =1; i<screen.length-3;i++){
            clear();
            screen[i][hor] = "*";
            display();
            screen[i][hor] = " ";
            if (hor == 15){
                hor++;
            } else if (hor == 16){
                hor--;
            }
            try {
                Thread.sleep(500);
            } catch (Exception e) {
				// ERRORCODE 0003 - Time is Meaningless
			}
        }
    }

    public void heart(){
        for (int i =0; i<5;i++){
            clear();
            screen[screen.length-2][13] = "\\";
            screen[screen.length-2][17] = "/";
            display();
            try {
                Thread.sleep(500);
            } catch (Exception e) {
				// ERRORCODE 0003 - Time is Meaningless
			}
            clear();
            screen[screen.length-2][13] = "/";
            screen[screen.length-2][17] = "\\";
            display();
            try {
                Thread.sleep(500);
            } catch (Exception e) {
				// ERRORCODE 0003 - Time is Meaningless
			}
        }
    }

    public void run(){
        screen[screen.length-1][14] = " ";
        screen[screen.length-1][16] = " ";
        screen[screen.length-2][14] = " ";
        screen[screen.length-2][16] = " ";
        screen[screen.length-2][13] = " ";
        screen[screen.length-2][17] = " ";
        screen[screen.length-3][15] = " ";
        screen[screen.length-3][16] = " ";
       for (int i =5;i< (screen[0].length-2);i++){
        clear();
        screen[screen.length-1][i-3] = "^";
        screen[screen.length-1][i-1] = "^";
        screen[screen.length-2][i-3] = "(";
        screen[screen.length-2][i-1] = ")";
        screen[screen.length-2][i-4] = "/";
        screen[screen.length-2][i] = "\\";
        screen[screen.length-3][i-2] = "O";
        screen[screen.length-3][i-1] = "-";
        display();
        screen[screen.length-1][i-3] = "_";
        screen[screen.length-1][i-1] = "_";
        screen[screen.length-2][i-3] = " ";
        screen[screen.length-2][i-1] = " ";
        screen[screen.length-2][i-4] = " ";
        screen[screen.length-2][i] = " ";
        screen[screen.length-3][i-2] = " ";
        screen[screen.length-3][i-1] = " ";
            try {
            Thread.sleep(300);
            } catch (Exception e) {
            // ERRORCODE 0003 - Time is Meaningless
            }
        }
    }

    public void starve(){
        clear();
        screen[screen.length-1][14] = "^";
        screen[screen.length-1][16] = "^";
        screen[screen.length-2][14] = "(";
        screen[screen.length-2][16] = ")";
        screen[screen.length-2][13] = "/";
        screen[screen.length-2][17] = "\\";
        screen[screen.length-3][15] = "O";
        screen[screen.length-3][16] = "-";
        display();
        screen[screen.length-1][14] = " ";
        screen[screen.length-1][16] = " ";
        screen[screen.length-2][14] = " ";
        screen[screen.length-2][16] = " ";
        screen[screen.length-2][13] = " ";
        screen[screen.length-2][17] = " ";
        screen[screen.length-3][15] = " ";
        screen[screen.length-3][16] = " ";
            try {
            Thread.sleep(500);
            } catch (Exception e) {
            // ERRORCODE 0003 - Time is Meaningless
            }
        clear();
        screen[screen.length-1][14] = "(";
        screen[screen.length-1][16] = ")";
        screen[screen.length-1][13] = "/";
        screen[screen.length-1][17] = "\\";
        screen[screen.length-2][15] = "O";
        screen[screen.length-2][16] = "-";
        display();
        screen[screen.length-1][14] = " ";
        screen[screen.length-1][16] = " ";
        screen[screen.length-2][14] = " ";
        screen[screen.length-2][16] = " ";
        screen[screen.length-2][13] = " ";
        screen[screen.length-2][17] = " ";
        screen[screen.length-3][15] = " ";
        screen[screen.length-3][16] = " ";
            try {
            Thread.sleep(500);
            } catch (Exception e) {
            // ERRORCODE 0003 - Time is Meaningless
            }
        clear();
        screen[screen.length-1][15] = "O";
        screen[screen.length-1][16] = "-";
        display();
        screen[screen.length-1][14] = " ";
        screen[screen.length-1][16] = " ";
        screen[screen.length-2][14] = " ";
        screen[screen.length-2][16] = " ";
        screen[screen.length-2][13] = " ";
        screen[screen.length-2][17] = " ";
        screen[screen.length-3][15] = " ";
        screen[screen.length-3][16] = " ";
            try {
            Thread.sleep(500);
            } catch (Exception e) {
            // ERRORCODE 0003 - Time is Meaningless
            }
        clear();
        screen[screen.length-1][14] = " ";
        screen[screen.length-1][16] = " ";
        screen[screen.length-2][14] = " ";
        screen[screen.length-2][16] = " ";
        screen[screen.length-2][13] = " ";
        screen[screen.length-2][17] = " ";
        screen[screen.length-3][15] = " ";
        screen[screen.length-3][16] = " ";
        
        display();
            try {
            Thread.sleep(500);
            } catch (Exception e) {
            // ERRORCODE 0003 - Time is Meaningless
            }
    }
    public void ownFun(){
        clear();
        screen[screen.length-2][17] = "/";
        display();
        try {
            Thread.sleep(500);
            } catch (Exception e) {
            // ERRORCODE 0003 - Time is Meaningless
            }
        clear();
        screen[screen.length-1][17] = "\\";
        display();
        try {
            Thread.sleep(500);
            } catch (Exception e) {
            // ERRORCODE 0003 - Time is Meaningless
            }

        for (int i = 16; i <screen[0].length-1;i++){
            clear();
            screen[screen.length-3][i-1] = "O";
            screen[screen.length-3][i] = "-";
            display();
            screen[screen.length-3][i-1] = " ";
            screen[screen.length-3][i] = " ";
            try {
                Thread.sleep(200);
                } catch (Exception e) {
                // ERRORCODE 0003 - Time is Meaningless
                }
        }
    }

    public void funOverload(){
        for (int i = 0; i<7;i++){
            clear();
            screen[screen.length-1][14-i] = "^";
            screen[screen.length-1][16+i] = "^";
            screen[screen.length-2-i][13-i] = "/";
            screen[screen.length-2-i][17+i] = "\\";
            screen[screen.length-3-i][15] = "O";
            screen[screen.length-3-i][16] = "-";
            display();
            screen[screen.length-1][14-i] = " ";
            screen[screen.length-1][16+i] = " ";
            screen[screen.length-2-i][13-i] = " ";
            screen[screen.length-2-i][17+i] = " ";
            screen[screen.length-3-i][15] = " ";
            screen[screen.length-3-i][16] = " ";
            try {
                Thread.sleep(300);
                } catch (Exception e) {
                // ERRORCODE 0003 - Time is Meaningless
                }
        }
        }

        public void trivia(Scanner player){
            Random rand = new Random();
            int q = rand.nextInt(10);
            String input = "";
            if (q == 0){
                System.out.println("What is 2 + 2?");
                input = player.next();
                if (input.equals("4")){
                    System.out.println("Correct"); 
                } else {
                    System.out.println("Incorrect");
                }

            } else if (q == 1){
                System.out.println("What is the capital of Canada?");
                input = player.next();
                if (input.equals("Ottawa")){
                    System.out.println("Correct"); 
                } else {
                    System.out.println("Incorrect");
                }
            } else if (q == 2){
                System.out.println("How many ways can your duck die?");
                input = player.next();
                if (input.equals("5")){
                    System.out.println("Correct"); 
                } else {
                    System.out.println("Incorrect");
                }
            } else if (q == 3){
                System.out.println("Do Ducks quack?");
                input = player.next();
                if (input.equals("Yes")){
                    System.out.println("Correct"); 
                } else {
                    System.out.println("Incorrect");
                }
                
            } else if (q == 4){
                System.out.println("Is a parrot a duck?");
                input = player.next();
                if (input.equals("No")){
                    System.out.println("Correct"); 
                } else {
                    System.out.println("Incorrect");
                }
                
            } else if (q == 5){
                System.out.println("Is Duckogatchi fun?");
                input = player.next();
                if (input.equals("No")){
                    System.out.println("Correct"); 
                } else {
                    System.out.println("Incorrect");
                }
                
            } else if (q == 6){
                System.out.println("If a tree falls on a duck does it still make a sound?");
                input = player.next();
                if (input.equals("Yes")){
                    System.out.println("Correct"); 
                } else {
                    System.out.println("Incorrect");
                }
                
            } else if (q == 7){
                System.out.println("Feeling quacked yet?");
                input = player.next();
                if (input.equals("Yes")){
                    System.out.println("Correct"); 
                } else {
                    System.out.println("Incorrect");
                }
                
            } else if (q == 8){
                System.out.println("What colour am I thinking of??");
                input = player.next();
                if (input.equals("Red")){
                    System.out.println("Correct"); 
                } else {
                    System.out.println("Incorrect");
                }
                
            } else if (q == 9){
                System.out.println("What have I got in my nasty little pocketsies?");
                input = player.next();
                System.out.println("Incorrect");

                
            }
            try {
                Thread.sleep(1200);
                } catch (Exception e) {
                // ERRORCODE 0003 - Time is Meaningless
                }
        }

        public void gamer(Scanner inScan){
            Random rand = new Random();
            int q = rand.nextInt(4)+1;
            int guess;
            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("");
            System.out.println("I'm thinking of a number between 1 and 4");
            System.out.println(q);
            guess = inScan.nextInt();
            if (q == guess){
                System.out.println("Wow, you guessed it right!");
            } else {
                System.out.println("Aw shucks, that's not right.");
                System.out.println("I was thinking of "+ q);
            }

            try {
                Thread.sleep(1200);
                } catch (Exception e) {
                // ERRORCODE 0003 - Time is Meaningless
                }
        }
        
    }

