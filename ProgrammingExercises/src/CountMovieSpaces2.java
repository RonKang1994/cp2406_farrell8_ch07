import java.util.Scanner;

public class CountMovieSpaces2
{
    public static void main(String[] args)
    {
        int count = 0;
        Scanner input = new Scanner(System.in);

        String movie_quote = "Captain Jack Sparrow!";
        System.out.print("Input a Quote: ");
        movie_quote = input.nextLine();
        System.out.println("Movie Quote: " + movie_quote);
        for( int i=0; i<movie_quote.length(); i++ ) {
            if(movie_quote.charAt(i) == ' ' ) {
                count++;
            }
        }
        System.out.println("Number of spaces in it is: " + count);
    }
}
