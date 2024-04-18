package chouxiang;

public class Test {
    public static void main(String[] args) {
        Frog f=new Frog("小绿",1);
        System.out.println(f.getName()+" "+f.getAge());
        f.drink();
        f.eat();
        f.swim();
        Rabbit rabbit=new Rabbit("小白",2);
        rabbit.eat();
        System.out.println(Swim.a);
        InterImpl inter=new InterImpl();
        inter.method();
    }


}
