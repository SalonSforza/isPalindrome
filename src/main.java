import java.util.Scanner;

class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст");
        String text = scanner.nextLine();
        scanner.close();
        System.out.println(isPalindromeLogic.isPalindrome(text));


    }

}


