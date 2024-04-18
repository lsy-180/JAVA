package DuotaiStudy;


public class Test {
    public static void main(String[] args) {
        Persons person_one = new Persons("刘苏漾", 30);
        Persons person_two = new Persons("老李", 25);
        Animal dog = new Dog();
        Animal cat = new Cat();
        dog.setAge(2);
        dog.setColor("黑色");
        cat.setColor("灰色");
        cat.setAge(3);
        person_one.keepPet(dog, "骨头");
        person_two.keepPet(cat, "鱼");
        final int a=0;
        String nmae="sdsds";

    }
}
