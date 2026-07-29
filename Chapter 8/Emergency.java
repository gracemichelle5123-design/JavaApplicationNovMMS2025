// 8.19
public class Emergency {
    private String callerName;
    private String callerPhone;
    private String location;
    private String timeReported;
    private String natureOfEmergency;
    private String responseType; 
    private String status; 

    public Emergency(String name, String phone, String loc, String nature) {
        callerName = name;
        callerPhone = phone;
        location = loc;
        natureOfEmergency = nature;
        status = "Pending";
    }

    public String toString() {
        return String.format("Emergency: %s at %s. Status: %s",
            natureOfEmergency, location, status);
    }
}