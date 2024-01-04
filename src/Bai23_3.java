import java.util.Scanner;

public class Bai23_3 {
    public static void main(String[] args) {
       /*Viết chương trình kiểm tra tính hợp lệ của mật khẩu: aaaaaAAAAAA1
 * mật khẩu hợp lệ khi có ít nhất 6 ký tự
 * chứa ít nhất 1 chữ cái ( chữ cái thường hoặc hoa đều được)
 * chứa ít nhất 1 chữ số
2. cho người dùng nhập vào mật khẩu để login / so sánh, nếu đúng mở của, sai
quá 5 lần khóa đăng nhập, thoát chương trình

        */
        //Nhập mật khẩu từ bàn phím
        Scanner sc = new Scanner(System.in);
        int attemp = 0;
       while(true){
           System.out.println("Mời bạn nhập mật khẩu: ");
           String mk = sc.nextLine();
           if(checkPass(mk)){
               System.out.println("Đăng nhập thành công");
               break;
           }else{
               System.out.println("Mật khẩu không hợp lệ vui lòng thử lại: ");
               attemp ++;
           }
           if(attemp == 5){
               System.out.println("Bạn đã nhập sai 5 lần, đăng nhập sẽ khóa");
           }
       }


    }
    //kiểm tra độ dài mật khẩu
    public static boolean checkPass(String password){
            if(password.length()<6){
                return false;
            }
            //kiểm tra có ít nhất 1 chữ cái
            boolean hasLetter = false;
            //kiểm tra có ít nhất 1 chữ số
            boolean hasDigit = false;
            for(char ch : password.toCharArray()) {
                if (Character.isLetter(ch)) {
                    hasLetter = true;
                } else if (Character.isDigit(ch)) {
                    hasDigit = true;

                }
            }
                return hasLetter && hasDigit;
    }
}
