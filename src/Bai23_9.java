import java.util.Scanner;

public class Bai23_9 {
    public static void main(String[] args) {
        /*
        Nhập vào 1 chuỗi => Tối ưu hoá chuỗi ( chuẩn hoá chuỗi) theo quy tắc :
1, không có khoảng trắng dư thừa
2, các từ cách nhau bởi 1 khoảng trắng
3, Ký tự đầu tiên của mỗi từ phải được viết hoa, chữ cái phía sau viết thường
Ví dụ : input: “ Gà lạI LẬp TRìnH ”
 Output: “Gà Lại Lập Trình”

         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào chuỗi bất kỳ: ");
        String input = sc.nextLine();
        System.out.println(chuanHoa(input));
    }
    //hàm
    public static String chuanHoa(String input){
        input = input.trim();
        String[] worlds = input.split("\\s+");
        for(int i = 0; i<worlds.length;i++){
            worlds[i] = worlds[i].toLowerCase();
            String firstChar = worlds[i].substring(0,1);
            firstChar = firstChar.toUpperCase();
            worlds[i] = firstChar + worlds[i].substring(1);
        }
        return String.join(" ",worlds);
    }

}
