package base.mall.order.service.api;


import base.mall.order.service.api.dto.OrderDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "order-server")
public interface OrderAPI {

    @PostMapping("/orders/findorderbycode")
    OrderDTO findOrderByCode(String code);

    @PostMapping("/orders/submit")
    boolean submit(OrderDTO orderDTO);

    @RequestMapping("/orders/delete")
    boolean delete(String orderCode);


}
