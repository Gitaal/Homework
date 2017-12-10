import Calculator.Calc;
import MassivSlov.MassivSlov;
import MaxElementMassiva.MaxElement;
import NewYearsGift.AllGift;

import java.util.Scanner;

/**
 * Created by OWL on 01.12.2017.
 *
 * @author OWL
 * @see #main(String[])
 */
public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calc calc = new Calc();
        MassivSlov massivSlov = new MassivSlov();
        MaxElement maxElement = new MaxElement();
        AllGift allGift = new AllGift();
        System.out.println("Какую программу Вы собираетесь выбрать?");
        System.out.println("Введите 1 - калькулятор");
        System.out.println("Введите 2 - поиск наимбольшего слова в массиве");
        System.out.println("Введите 3 - замена наименьшего отрицательного числа с наименьшим положительным");
        System.out.println("Введите 4 - получить информацию по подарку");
        int vibor = scanner.nextInt();
        switch (vibor) {
            case 1:
                calc.setScanner();
                break;
            case 2:
                massivSlov.setScanner();
                break;
            case 3:
                maxElement.zamenaElementa();
                break;
            case 4:
                allGift.allGift();
                break;
            default:
                System.err.println("Выход из операции.");//Если некорректная операция
        }


    }
}
