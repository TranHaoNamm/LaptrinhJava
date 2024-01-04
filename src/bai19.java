import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class bai19 {//date time java

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);
        int nam = cal.get(Calendar.YEAR);
        int thang = cal.get(Calendar.MONTH);
        int ngay = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(nam);
        System.out.println(thang+1);
        System.out.println(ngay);
        //set ngày tháng theo ý muốn
        cal.set(Calendar.YEAR,2005);
        cal.set(Calendar.MONTH,11);
        cal.set(Calendar.DAY_OF_MONTH,20);
        //kiểm tra ngày tháng sau thiết lập
        int namSinh = cal.get(Calendar.YEAR);
        int thangSinh = cal.get(Calendar.MONTH);
        int ngaySinh = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println("Ngày tháng năm sinh của tôi là: " +ngaySinh+"/"+(thangSinh+1)+"/"+namSinh);
        //Xuất theo định dạng
        SimpleDateFormat dinhDang = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
        //Tạo ra một đối tượng date để get time trong đối tượng cal
        Date d = cal.getTime();
        String s = dinhDang.format(d);
        System.out.println(s);

    }
}
