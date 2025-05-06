package nest;

public class Order {
    private String customerName;
    private int orderId;
    private double totalAmount;

    public Order(String customerName, int orderId, double totalAmount) {
        this.customerName = customerName;
        this.orderId = orderId;
        this.totalAmount = totalAmount;
    }    
}
