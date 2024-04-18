package dongwu;

/*
子类不能继承父类的构造方法，但是可以通过super调用
子类构造方法的第一行，有一个默认的super();
默认先访问父类中无参的构造方法，再执行自己。
如果想要方法文父类有参构造，必须手动书写。
* */
public class Test {
    public static void main(String[] args) {   
        Student student=new Student("张三",15);
        System.out.println(student.age+" "+student.name);
        Manager manager=new Manager(1,"lsy",58.6,9896.9);
        manager.eat();
        manager.gongzuo();
        Chun chun=new Chun();
        chun.eat();
        chun.gongzuo();
    }
}
