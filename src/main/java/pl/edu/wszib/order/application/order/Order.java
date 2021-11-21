package pl.edu.wszib.order.application.order;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@AllArgsConstructor
public class Order {
    @Getter
    private final OrderId id;
    private final OrderItems items;

    public static Order create() {
        return new Order(
                OrderId.create(),
                OrderItems.create()
        );
    }

    public Order addItem(final OrderItem orderItem) {
        return new Order(id, items.addItem(orderItem));
    }

    // ORDERS
    // id
    // amount

    // ORDER_ITEMS
    // id
    // order_id
    //

    // SELECT * FROM ORDERS o
    // JOIN ORDER_ITEMS oi ON o.id = oi.order_id
    // WHERE o.id = '052ae521-793c-4698-b5b8-73f9ef239b16'
}
