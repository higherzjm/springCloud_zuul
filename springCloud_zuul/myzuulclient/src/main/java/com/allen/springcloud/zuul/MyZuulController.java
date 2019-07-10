package com.allen.springcloud.zuul;

import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;


@RestController
public class MyZuulController {
    /**
     简单路由的测试
     简单路由可以省略path配置,没有path的话sourcezjm当后缀直接访问

      http://localhost:8090/sourcezjm/zuulServer_test1/张三
      该路径根据yml配置会转发的路径为
      http://localhost:8081/zuulServer_test1/张三
      请求路径要跟网关服务提供者的目标项目请求路径搭配
     */
    public void test1(){

    }

    /**
       ribbon路由的测试
       URl 如果不是简单路由的格式也不是跳转路由的格式，
       zuul就会看成一个serviceid了,
       url 格式是HTTP或HTTPS开头的就会看作是简单路由，
       格式是forward: 开头就是跳转路由了

       http://localhost:8090/zuultest/zuulServer_test2
       该路径根据yml配置都会转发的路径为
       http://localhost:8081/zuulServer_test2
     */
    public void test2(){

    }

    /**
     *
       跳转路由 URL参数需要由forward:...构成

       http://localhost:8090/forwardZuul/123
       该路径根据yml配置会转发到本控制器的forwardZuul_test1/**请求路径，也就是下面的forwardZuul_test1方法了
     */
    public void test3(){

    }

    @RequestMapping(value = "/forwardZuul_test1/{name}", method = RequestMethod.GET)
    public String forwardZuul_test1(@PathVariable("name") String name){
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("HH:mm:ss");
        String time=simpleDateFormat.format(new Date());

        return time+":跳转路由测试:"+name;
    }
}
