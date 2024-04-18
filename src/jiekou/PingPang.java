package jiekou;

public class PingPang extends Yundongyuan implements English{
    public PingPang() {
    }

    public PingPang(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("学打乒乓球");
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球运动员会说英语");
    }
}
