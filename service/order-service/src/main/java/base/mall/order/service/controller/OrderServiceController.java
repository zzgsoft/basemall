package base.mall.order.service.controller;


import base.mall.order.service.api.OrderAPI;
import base.mall.order.service.api.dto.OrderDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderServiceController implements OrderAPI {

    @PostMapping("/findorderbycode")
    @Override
    public OrderDTO findOrderByCode(String code) {
        return null;
    }

    @PostMapping("/submit")
    @Override
    public boolean submit(OrderDTO orderDTO) {
        return false;
    }

    @RequestMapping("/delete")
    @Override
    public boolean delete(String orderCode) {
        return true;
    }

}
