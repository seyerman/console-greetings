package model;

public class Greeting{
    public String name;
    public String lastname;

    public Greeting(String na, String ln){
        name = na;
        lastname = ln;
    }

    public String sayHi(){
        return "Hello "+name;
    }

    public String sayGoodMorning(){
        return "Good Morning "+name+" "+lastname+"!";
    }

    public String sayBye(){
        return "Good Bye "+lastname;
    }
}