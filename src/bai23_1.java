import java.util.Scanner;

public class bai23_1 {
    public static void main(String[] args) {
        /*Nhập vào 1 chuỗi từ bàn phím ,
        1. đếm xem có bao nhiêu ký tự thường
        2. bao nhiêu in hoa
        3. bao nhiêu số
        4. bao nhiêu space

         */
        int demInthuong = 0;
        int demInhoa = 0;
        int demSo = 0;
        int demSpace = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào 1 chuỗi: ");
        String s = sc.nextLine();
        System.out.println(s.length());
        for(int i = 0; i<s.length();i++){
            char c = s.charAt(i);
            if(Character.isLowerCase(c)){
                demInthuong++;
            }else if(Character.isUpperCase(c)){
                demInhoa++;
            }else if(Character.isDigit(c)){
                demSo++;

            }else if(Character.isWhitespace(c))
                demSpace++;
        }
        System.out.println("Số chữ in thường là: "+demInthuong);
        System.out.println("Số chữ in hoa là: "+demInhoa);
        System.out.println("Số trong chuỗi là: "+demSo);
        System.out.println("Số khoảng trắng là: "+demSpace);

    }
}
