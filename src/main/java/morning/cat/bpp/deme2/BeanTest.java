package morning.cat.bpp.deme2;

import morning.cat.bpp.demo1.HelloService;
import morning.cat.bpp.demo1.HelloServiceImplTwo;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @describe: 类描述信息
 * @author: morningcat.zhang
 * @date: 2019/3/17 3:03 PM
 */
public class BeanTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        ConfigurableListableBeanFactory beanFactory = applicationContext.getBeanFactory();

        HelloService helloService = new HelloServiceImplTwo();
        beanFactory.registerSingleton("helloService", helloService);

        HelloService demo = applicationContext.getBean("helloService", HelloService.class);
        demo.say("你好吗");

    }
}
