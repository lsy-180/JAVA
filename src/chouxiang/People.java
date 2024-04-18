package chouxiang;


/*
 * 抽象类不可创建对象 即不能实例化
 * 抽象类中不一定有抽象方法
 * 当创建子类对象时，给属性进行赋值
 * */
public abstract class People {

    private int age;

    public People(int age) {
        this.age = age;
    }

    public abstract void work();

    public void sleep() {
        System.out.println("在睡觉！");
    }
}
