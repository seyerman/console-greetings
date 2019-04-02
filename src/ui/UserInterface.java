package ui;
import model.Greeting;
import java.util.Scanner;

public class UserInterface{
    public static void main(String[] args){
        //printArgs(args);
        //greetingToJuan();
        Scanner reader = new Scanner(System.in);
        int option;
        Greeting g = null;

        do{
            System.out.println("====================");
            System.out.println("   OPTIONS MENU");
            System.out.println("====================");
            System.out.println("1. Enter the name and lastname to greeting");
            System.out.println("2. Say Hi");
            System.out.println("3. Say Good Morning");
            System.out.println("4. Say Bye");
            System.out.println("5. Exit");
            System.out.print("Enter the option number you want: ");

            option = Integer.parseInt(reader.nextLine());

            if(option<1 || option>5){
                System.out.println("The options are out of range!\nPlease enter the option again.");
            }

            switch(option){
                case 1:
                    System.out.print("Please enter your name: ");
                    String name = reader.nextLine();
                    System.out.print("Please enter your lastname: ");
                    String lastname = reader.nextLine();
                    g = new Greeting(name, lastname);
                break;
                case 2:
                    if(g!=null){
                        System.out.println("\n"+g.sayHi()+"\n");
                    }else{
                        System.out.println("Please enter the option 1 before choose this option");
                    }
                break;
                case 3:
                    System.out.println("\n"+g.sayGoodMorning()+"\n");
                break;
                case 4:
                    System.out.println("\n"+g.sayBye()+"\n");
                break;
                case 5:
                    System.out.println("\nThanks for using this program! Bye bye!!\n");
                break;
            }


        }while(option!=5);

    }

    public static void greetingToJuan(){
        Greeting g = new Greeting("Juan", "Reyes");
        String hi = g.sayHi();
        String gd = g.sayGoodMorning();

        System.out.println(hi);
        System.out.println(gd);
    }

    public static void printArgs(String[] args){
        System.out.println("The args length is "+args.length);
        for (int I = 0; I < args.length; I++) {
            System.out.println("The args["+I+"] = "+args[I]);
        }
    }
}