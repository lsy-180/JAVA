package jiekou;

public class Busktball extends Yundongyuan {
    public Busktball(String name, int age) {
        super(name, age);
    }

    public Busktball() {
    }

    @Override
    public void study() {
        System.out.println("学打篮球");
    }
}
