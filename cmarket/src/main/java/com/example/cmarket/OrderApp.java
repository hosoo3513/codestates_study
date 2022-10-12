package com.example.cmarket;

import com.example.cmarket.discount.CurrentDiscountInfo;
import com.example.cmarket.order.Order;
import com.example.cmarket.order.OrderService;
import com.example.cmarket.user.User;
import com.example.cmarket.user.UserGrade;
import com.example.cmarket.user.UserService;

public class OrderApp {
    public static void main(String[] args) {
//        CurrentDiscountInfo discountInfo = new CurrentDiscountInfo();

        AppConfig appConfig = new AppConfig();
        UserService userService = appConfig.userService();
        OrderService orderService = appConfig.orderService();

        Long userId = 0L;
        User user = new User(userId, "RiverLake", UserGrade.GRADE_1);
        userService.signup(user);

        Order order = orderService.createOrder(userId, "coffee", 5000);
        System.out.println("order = " + order);

    }
}
