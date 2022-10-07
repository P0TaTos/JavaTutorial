import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("string 입력");
        String string = scanner.nextLine();
        System.out.println("integer 입력");
        int integer = scanner.nextInt();

        NewClass newClass = new NewClass();
        newClass.overloadMethod();
        newClass.overloadMethod(integer);
        newClass.overloadMethod(string);
        newClass.overloadMethod(string,integer);
    }
}