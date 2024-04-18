package jiekou;


/*
* JDK8以后接口中新增的方法
允许在接口中定义默认方法，需要使用关键字default修饰作用:解决接口升级的问题
接口中默认方法的定义格式:
格式: public default返回值类型方法名(参数列表){}
* 范例: public default void show(){ }
接口中默认方法的注意事项:
默认方法不是抽象方法，所以不强制被重写。但是如果被重写，重写的时候去掉default关键字public可以省略
* default不能省略
如果实现了多个接口，多个接口中存在相同名字的默认方法，子类就必须对该方法进行重写
允许在接口中定义定义静态方法，需要用static修饰
接口中静态方法的定义格式:
格式: public static返回值类型方法名(参数列表){ }范例: public static void show(){ }
接口中静态方法的注意事项:
静态方法只能通过接口名调用，不能通过实现类名或者对象名调用public可以省略, static不能省略

* */
public interface English {
    public static int sw() {
        return 0;
    }
    void speakEnglish();
    static void show(){

    }
}
