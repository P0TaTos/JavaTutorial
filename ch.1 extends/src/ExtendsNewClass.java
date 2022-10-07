public class ExtendsNewClass extends NewClass{
    public ExtendsNewClass(String getName) {
        super(getName);
    }
    @Override //자바 컴파일러에게 오버라이드를 하고싶다 라고 전달하는 어노테이션
    public void PrintExtends()
    {
        System.out.println("자식 메소드 오버라이드");
    }
}
