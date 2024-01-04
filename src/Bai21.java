import java.util.Random;

public class Bai21 {//random java

    public static void main(String[] args) {
        //Khởi tạo một đối tượng ngẫu nhiên
        Random rd = new Random();
        //lấy ngẫu nhiên 1 số nguyên
        int soNguyen = rd.nextInt(-50,51);
        System.out.println(soNguyen);
        //lấy ngẫu nhiên số thực
        double x = rd.nextDouble(0,100);
        System.out.println(x);


    }
}
