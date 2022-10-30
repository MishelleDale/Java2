import java.util.Scanner;
import java.util.logging.*;

public class calculator {
    static Scanner scanner = new Scanner(System.in);
 
    public static void main(String[] args) {
        double num1 = getDouble();
        double num2 = getDouble();
        char operation = getOperation();
        double result = calc(num1,num2,operation);
        System.out.println("Результат операции: "+result);
        logger.info("Операция завершена с результатом: " + result);
    }
 
    public static double getDouble(){
        System.out.println("Введите число:");
        double num;
        if(scanner.hasNextDouble()){
            num = scanner.nextDouble();
            logger.info("Выбрано число: " + num);
        } else {
            logger.warning("Допушена ошибка");
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scanner.next();//рекурсия
            num = getDouble();
        }
        return num;
    }
 
    public static char getOperation(){
        System.out.println("Введите операцию:");
        char operation;
        if(scanner.hasNext()){
            logger.info("Выбрана операция");
            operation = scanner.next().charAt(0);
        } else {
            logger.warning("Допушена ошибка");
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            scanner.next();//рекурсия
            operation = getOperation();
        }
        return operation;
    }

    public static double calc(double num1, double num2, char operation){
        double result;
        switch (operation){
            case '+':
                logger.info("Выбран +");
                result = num1+num2;
                break;
            case '-':
                logger.info("Выбран -");
                result = num1-num2;
                break;
            case '*':
                logger.info("Выбрано *");
                result = num1*num2;
                break;
            case '/':
                logger.info("Выбрано /");
                result = num1/num2;
                break;
            default:
                logger.warning("Допушена ошибка");
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calc(num1, num2, getOperation());//рекурсия
        }
        return result;
    }

    public static final Logger logger = Logger.getLogger("main");
}


