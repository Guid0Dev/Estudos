package Enumeracoes.Ex01.aplication;

import java.util.Date;
import Enumeracoes.Ex01.entities02.OrderStatus;
import Enumeracoes.Ex01.entities.Order;

public class Program {
    public static void main(String[] args) {
        Order order = new Order(1080,new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order.toString());

        OrderStatus os1 = OrderStatus.DELIVERED;

        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);
    }
}
