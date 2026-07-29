
public class DateTest2 {
    public static void main(String[] args) {
        Date2 d1 = new Date2(6, 14, 1992);
        Date2 d2 = new Date2("June", 14, 1992);
        Date2 d3 = new Date2(166, 1992);
 
        System.out.println(d1.toMMDDYYYY());
        System.out.println(d1.toDDDYYYY());
        System.out.println(d2.toMMDDYYYY());
        System.out.println(d3.toMonthDDYYYY());
    }
}

