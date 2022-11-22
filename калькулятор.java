import java.util.Scanner;
public class калькулятор {
    static Scanner Scan = new Scanner(System.in);

    public static void main(String[] arge) {
        int num1 = number();
        int num2 = number();
        char op = operation();
        int result = cal(num1, num2, op);
        System.out.println("Результат операции: "+result);
    }

    public static int number(){
        System.out.println("Введите число: ");
        int num;
        if (Scan.hasNextInt()){
            num = Scan.nextInt();
        }
        else {
            System.out.println("Ошибка");
            Scan.next();
            num = number();
        }
        return num;
    }

    public static char operation(){
        System.out.println("Введите знак: ");
        char op;
        if (Scan.hasNext()){
            op = Scan.next().charAt(0);
        }
        else{
            System.out.println("Ошибка");
            Scan.next();
            op = operation();
        }
        return op;
    }

    public static int cal(int num1, int num2, char op){
        int result;
        switch (op){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            default:
                System.out.println("Знак не найден");
                result = cal(num1, num2, operation());
        }
        return result;
    }
}