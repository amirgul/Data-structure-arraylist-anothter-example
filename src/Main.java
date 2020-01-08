import java.util.ArrayList;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {

        ArrayList<String> toDoList = new ArrayList<String>();
        System.out.println("Enter items you wish to buy");
        boolean isTrue = false;
        Scanner keyboard = new Scanner(System.in);
        while (!isTrue)
        {
            System.out.println("Enter an item");
            String anEntry = keyboard.nextLine();
            toDoList.add(anEntry);
            System.out.println("More items want to add");
            String ans = keyboard.nextLine();
            if(!ans.equalsIgnoreCase("yes"))
                isTrue = true;
        }
        System.out.println("List contains");
        toDoList.trimToSize();
        int size = toDoList.size();
        for(String element : toDoList)
            System.out.println(element);

        ArrayList<String> dublicate = toDoList;
        System.out.println(dublicate.get(2));
    }
}
