package dongwu;

public class Chun extends Employee{

    public Chun() {
    }

    public Chun(int code_id, String name, double gongzi) {
        super(code_id, name, gongzi);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("吃米饭");
    }

    @Override
    public void gongzuo() {
        super.gongzuo();
        System.out.println("炒菜");
    }

    public String toString() {
        return "Chun{}";
    }
}
