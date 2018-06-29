package order.validator;

import order.OrderProcessDto;

public interface Validator {

    void validateOrder(OrderProcessDto processDto);
}
