package base.mall.mallweb.controller;


import base.mall.order.service.api.OrderAPI;
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


        @RequestMapping("/delete1")
        public String delete1(){

                return "121212-------";
        }

}
