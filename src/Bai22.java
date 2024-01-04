import java.util.Scanner;
public class Bai22 {//kiểu ký tự char trong java
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Khai báo
        char ch = 'a';
        char ch2 = 66;//khởi tạo
        System.out.println(ch2);
        //khai báo
        char ch3;
        System.out.println("Mời nhập vào 1 ký tự: ");
        String s = sc.nextLine();
        char ch4 = s.charAt(0);
        System.out.println("Ký tự vừa nhập là: " +ch4);
        //so sánh 2 ký tự
        System.out.println(Character.compare('b','b'));
        System.out.println(Character.compare('a','b'));
        System.out.println(Character.compare('A','a'));

        char ch5 = '1';
        char ch6 = 'a';
        char ch7 = 'A';
        char ch8 = ' ';
         //kiểm tra xem có phải số hay không
        System.out.println(Character.isDigit(ch5));
        //kiểm tra xem có phải ký tự hay không
        System.out.println(Character.isLetter(ch6));
        // kiểm tra có viết thường hay không
        System.out.println(Character.isLowerCase(ch6));
        //kiểm tra có viết hoa hay không
        System.out.println(Character.isUpperCase(ch6));
        //kiểm tra xem có khoảng trắng hay không
        System.out.println(Character.isWhitespace(ch8));


    }
}
