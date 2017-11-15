//1.4.10
import java.util.Scanner;

class ShuffledDeck {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("In: ");

        int n = reader.nextInt();

        String [] Suits = { "Clubs", "Diamonds","Hearts","Spades"};

        String[] Ranks =
                {
                        "2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"
                };




            do {
                int i = (int) (Math.random()*Ranks.length);
                int j = (int) (Math.random()*Suits.length);
                System.out.println(Ranks[i] + " of " + Suits[j] + "\n");
              n=n-1;
            } while (n>0);
        }



    }
