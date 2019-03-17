package morning.cat.bpp.demo1.bpp;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

/**
 * @describe: 类描述信息
 * @author: morningcat.zhang
 * @date: 2019/3/15 1:19 PM
 */
public class MyBeanPostProcessor implements BeanPostProcessor, Ordered {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeanPostProcessor 初始化之前 --- " + beanName + " - " + bean.toString());
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeanPostProcessor 初始化之后 --- " + beanName + " - " + bean.toString());
        return bean;
    }

    @Override
    public int getOrder() {
        return 1;
    }
}
