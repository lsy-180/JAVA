package dongwu;

public class Animal {
    public static void main(String[] args) {
        Hukky hukky=new Hukky();
        Shapi shapi=new Shapi();
        China_Dog china_dog=new China_Dog();
        hukky.eat();
        hukky.drink();
        hukky.kanjia();
        hukky.chai();
        shapi.eat();
        shapi.drink();
        shapi.kanjia();
        china_dog.drink();
        china_dog.eat();
        china_dog.kanjia();
    }
}

class Animals {
    public void eat() {
        System.out.println("吃饭");
    }

    public void drink() {
        System.out.println("喝水");
    }

    public void kanjia() {
        System.out.println("看家");
    }
}

class Hukky extends Animals{
    @Override
    public void eat() {
        System.out.println("吃狗粮");
    }

    @Override
    public void drink() {
        super.drink();
    }

    @Override
    public void kanjia() {
        super.kanjia();
    }
    public void chai(){
        System.out.println("拆家");
    }
}
class Shapi extends Animals{
    @Override
    public void eat() {
        System.out.println("吃狗粮、吃骨头");
    }

    @Override
    public void drink() {
        super.drink();
    }

    @Override
    public void kanjia() {
        super.kanjia();
    }
}
class China_Dog extends Animals {
    @Override
    public void eat() {
        System.out.println("吃剩饭");
    }

    @Override
    public void drink() {
        super.drink();
    }

    @Override
    public void kanjia() {
        super.kanjia();
    }
}