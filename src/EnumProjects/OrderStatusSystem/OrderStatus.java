package EnumProjects.OrderStatusSystem;

import EnumProjects.TrafficLightSystem.TrafficLight;

public enum OrderStatus {
    PENDING("Your order is waiting to be pended",false),
    PROCESSING("Your order is waiting to be processed",false),
    SHIPPED("Your order is waiting to be shipped",false),
    DELIVERED("Your order is delivered" ,true),
    CANCELLED("Your order is cancelled " ,true);
    private final String description;
    private final boolean isFinal;

    OrderStatus(String description, boolean isFinal) {
        this.description = description;
        this.isFinal = isFinal;

    }
    public void printDetails(){
        System.out.println(this.name()+ " → " +description+"final:"+isFinal);
    }

    public String getDescription() {
        return description;
    }

    public boolean isFinal() {
        return isFinal;
    }

    @Override
    public String toString() {
        return "OrderStatus{" +
                "description='" + description + '\'' +
                ", isFinal=" + isFinal +
                '}';
    }

    public static void main(String[] args) {
        // Loop through all traffic lights
        for (OrderStatus status:OrderStatus.values()) {
           status.printDetails();
        }
    }
}

