import java.util.Scanner;

public class CountMovieSpaces
{
    public static void main(String[] args)
    {
        int count = 0;
        String movie_quote = "Captain Jack Sparrow!";
        System.out.println("Movie Quote: " + movie_quote);
        for( int i=0; i<movie_quote.length(); i++ ) {
            if(movie_quote.charAt(i) == ' ' ) {
                count++;
            }
        }
        System.out.println("Number of spaces in it is: " + count);
    }
}
