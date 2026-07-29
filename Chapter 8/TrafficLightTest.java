// 8.10  Write an enum TrafficLight whose constants (RED, GREEN, YELLOW) take a duration parameter. Test it.
public class TrafficLightTest {
    enum TrafficLight {
        RED(30), GREEN(25), YELLOW(5);
 
        private final int duration;
 
        TrafficLight(int duration) {
            this.duration = duration;
        }
 
        public int getDuration() { return duration; }
    }
 
    public static void main(String[] args) {
        for (TrafficLight light : TrafficLight.values()) {
            System.out.println(light + " lasts " + light.getDuration() + " seconds");
        }
    }
}

