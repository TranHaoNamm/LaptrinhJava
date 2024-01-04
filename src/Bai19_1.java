import java.util.Calendar;
import java.util.Scanner;
public class Bai19_1 {
    public static void main(String[] args) {
        int day, month, year, tuoi;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập ngày sinh: ");
        day = sc.nextInt();
        System.out.println("Mời nhập vào tháng sinh: ");
        month = sc.nextInt();
        System.out.println("Mời nhập vào năm sinh: ");
        year = sc.nextInt();
        //khởi tạo
        Calendar birthday = Calendar.getInstance();
        //set ngày tháng năm sinh do người dùng nhập vào
        birthday.set(year,month,day);
        //xuất ngày tháng năm sinh
        int namSinh = birthday.get(Calendar.YEAR);
        int thangSinh = birthday.get(Calendar.MONTH);
        int ngaySinh = birthday.get(Calendar.DAY_OF_MONTH);
        System.out.println("Ngày tháng năm sinh của bạn là: "
                                        +ngaySinh+"/"
                                          +(thangSinh+1)+"/"
                                            +namSinh);
        //Tính tuổi
        //năm hiện tại
        Calendar now = Calendar.getInstance();
        int namHientai = now.get(Calendar.YEAR);
        tuoi = namHientai - namSinh;
        System.out.println("Tuổi của bạn là: "+tuoi);




    }
}
