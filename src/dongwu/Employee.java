package dongwu;

public class Employee {
    public int code_id;
    public String name;
    public double gongzi;

    public Employee() {
    }

    public Employee(int code_id, String name, double gongzi) {
        this.code_id = code_id;
        this.name = name;
        this.gongzi = gongzi;
    }

    public void gongzuo() {
        System.out.println("工作");
    }

    public void eat() {
        System.out.println("吃饭");
    }

    /**
     * 获取
     *
     * @return code_id
     */
    public int getCode_id() {
        return code_id;
    }

    /**
     * 设置
     *
     * @param code_id
     */
    public void setCode_id(int code_id) {
        this.code_id = code_id;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return gongzi
     */
    public double getGongzi() {
        return gongzi;
    }

    /**
     * 设置
     *
     * @param gongzi
     */
    public void setGongzi(double gongzi) {
        this.gongzi = gongzi;
    }

    public String toString() {
        return "Employee{code_id = " + code_id + ", name = " + name + ", gongzi = " + gongzi + "}";
    }
}
