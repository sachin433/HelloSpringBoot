package helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@EnableAutoConfiguration
public class SpringBootDemo {
@RequestMapping("/")
@ResponseBody
String home() {
	return "Hello there buddy!";
}
public static void main(String[] args) throws Exception{

	   SpringApplication.run(SpringBootDemo.class, args);
}
}