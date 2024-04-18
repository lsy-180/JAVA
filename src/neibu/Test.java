package neibu;

public class Test {
    public static void main(String[] args) {
        // 成员内部类
//        Outer.Inner oi=new Outer().new Inner();
        Outer outer=new Outer();

        System.out.println(outer.getI());
//        oi.show();
        // 匿名内部类 相当于 继承 重写方法 创建对象 如果只需要用一次 那就使用匿名内部类
        new Animal(){
            @Override
            public void eat(){
                System.out.println("吃");
            }
        };
        // 接口实现类的对象
        Animal animal= new Animal() {
            @Override
            public void eat() {
                System.out.println("吃");
            }
        };
        animal.eat();
    }
}
