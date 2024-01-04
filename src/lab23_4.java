import java.util.Scanner;

public class lab23_4 {
    public static void main(String[] args) {
        /*Viết chương trình chuyển tin nhắn sang mật mã theo bảng :
#a="abcdefghijklmnopqrstuvwxyz"
#b="zxcvbnmasdfghjklqwertyuiop“

         */
        //Tạo bảng mã hóa
        String a = "abcdefghijklmnopqrstuvwxyz";
        String b = "zxcvbnmasdfghjklqwertyuiop";
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập chuỗi tin nhắn: ");
        String input = sc.nextLine();

        //Biến lưu tin nhắn sau khi đã được mã hóa
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            //Tìm vị trí trong biến a
            int index = a.indexOf(c);
            //Nếu ký tự này không có trong biến a thì không cần mã hóa và thêm nó vào ouput ngay lập tức
            if (index == -1) {
                output += c;
                //Nếu có ký tự trong biến a thì lấy ra ký tự từ biến b tại vị trí tương ứng và thêm nó vào ouput
            } else {
                output += b.charAt(index);

            }
        }
        System.out.println("Tin nhắn mã hóa sau là: " +output);
    }
}






