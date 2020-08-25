import java.util.Scanner;           //Assignment notice: The pseudocode requested for part 1 of the assignment
                                    //can be found next to this file in pseudocode.txt
                                    //(Hurricane > src > pseudocode.txt)
public class Hurricane {
    public static void main(String[] args) {

        Scanner keybd = new Scanner(System.in);

        //     Category 1       74 - 95 mph
        //
        //     Category 2       96 - 110 mph
        //
        //     Category 3       111 - 129 mph
        //
        //     Category 4       130 - 156 mph
        //
        //     Category 5       157 or higher

        //      Before starting to code, think about your logic in pseudocode and/or
        //  flowchart first.  Test out your logic with a sample set.  When you are
        //  satisfied with your pseudocode/flowchart, submit your work.  Using your
        //  pseudocode/flowchart, write a program.  Don't forget to create a new project
        //  in IntilliJ and a new repository in Github.


        int wind;


        System.out.println("Please enter the storm windspeed: ");
        wind = keybd.nextInt();

        if (wind < 74) {
            System.out.println("Storm is not a hurricane.");
        } else if (wind >= 74 && wind < 95) {
            System.out.println("Storm is a category 1 hurricane.");
        } else if (wind >= 95 && wind < 110) {
            System.out.println("Storm is a category 2 hurricane.");
        } else if (wind >= 110 && wind < 129) {
            System.out.println("Storm is a category 3 hurricane.");
        } else if (wind >= 129 && wind < 156) {
            System.out.println("Storm is a category 4 hurricane.");
        }else {
            System.out.println("Storm is a category 5 hurricane.");
        }

    }
}
