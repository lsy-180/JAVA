package jicheng;

public class BuOuMao extends Animal {

    @Override
    public void drink() {
//        super.drink();
        System.out.println("布偶猫喝水");
    }

    @Override
    public void eat() {
//        super.eat();
        System.out.println("布偶猫吃饭");
    }

    public void zhua() {
        System.out.println("布偶猫抓老鼠");
    }
}
