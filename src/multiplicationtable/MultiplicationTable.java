package multiplicationtable;
import java.util.Random;
import java.util.Scanner;

public class MultiplicationTable {
    
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String BLACK = "\033[0m";
    
    public static void main(String[] args) {
        int correct_answers = 0;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int tries = 0;
        
        while(tries != 5) {
            a = random.nextInt(9)+1;
            b = random.nextInt(9)+1;
            System.out.print(a + "*" + b + "=");
            int UserInput = scanner.nextInt();
            tries = tries + 1;
            if(UserInput == a * b) {
                System.out.println(ANSI_GREEN + "Ваш ответ верен!" + BLACK);
                correct_answers = correct_answers + 1;
                
            }
            if(UserInput != a * b) {
                System.out.println(ANSI_RED + "Ваш ответ неверен!" + BLACK);           
                
            }
            
        }
        
        if(correct_answers == 5) {
            System.out.println("Молодец! Ты отлично знаешь таблицу умножения!");
            System.exit(0);
        }
        
        if(correct_answers < 5 && correct_answers >= 3) {
            System.out.println("Неплохо, но надо бы поучить еще.");
            System.exit(0);
        }
        
        if(correct_answers <= 2) {
            System.out.println("Срочно нужно учить таблицу умножения.");
            System.exit(0);
        }
            
        }
    
    }

     