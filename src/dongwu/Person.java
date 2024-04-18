package dongwu;

public class Person {
    String name;
    int age;

    public Person() {
        // 设置默认值
        this("lsy",15);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
