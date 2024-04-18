package dongwu;

public class Manager extends Employee{

    public double price;

    public Manager(int code_id, String name, double gongzi, double price) {
        super(code_id, name, gongzi);
        this.price = price;
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("吃米饭");
    }

    @Override
    public void gongzuo() {
        super.gongzuo();
        System.out.println("管理其他人");
    }

    public double getPrice() {
        return price;
    }
}
