package DuotaiStudy;

public class Persons {
    public String name;
    public  int  age;
    public void keepPet(Animal animal, String something) {
        if (animal instanceof Dog) {
            System.out.println("年龄为" + age + "岁的" + name + "养了一只" + animal.getColor() + "的" + animal.getAge() + "岁的" + "吴芸娜");
            animal.eat(something);
        } else if (animal instanceof Cat) {
            System.out.println("年龄为" + age + "岁的" + name + "养了一只" + animal.getColor() + "的" + animal.getAge() + "岁的" + "猫");
            animal.eat(something);

        }

    }

    public Persons() {
    }

    public Persons(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Person{name = " + name + ", age = " + age + "}";
    }
}
