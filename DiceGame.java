import java.util.Random;
import java.util.Scanner;

public class DiceGame{
DiceGame(){
}

public static void main(String[] args){
    int sum=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("What is your name?");
    System.out.print("> ");
String name = sc.next();
System.out.println("Hello, "+name+"!");
     System.out.println("Rolling dice...");
     Random r = new Random();
     int i=1;
     while( i<3){
     int n = r.nextInt(5);
     n = n+1;
     System.out.println("Die "+i+": "+n);
     i++;
     sum+=n;
}
System.out.println("Total value: "+sum);
}
}
