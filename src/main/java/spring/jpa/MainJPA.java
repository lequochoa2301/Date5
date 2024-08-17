package spring.jpa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.jpa.config.SpringConfigJPA;
import spring.jpa.entity.OrderDetailsEntity;
import spring.jpa.entity.OrderEntity;
import spring.jpa.repository.OrderDetailsRepository;
import spring.jpa.repository.OrderRepository;

import java.util.Date;

public class MainJPA {
    static ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigJPA.class);
    static OrderRepository orderRepository = (OrderRepository) context.getBean("orderRepository");
    static OrderDetailsRepository orderDetailsRepository = (OrderDetailsRepository) context.getBean("orderDetailsRepository");

    public static void main(String[] args) {
        createNewOrderDetailsWithOrder();

    }
    private static void createNewOrderDetailsWithOrder() {
        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setOrderDate(new Date());
        orderEntity.setCustomerName("Nguyen Thi Be Sang");
        orderEntity.setCustomerAddress("Binh Dinh");
        orderRepository.save(orderEntity);

       OrderDetailsEntity orderDetailsEntity = new OrderDetailsEntity();
       orderDetailsEntity.setProductName("quan ao quan");
       orderDetailsEntity.setQuantity(1001);
       orderDetailsEntity.setUnitPrice(100.5);
       orderDetailsEntity.setOrder(orderEntity);
       orderDetailsRepository.save(orderDetailsEntity);

        System.out.println("ket noi thanh cong");
    }
}
