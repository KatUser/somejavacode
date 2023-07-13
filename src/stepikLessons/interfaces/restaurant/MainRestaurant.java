package stepikLessons.interfaces.restaurant;

public class MainRestaurant {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.makeOrder(new Waiter() {
            @Override
            public void bringOrder(String dish) {
                System.out.println("Waiter is bringing " + dish);
            }
        }, "суп из потрошков");
    }
}
