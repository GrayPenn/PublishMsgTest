import java.util.Calendar;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        String msg = "aaa";
        System.out.println(Integer.parseInt("666"));
        System.out.println(Integer.parseInt("666"));
        System.out.println(Integer.parseInt("666"));
        Date d1 = new Date();
        Date d2 = new Date();
        System.out.println(d1.after(d2));
        System.out.println(new Date(2018,05,29).after(d2));
        System.out.println(d1);
        System.out.println(  Calendar.getInstance().getTime());
        Calendar c = Calendar.getInstance();
        c.set(2018,05,29);
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        //System.out.println(c.compareTo(Calendar.getInstance().getTime()));
        d1 = c.getTime();
        System.out.println(d2);
        System.out.println(d1);
        System.out.println(d1.compareTo(d2));
        int b = 5;
        double a =5.5;
        double d = b+a;
        System.out.println(d);
    }
}
