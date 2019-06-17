package base.mall.mallweb.controller;


import base.mall.orders.api.OrderAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

        @Autowired
        private OrderAPI orderApi;

        @RequestMapping("/delete")
        public String delete(){

            return orderApi.delete("abc")+"1212";
        }


}
