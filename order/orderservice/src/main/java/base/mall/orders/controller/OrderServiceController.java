package base.mall.orders.controller;

import base.mall.orders.api.OrderAPI;
import base.mall.orders.model.OrderModel;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderServiceController implements OrderAPI {

    @PostMapping("/findorderbycode")
    @Override
    public OrderModel findOrderByCode(String code) {
        return null;
    }

    @PostMapping("/submit")
    @Override
    public boolean submit(OrderModel orderModel) {
        return false;
    }

    @RequestMapping("/delete")
    @Override
    public boolean delete(String orderCode) {
        return true;
    }

}
