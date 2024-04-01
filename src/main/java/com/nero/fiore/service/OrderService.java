package com.nero.fiore.service;

import com.nero.fiore.model.Order;
import com.nero.fiore.model.User;
import com.nero.fiore.request.OrderRequest;

import java.util.List;

public interface OrderService {
    public Order createOrder(OrderRequest order, User user) throws Exception;
    public Order updateOrder(Long orderId, String orderStatus) throws Exception;
    public void cancelOrder(Long orderId)throws Exception;
    public List<Order> getUsersOrder(Long userId)throws Exception;
    public List<Order> getRestaurantsOrder(Long restaurantId, String orderStatus)throws Exception;
    public Order findOrderById(Long orderId)throws Exception;

}
