package morning.cat.bpp.deme2;

/**
 * @describe: 类描述信息
 * @author: morningcat.zhang
 * @date: 2019/3/17 3:07 PM
 */
public class Gouzi {
    public Gouzi() {
    }

    public Gouzi(int id, String name) {
        this.id = id;
        this.name = name;
    }

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
