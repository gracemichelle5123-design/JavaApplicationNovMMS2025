// 4.30  
import java.util.Scanner;
 
public class GlobalWarmingQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int correctAnswers = 0;
 
        System.out.println("Question 1: What is the greenhouse effect primarily caused by?");
        System.out.println("1. Ozone depletion in the stratosphere");
        System.out.println("2. Gases in the atmosphere trapping heat radiated from Earth's surface");
        System.out.println("3. Increased output of radiation from the sun");
        System.out.println("4. Ocean currents changing direction");
        if (input.nextInt() == 2) correctAnswers++;
 
        System.out.println("\nQuestion 2: According to NASA and NOAA temperature records, global");
        System.out.println("average surface temperature over the past century has:");
        System.out.println("1. Decreased significantly");
        System.out.println("2. Stayed exactly constant");
        System.out.println("3. Risen");
        System.out.println("4. Changed with no measurable pattern");
        if (input.nextInt() == 3) correctAnswers++;
 
        System.out.println("\nQuestion 3: Which gas is most often cited as the largest contributor");
        System.out.println("to human-caused greenhouse gas emissions?");
        System.out.println("1. Oxygen");
        System.out.println("2. Carbon dioxide");
        System.out.println("3. Nitrogen");
        System.out.println("4. Helium");
        if (input.nextInt() == 2) correctAnswers++;
 
        System.out.println("\nQuestion 4: Which of these is a substantive point raised by climate");
        System.out.println("change skeptics?");
        System.out.println("1. That temperature records are entirely fabricated");
        System.out.println("2. That natural factors (solar cycles, volcanic activity) also affect climate,");
        System.out.println("   and their relative share versus human causes is actively debated");
        System.out.println("3. That greenhouse gases do not exist");
        System.out.println("4. That the atmosphere has no effect on temperature");
        if (input.nextInt() == 2) correctAnswers++;
 
        System.out.println("\nQuestion 5: The Intergovernmental Panel on Climate Change (IPCC) is:");
        System.out.println("1. A single country's national weather agency");
        System.out.println("2. A private oil company's research division");
        System.out.println("3. A U.N.-affiliated body of scientists that assesses climate research");
        System.out.println("4. A social media fact-checking group");
        if (input.nextInt() == 3) correctAnswers++;
 
        System.out.println("\nYou answered " + correctAnswers + " out of 5 correctly.");
 
        if (correctAnswers == 5) {
            System.out.println("Excellent");
        } else if (correctAnswers == 4) {
            System.out.println("Very good");
        } else {
            System.out.println("Time to brush up on your knowledge of global warming.");
            System.out.println("Some places to start: nasa.gov/climate, climate.gov (NOAA),");
            System.out.println("and ipcc.ch for the mainstream scientific assessment; sites such as");
            System.out.println("co2coalition.org present the skeptical side.");
        }
    }
}
