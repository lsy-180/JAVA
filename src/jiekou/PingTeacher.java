package jiekou;

public class PingTeacher extends JiaoLian implements English{
    public PingTeacher() {
    }

    public PingTeacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach(){
        System.out.println("教乒乓球");
    }
    @Override
    public void speakEnglish() {
        System.out.println("乒乓球教练会说英语");
    }
}
