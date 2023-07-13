package stepikLessons.interfaces.restaurant;

public class Customer {
    void makeOrder(Waiter waiter, String dish) {
        waiter.bringOrder(dish);
    }
}
