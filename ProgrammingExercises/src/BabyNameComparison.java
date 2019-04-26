import java.util.Scanner;

public class BabyNameComparison
{
    public static void main(String[] args)
    {
        String name1;
        String name2;
        String name3;
        String combo_name = "";

        Scanner input = new Scanner(System.in);
        System.out.print("Input a Name 1: ");
        name1 = input.nextLine();
        System.out.print("Input a Name 2: ");
        name2 = input.nextLine();
        System.out.print("Input a Name 3: ");
        name3 = input.nextLine();

        for(int i = 0; i < 6; i++)
        {
            if (i == 0)
            {
                combo_name = name1 + " " + name2;
            }
            else if (i == 1)
            {
                combo_name = name1 + " " + name3;
            }
            else if (i == 2)
            {
                combo_name = name2 + " " + name1;
            }
            else if (i == 3)
            {
                combo_name = name2 + " " + name3;
            }
            else if (i == 4)
            {
                combo_name = name3 + " " + name1;
            }
            else if (i == 5)
            {
                combo_name = name3 + " " + name2;
            }
            System.out.println(combo_name);
        }
    }
}
