// 6.11

public class ArrayOperations {
    public static void main(String[] args) {

        
        int[] counts = new int[10]; 
        int[] bonus = new int[15]; 
        int[] bestScores = {87, 68, 94, 100, 83}; 

        // a) Set the 10 elements of integer array counts to zero
        for (int i = 0; i < counts.length; i++) {
            counts[i] = 0;
        }

        // b) Add one to each of the 15 elements of integer array bonus
        for (int i = 0; i < bonus.length; i++) {
            bonus[i]++;
        }

        // c) Display the five values of integer array bestScores in column format
        for (int score : bestScores) {
            System.out.println(score);
        }
    }
}