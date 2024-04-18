package jiekou;

public abstract class JiaoLian extends Peop{
    public JiaoLian() {
    }

    public JiaoLian(String name, int age) {
        super(name, age);
    }
    public abstract void teach();
}
