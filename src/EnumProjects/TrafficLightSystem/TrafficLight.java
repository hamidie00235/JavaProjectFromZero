package EnumProjects.TrafficLightSystem;
public enum TrafficLight {
    RED(30, "Stop"),
    YELLOW(5, "Get Ready"),
    GREEN(25, "Go");

    private final int duration; // in seconds
    private final String message;

    // Constructor
    TrafficLight(int duration, String message) {
        this.duration = duration;
        this.message = message;
    }

    // Method to print details
    public void printSignal() {
        System.out.println(this.name() + " → " + message + " (" + duration + " seconds)");
    }

    // Getter methods (optional if needed)
    public int getDuration() {
        return duration;
    }

    public String getMessage() {
        return message;
    }

public static void main(String[] args) {
    // Loop through all traffic lights
    for (TrafficLight light : TrafficLight.values()) {
        light.printSignal();
    }
}
}