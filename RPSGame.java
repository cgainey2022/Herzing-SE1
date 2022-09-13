import java.util.Scanner;
public class RPSGame{

    private static int count1= 0;
    private static int count2 =0;

    private static char player1= 0;
    private static char player2=0; 
    
    private static Scanner player1choice= new Scanner(System.in);
    private static Scanner player2choice= new Scanner(System.in);

    public static void main(String[] args){
        obtainUserInput();
    }

    public static void obtainUserInput() {

        System.out.println("Begin new round of Rock, Ppaper, Scissors!");
        System.out.print("Player 1: choose either r, p, or s");
        player1= player1choice.next().charAt(0);
        System.out.println("");

        System.out.print("Player 2: choose either r, p, s");
        player2= player2choice.next().charAt(0);

        decision();

    }
    public static void decision() {
        if (player1 =='r' && player2 =='s'){
            System.out.println("Player 1 gets a point");
            count1++;
            loop();
        }

        else if(player2 == 'r' && player1 == 's'){
        System.out.println("Player 2 gets a point");
        count2++;
        loop();
        }

        else if(player1 == 'p' && player2 == 's'){
            System.out.println("User 2 gets a point");
            count2++;
            loop();
        }

        else if(player2 == 'p' && player1 == 's'){
        System.out.println("User 1 gets a point");
        count1++;
        loop();
        
    }
    else if(player1 == 'r' && player2 == 'p'){
        System.out.println("User 2 gets a point");
        count2++;
        loop();
    }

    else if(player2 == 'r' && player1 == 'p'){
    System.out.println("User 1 gets a point");
    count1++;
    loop();
}
    else if(player1 == 'r' && player2 == 'r'){
    System.out.println("Draw");
    loop();
}
    else if(player1 == 'p' && player2 == 'p'){
    System.out.println("Draw");
    loop();
}
else if(player1 == 's' && player2 == 's'){
    System.out.println("Draw");
    loop();
}

    }


    public static void loop() {
        System.out.println("");
        if (count1 == 2){
            System.out.println("Game over Player 1 wins.");
        }
        else if(count2 == 2){
            System.out.println("Game over Player 2 wins.");
        }
        else{
            obtainUserInput();
        }
    }
}



      
