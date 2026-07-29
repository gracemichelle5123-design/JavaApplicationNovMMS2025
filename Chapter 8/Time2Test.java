// 8.7  Enhancing Class Time2
public class Time2Test {
    public static void main(String[] args) {
        Time2 t1 = new Time2(); // 00:00:00
        Time2 t2 = new Time2(2); // 02:00:00
        Time2 t3 = new Time2(21, 34); // 21:34:00
        Time2 t4 = new Time2(12, 25, 42); // 12:25:42
        Time2 t5 = new Time2(t4); // 12:25:42

        System.out.println("Created with:");
        System.out.println("t1: all default arguments");
        System.out.printf("   %s%n   %s%n", t1.toUniversalString(), t1.toString());
       
        System.out.println("t2: hour specified");
        System.out.printf("   %s%n   %s%n", t2.toUniversalString(), t2.toString());
       
        System.out.println("t3: hour and minute specified");
        System.out.printf("   %s%n   %s%n", t3.toUniversalString(), t3.toString());
       
        System.out.println("t4: hour, minute and second specified");
        System.out.printf("   %s%n   %s%n", t4.toUniversalString(), t4.toString());
       
        System.out.println("t5: Time2 object t4 specified");
        System.out.printf("   %s%n   %s%n", t5.toUniversalString(), t5.toString());
    }
}