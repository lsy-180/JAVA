package jicheng;

public class AnimalTest {
    public static void main(String[] args) {
        BuOuMao buoumao = new BuOuMao();
        buoumao.drink();
        buoumao.eat();
        buoumao.zhua();
        ZhongGuoLiHuaMao zhongguolihuamao = new ZhongGuoLiHuaMao();
        zhongguolihuamao.drink();
        zhongguolihuamao.eat();
        zhongguolihuamao.zhua();
        HaShiQi haShiQi = new HaShiQi();
        haShiQi.kan();
        haShiQi.eat();
        haShiQi.drink();
        haShiQi.kan();
        TaiDi taiDi = new TaiDi();
        taiDi.eat();
        taiDi.drink();
        taiDi.kan();
        taiDi.ceng();
    }
}
