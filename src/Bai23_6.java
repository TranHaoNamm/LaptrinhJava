import java.util.Calendar;
import java.util.Scanner;

public class Bai23_6 {
    public static void main(String[] args) {
        /*Viết chương trình tách số và chữ từ chuỗi nhập vào thành 2 chuỗi :
 * ví dụ nhập vào : abc123 sẽ tách và in ra thành 2 chuỗi abc và 123

         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào chuỗi: ");
        String input = sc.nextLine();
        //Tách thành hai chuỗi, chuỗi ký tự và chuỗi số
        StringBuilder chuoi = new StringBuilder();
        StringBuilder so = new StringBuilder();
        //duyệt chuỗi
        for(int i = 0; i<input.length();i++){
            char c = input.charAt(i);
            if(Character.isDigit(c)){
                so.append(c);
            }else if(Character.isLetter(c)){
                chuoi.append(c);

            }


        }
        System.out.println("Chuỗi số là: "+so);
        System.out.println("Chuỗi ký tự là: "+chuoi);
    }
}
