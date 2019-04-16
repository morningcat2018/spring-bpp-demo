package morning.cat.bpp.demo1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @describe: 类描述信息
 * @author: morningcat.zhang
 * @date: 2019/3/15 1:15 PM
 */
public class HelloServiceTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-ioc.xml");
        HelloService helloService = context.getBean("helloServiceTwo", HelloService.class);
        helloService.say("world");
    }
}
