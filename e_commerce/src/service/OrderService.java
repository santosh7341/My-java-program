package service;

import java.util.List;

import entity.Order;
import model.OrderModel;

public interface OrderService {

	int placeOrder(String token, Order order);

	List<OrderModel> checkuserOrderHistory(int userId, String token);

}
