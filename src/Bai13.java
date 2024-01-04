
public class Bai13 {//vòng lập do while
    public static void main(String[] args) {
        int a = 1;
        int tong = 0;
        do{
            tong += a;
            a++;
        }while (a<=5);
        System.out.println("tổng = "+tong);

    }
}
