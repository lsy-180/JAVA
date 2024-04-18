package jiekou;

public class Test {
    public static void main(String[] args) {
        PingPang pingPang=new PingPang("吴芸娜",18);
        Busktball busktball=new Busktball("杨林江",99);
        LanTeacher lanTeacher=new LanTeacher("刘国梁",99);
        PingTeacher pingTeacher=new PingTeacher("姚明",22);
        pingPang.speakEnglish();
        pingPang.study();
        busktball.study();
        lanTeacher.teach();
        pingTeacher.speakEnglish();
        pingTeacher.teach();
    }
}
