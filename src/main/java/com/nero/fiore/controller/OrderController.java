package com.nero.fiore.controller;

import com.nero.fiore.model.CartItem;
import com.nero.fiore.model.Order;
import com.nero.fiore.model.User;
import com.nero.fiore.request.AddCartItemRequest;
import com.nero.fiore.request.OrderRequest;
import com.nero.fiore.service.CartService;
import com.nero.fiore.service.OrderService;
import com.nero.fiore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class OrderController {

    @Autowired
    private OrderService orderService;
    @Autowired
    private UserService userService;
    @Autowired
    private CartService cartService;

    @PostMapping("order")
    public ResponseEntity<Order>createOrder(@RequestBody OrderRequest req,
                                               @RequestHeader ("Authorization")String jwt)throws Exception{
        User user = userService.findUserByJwtToken(jwt);
        Order order = orderService.createOrder(req, user);
        return new ResponseEntity<>(order, HttpStatus.OK);
    }
    @GetMapping("/order/user")
    public ResponseEntity<List<Order>> getOrderHistory(@RequestHeader ("Authorization")String jwt)throws Exception{
        User user = userService.findUserByJwtToken(jwt);
        List <Order> orders = orderService.getUsersOrder(user.getId());
        return new ResponseEntity<>(orders, HttpStatus.OK);
    }


}











