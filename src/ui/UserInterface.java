package ui;
import model.Greeting;

public class UserInterface{
    public static void main(String[] args){
        printArgs(args);
        greetingToJuan();
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