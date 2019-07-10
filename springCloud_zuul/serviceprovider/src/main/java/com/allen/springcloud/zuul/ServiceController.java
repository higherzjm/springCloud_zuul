package com.allen.springcloud.zuul;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
public class ServiceController {

	/**
	 * 网关服务提供者测试1
	 * @return
	 */
	@RequestMapping("/zuulServer_test1/{name}")
	public String zuulServer_test1(@PathVariable String name,HttpServletRequest request)throws Exception{
		String age=request.getParameter("age");
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("HH:mm:ss");
		String time=simpleDateFormat.format(new Date());
		return time+":网关服务提供者测试1:"+name+":"+age;
	}
	/**
	 * 网关服务提供者测试2
	 * @return
	 */
	@RequestMapping("/zuulServer_test2")
	public String zuulServer_test2()throws Exception{
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("HH:mm:ss");
		String time=simpleDateFormat.format(new Date());
		return time+":网关服务提供者测试2";
	}
}
