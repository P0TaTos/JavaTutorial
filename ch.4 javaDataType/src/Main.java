public class Main {
    public static void main(String[] args) {
        /*
         * 프리미티브 타입과 레퍼런스 타입의 차이점:
         * 메모리 참조 타입인가? 의 차이(C언어 에서의 포인터 개념)
         *
         * 프리미티브는 메모리의 공간에 주소값을 담는게 아닌 데이터를 담음
         */
        //프리미티브

        //수치 타입
        //정수 타입
        //                                  bit
        System.out.println(Byte.SIZE);      //8
        System.out.println(Short.SIZE);     //16
        System.out.println(Integer.SIZE);   //32
        System.out.println(Long.SIZE);      //64
        System.out.println(Character.SIZE); //16
        //Java에선 C언어와 달리 유니코드를 사용하기때문에 16비트로 할당된다.
        //부동 소수점 타입
        System.out.println(Float.SIZE);     //32
        System.out.println(Double.SIZE);    //64
        //불리언 타입은 C와 같이 true, false 만 표현 가능

        //레퍼런스
        NewClass someThing = new NewClass();
        /*
         * 자바에서는 컴파일러가 알아서 할당하기에 주소값을 알수 없다
         * NewClass는 메모리 어딘가에 할당되며
         * someThing은 그 할당된 메모리의 주소값을 가진다
         * someThing을 사용하게되면 해당 주소값을 참조하여 사용하게된다
         * C의 포인터와 같다
         */
        someThing = null;
        /*
         * 사용되던 변수에 null로 초기화를 하게되면
         * 연결리스트의 연결이 끊긴것처럼 할당된 주소값을 잃어버리게된다(가비지가 됨)
         * 하지만 Java의 가비지 컬랙터가 일정 주기마다 or 프로그램 종료시 메모리 릴리즈를 해준다.
         * 상속과 인터페이스도 동일
         */

    }
}