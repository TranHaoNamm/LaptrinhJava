import java.util.Scanner;

/*
Viết chương trình kiểm tra 1 chuỗi nhập vào từ bàn phím có phải Panlyndrome ( là
chuỗi có đảo ngược cũng bằng chính nó, ví dụ madam, radar …)
 */
public class bai23_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào 1 chuỗi: ");
        String chuoi = sc.nextLine();
        String chuoiDao = new StringBuilder(chuoi).reverse().toString();
        //So sánh chuỗi đảo ngược coi có phải là Panlydrome không
        if(chuoi.equalsIgnoreCase(chuoiDao)){
            System.out.println("Đây là chuỗi Panlydrome.");
        }else{
            System.out.println("Đây không phải là chuỗi Panlydrome.");
        }

    }
}
