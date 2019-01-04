
import order.Order;
import order.OrderProcessDto;
import order.OrderProcessor;
import order.OrderRetreiver;
import order.validator.OrderValidator;
import order.validator.Validator;
import service.information.EmailService;
import service.repository.DatabaseRepository;

public class Food2DoorRunner {

    public static void main(String[] args) {

        OrderRetreiver orderRetreiver = new OrderRetreiver();
        Order order = orderRetreiver.getSampleOrder("ExtraFoodShop");

        OrderProcessor orderProcessor = new OrderProcessor(order,new EmailService(),new DatabaseRepository());
        OrderProcessDto orderProcessDto = orderProcessor.processOrder();

        Validator validator = new OrderValidator();
        validator.validateOrder(orderProcessDto);

    }
}
