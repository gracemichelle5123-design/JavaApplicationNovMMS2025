// 6.15  Write an application that sums a series of integers passed as command-line arguments.
public class ArraySize {
      public static void main(String[] args) {
          int size = (args.length > 0)? Integer.parseInt(args[0]) : 10;
          int[] array = new int[size];
          System.out.println("Array size: " + size);
      }
  }
    

