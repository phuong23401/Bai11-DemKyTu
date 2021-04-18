import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mời nhập chuỗi ký tự: ");
        String str = scanner.nextLine();

        System.out.println("Chuỗi là: " + str);
        CharacterCount.characterCount(str);
    }
}
