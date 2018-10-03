import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("tên bạn là gì");
        String space = sc.nextLine();
        System.out.print("Xin chào " + space);
    }
}
