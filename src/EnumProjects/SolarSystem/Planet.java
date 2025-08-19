package EnumProjects.SolarSystem;

public enum Planet {
    MERCURY(9.4, 5000),
    VENUS(99, 300),
    EARTH(30, 200),
    MARS(50, 400),
    JUPITER(60, 500),
    SATURN(100, 700),
    URANUS(200, 700),
    NEPTUNE(50, 700);

    private double mass;
    private double radius;

    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }

    // Method to calculate surface gravity
    public double surfaceGravity() {
        return mass / (radius * radius);
    }

    // Method to print details
    public void printDetails() {
        System.out.println(this.name() +
                " → Mass: " + mass +
                ", Radius: " + radius +
                ", Gravity: " + surfaceGravity());
    }

    public static void main(String[] args) {
        for (Planet p : Planet.values()) {
            p.printDetails();
        }
    }
}
