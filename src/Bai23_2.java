/*
String str1= “English = 78 Science = 83 Math = 68 History = 65”
1. tính tổng các số trong chuỗi trên
2. tính trung bình cộng
 */
public class Bai23_2 {
    public static void main(String[] args) {
        String str1 = "English = 78 Science = 83 Math = 68 History = 65";

        // Tách các từ trong chuỗi
        String[] parts = str1.split(" ");

        int sum = 0;
        int count = 0;
        for(int i = 1; i<parts.length;i++){
            if((i+1)%3==0){
                sum += Integer.parseInt(parts[i]);
                count ++;
            }

        }
        double tb = (double) sum/count;
        System.out.println("Tổng các số trong chuỗi: " +sum);
        System.out.println("Trung bình các số trong chuỗi: "+tb);

    }
}