package neibu;

public class Outer {
    private int a=10;
    static class Inner {
        private int a=20;
        public void show() {
            int a=30;
            Outer outer=new Outer();
            System.out.println(outer.a);
            // 获取外部类的成员变量
//            System.out.println(Outer.this.a);
            System.out.println(this.a);
            System.out.println(a);
        }
        public static void show2(){
            System.out.println("静态方法被调用了");
        }
    }

    public Inner getI() {
        return new Inner();
    }
}
