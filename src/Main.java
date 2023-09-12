import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
System.out.println("Какое число Фибоначчи по счету вы хотите увидеть?");
       entireFibonacci(); //запросил функцию, чтобы в ней уже выполнялась программа
    }
public static void entireFibonacci() {
    int number;
    int resultNumber;
    Scanner scanner = new Scanner(System.in);
    number = scanner.nextInt();
    resultNumber = fibonacci(number); //функция показывает зависимость между двумя переменными: 1 - которая вошла
                                      //через сканнер и 2 - которая и есть результат
    System.out.println(resultNumber + "- ваше запрашиваемое число Фибоначчи");

}
public static int fibonacci(int number) {
if (number>=2) { //то, что число n должно быть >2 дано в условии функции Фибоначчи
    return fibonacci(number-1)+fibonacci(number-2);
}
if (number==0) {  //нулем функция быть не может, потому что по условия >2
    return 0;
}
if (number==1) {  //единицей функция быть не может, потому что по условия >2
    return 1;
}
return 0; //если индекс будет отрицательный, то функция ломается, а если я пишу return и впишу "-10", то прога вернет 0

}

}
