package base.mall.orders.api;


import base.mall.orders.model.OrderModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "order-server")
public interface OrderAPI {

    @PostMapping("/orders/findorderbycode")
    OrderModel findOrderByCode(String code);

    @PostMapping("/orders/submit")
    boolean submit(OrderModel orderModel);

    @RequestMapping("/orders/delete")
    boolean delete(String orderCode);


}
