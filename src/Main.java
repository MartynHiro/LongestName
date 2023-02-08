import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String maxName = null;
        int maxNameLength = 0;
        System.out.println("Приветствую пользователь!");
        System.out.println("-------------------------");

        //name check loop
        while (true) {
            System.out.println("Введите имя с большой буквы или введите : end , для завершения программы");
            System.out.print(">>");
            String input = scan.nextLine();
            if ("end".equals(input)) {
                System.out.println("Программа завершена");
                break;
            }

            //is the first letter capitalized?
            char firstSymbol = input.charAt(0);
            if (Character.isLowerCase(firstSymbol)) {
                System.out.println("Вы ввели имя с маленькой буквы");
                System.out.println("------------------------------");
            } else {

                //name length detection
                if (maxName == null) {
                    System.out.println("Это первое введенное имя!");
                    System.out.println("-------------------------");
                    maxName = input;
                    maxNameLength = maxName.length();
                } else {
                    int newNameLength = input.length();

                    if (maxNameLength > newNameLength) {
                        int difLength1 = maxNameLength - newNameLength;
                        System.out.println("Это не самое длинное имя");
                        System.out.println("Самое длинное имя: " + maxName + " длинной в " + maxNameLength + " букв");
                        System.out.println("Оно было больше на: " + difLength1);
                        System.out.println("-----------------------------------------------");
                    } else if (maxNameLength < newNameLength) {
                        int difLength2 = newNameLength - maxNameLength;
                        System.out.println("Поздравляем! Это самое длинное имя!");
                        System.out.println("В нем: " + newNameLength + " букв");
                        System.out.println("Оно длиннее предыдущего на: " + difLength2);
                        System.out.println("-----------------------------------------------");
                        maxName = input;
                        maxNameLength = newNameLength;
                    } else {
                        System.out.println("Введенное вами имя равно по длине предыдущему максимальному");
                        System.out.println("-----------------------------------------------------------");
                        maxName = input;
                    }
                }
            }
        }
    }
}