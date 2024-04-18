package jicheng;

public class Test {
    public static void main(String[] args) {
        Zi zi=new Zi();
        zi.setName();
    }
}
class Fu{
    String name="fu";

}
class Zi extends Fu{
    String name="zi";
    public void setName(){
        String name="好大学";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
}
