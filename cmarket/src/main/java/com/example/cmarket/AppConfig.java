package com.example.cmarket;

import com.example.cmarket.discount.DiscountInfo;
import com.example.cmarket.discount.RateDiscountInfo;
import com.example.cmarket.order.OrderService;
import com.example.cmarket.order.OrderServiceImpl;
import com.example.cmarket.user.UserRepository;
import com.example.cmarket.user.UserRepositoryImpl;
import com.example.cmarket.user.UserService;
import com.example.cmarket.user.UserServiceImpl;

public class AppConfig {
    public UserService userService() {
        return new UserServiceImpl(userRepository());
        //userRepository() -> new UserRepositoryImpl()로 교체하고 밑의 것 생략 가능
    }

    public UserRepository userRepository() {
        return new UserRepositoryImpl();
    }

    public OrderService orderService() {
        return new OrderServiceImpl(userRepository(), discountInfo());
    }

    public DiscountInfo discountInfo() {
        return new RateDiscountInfo();
    }
}
