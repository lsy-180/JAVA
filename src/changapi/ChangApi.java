package changapi;

public class ChangApi {
    public static void main(String[] args) {
        /*
        * public staticRuntime getRuntime()
        当前系统的运行环境对象
        public void exit(int status)
        停止虚拟机
        public int availableProcessors()
        获得cPu的线程数
        public long maxMemory()
        JVM能从系统中获取总内存大小（单位byte)
        public long totalMemory( )
        VM已经从系统中获取总内存大小(单位byte)
        public long freeMemory()
        JVM剩余内存大小(单位byte)
        public Process exec( string command)
        运行cmd命令
    */
        // 停止虚拟机运行
//        Runtime.getRuntime().exit(0);
        // 获取CPU的线程数
        System.out.println(Runtime.getRuntime().availableProcessors());
        // 总内存大小
        System.out.println(Runtime.getRuntime().maxMemory()/1024/1024);
        // 已经获取的总内存大小
        System.out.println(Runtime.getRuntime().totalMemory()/1024/1024);
        // 剩余内存大小
        System.out.println(Runtime.getRuntime().freeMemory()/1024/1024);

    }
}
