package morning.cat.bpp.demo1;

/**
 * @describe: 类描述信息
 * @author: morningcat.zhang
 * @date: 2019/3/15 8:04 PM
 */
public class HelloServiceImplTwo implements HelloService {
    @Override
    public void say(String message) {
        System.out.println("HelloServiceImplTwo === " + message);
    }
}
