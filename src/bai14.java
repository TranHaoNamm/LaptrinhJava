public class bai14 {//vòng lập for

    public static void main(String[] args) {
        int i;
        for(i = 0; i<=10; i +=2){
            System.out.println("i = "+i);
            //Tính tổng từ 0 - 10
            int tong = 0;
            for(i = 0; i<= 10; i++){
                tong += i;
            }
            System.out.println("Tổng = " +tong);
        }
    }
}
