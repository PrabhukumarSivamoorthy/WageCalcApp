package pvt.prabhu.wagecalcapp;

import java.time.LocalDate;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Prabhu" );
        
        System.out.println("Welcome to Wage Calculator");
        
        System.out.println("Enter your this week salary");
        
        Scanner scan = new Scanner(System.in);
        LocalDate date = LocalDate.now();
        System.out.println(date);
        
        
        
    }
}
