// Task 3 (Singleton, enum)
public class Order {
    public enum OrderStatus {
        NEW, IN_PROGRESS, DELIVERED, CANCELLED
    }

    private OrderStatus status;

    public Order() {
        this.status = OrderStatus.NEW;
    }

    public void setStatus(OrderStatus status) {
        if (this.status == OrderStatus.DELIVERED && status == OrderStatus.CANCELLED) {
            System.out.println("Cannot cancel a delivered order.");
            return;
        }
        this.status = status;
    }

    public OrderStatus getStatus() {
        return status;
    }
}
