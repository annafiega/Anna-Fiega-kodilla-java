package service.information;


import order.Order;

public class EmailService implements InformationService {

    @Override
    public void notifieUser(Order order) {
        System.out.println("Sending email to: " + order.getUser().getEmail());
    }
}
