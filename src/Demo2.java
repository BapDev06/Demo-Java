import java.text.SimpleDateFormat;
import java.util.Date;

@SuppressWarnings("ConstantValue")
public class Demo2 {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = s1 + " is perfect language"; //Java is perfect language

//        String result = s1 + s2;
//        System.out.println(result);

        System.out.println(s1.length()); //4

        System.out.println(s1.startsWith("Java")); //true, kiem tra xem chuỗi có bắt đầu bằng Java?
        System.out.println(s1.contains("Start")); //false, kiểm tra xem chuoi có "Start"?
        System.out.println(s1.compareTo(s2)); // So sanh chuỗi s1 với s2

        if (s1.equalsIgnoreCase("java")) { // so sánh 2 chuỗi = nhau
            System.out.println("TRUE");
        }
        if (s2.startsWith("is")) {
            System.out.println("START");
        } else {
            System.out.println("NOT START");
        }
        if (s1.endsWith("va")) {
            System.out.println("END");
        } else {
            System.out.println("NOT END");
        }

        //Tìm chuỗi
        String s = "Java is simple, Java is great!!!";

        int idx1 = s.indexOf("is"); // 5
        System.out.println(idx1);
        int idx2 = s.lastIndexOf("is"); // 21
        System.out.println(idx2);

        int idx3 = s.indexOf("is", 10);//21, tìm vt "is" bắt đầu từ 10 trong chỗi
        System.out.println(idx3);
        int idx4 = s.lastIndexOf("is", 10);//5, tìm vt "is" từ 0 tới 10 trong chuỗi
        System.out.println(idx4);

        String kq = s.substring(8, 14); // lấy chuỗi con
        System.out.println(kq);

        //Tách chuỗi
        String lang = "Java;Python;Ruby;PHP";
        String[] kqua = lang.split(";"); //Bieu thuc chinh quy (Regular expression)

        for (int i = 0; i < kqua.length; i++) {
            System.out.println(kqua[i]);
        }

        //Thay thế chuỗi
        String text = "Java is Java, Java is powerful";
        String kq2 = text.replaceFirst("Java", "Python");
        System.out.println(kq2);
        String kq3 = text.replaceAll("Java", "Ruby");
        System.out.println(kq3);


        Date d = new Date();
        SimpleDateFormat f = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        System.out.println(f.format(d));
    }
}
