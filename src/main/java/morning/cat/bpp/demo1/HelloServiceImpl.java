package morning.cat.bpp.demo1;

/**
 * @describe: 类描述信息
 * @author: morningcat.zhang
 * @date: 2019/3/15 8:03 PM
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public void say(String message) {
        System.out.println("HelloServiceImpl --- " + message);
    }
}
