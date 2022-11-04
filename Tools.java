
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

        screen[screen.length-1][14] = "^";
        screen[screen.length-1][16] = "^";
        screen[screen.length-2][14] = "(";
        screen[screen.length-2][16] = ")";
        screen[screen.length-2][13] = "/";
        screen[screen.length-2][17] = "\\";
        screen[screen.length-3][15] = "O";
        screen[screen.length-3][16] = "-";

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
    
}
