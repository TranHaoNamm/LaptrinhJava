public class bai17 {//xử lý ngoại lệ

    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        try {
            int c = a / b;
            System.out.println("c= " + c);
        }catch(ArithmeticException ex){
            System.out.println("Có lỗi toán học rồi bạn ơi, cần xem lại");
            ex.printStackTrace();

        }catch (Exception ex){
            System.out.println("có lỗi rồi bạn ơi");
            ex.printStackTrace();
        }finally {
            System.out.println("Có lỗi hay không có lỗi vẫn thực hiện cái này");
        }
        System.out.println("Đoạn code phía sau");
    }
}
