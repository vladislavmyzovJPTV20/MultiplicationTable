package multiplicationtable;
import java.util.Random;
import java.util.Scanner;

public class MultiplicationTable {
    // Создаем три цвета
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String BLACK = "\033[0m";
    
    public static void main(String[] args) {
        // Создаем переменную правильных ответов и присваеваем ей значение нуля, то же самое далем с а, б и попытками
        int correct_answers = 0;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int tries = 0;
        
        // Пока попытки не равны нуля, мы запускаем наш цикл while и закоплняем переменные а и б случайными числами
        while(tries != 5) {
            a = random.nextInt(9)+1;
            b = random.nextInt(9)+1;
            System.out.print(a + "*" + b + "=");
            int UserInput = scanner.nextInt(); // Пользователь вводит ответ на пример
            tries = tries + 1; // Попытки увеличиваются
            // Если ответ верен, то мы окрашиваем надпись "Ваш ответ верен" в зеленый цвет и увеличиваем кол-во верных ответов на 1
            if(UserInput == a * b) {
                System.out.println(ANSI_GREEN + "Ваш ответ верен!" + BLACK);
                correct_answers = correct_answers + 1;
                
            }
            // Если же неверный, то выводим надпись "Ваш ответ неверен" красного цвета и не прибавляем верных ответов
            if(UserInput != a * b) {
                System.out.println(ANSI_RED + "Ваш ответ неверен!" + BLACK);           
                
            }
            
        }
        // В конце, исходя из числа верных ответов, мы выводим соответсвующий текст похвалы, 
        // либо же наоборот указываем на то, что надо учить таблицу умножения
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

     