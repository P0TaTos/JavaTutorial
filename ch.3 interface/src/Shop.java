public class Shop implements Buy,Sell {
    /*
     * 자바에서는 클래스 다중상속이 불가능하기때문에
     * 인터페이스라는것을 이용하여 메소드의 몸통만 정의하고
     * 인터페이스를 클래스에 상속하여 다중상속을 구현한다
     *
     * 모든 멤버변수는 public static final 이어야하며, 이를 생략할 수 있다.
     * 모든 메서드는 public abstract 이어야하며, 이를 생략할 수 있다.
     */
    public void buy()
    {
        Buy.super.order();
    }
    public void sell()
    {
        Sell.super.order();
    }
    public void order(){}

}
