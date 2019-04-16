package morning.cat.bpp.demo3;

import morning.cat.bpp.demo1.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @describe: 类描述信息
 * @author: morningcat.zhang
 * @date: 2019/3/17 3:03 PM
 */
public class BeanNamingTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext-demo3.xml");
        HelloService helloService = applicationContext.getBean("helloServiceTwo4", HelloService.class);
        helloService.say("world");

        HelloService helloService2 = applicationContext.getBean("helloServiceTwo", HelloService.class);
        System.out.println(helloService == helloService2);

        HelloService helloService3 = applicationContext.getBean("MyService", HelloService.class);
        System.out.println(helloService == helloService3);
    }
}
