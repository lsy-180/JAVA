package jicheng;

public class HaShiQi extends Animal{
    @Override
    public void drink() {
//        super.drink();
        System.out.println("哈士奇喝水");
    }

    @Override
    public void eat() {
//        super.eat();
        System.out.println("哈士奇吃饭");
    }
    public void kan(){
        System.out.println("哈士奇看家");
    }
    public void chai(){
        System.out.println("哈士奇拆家");
    }
}
