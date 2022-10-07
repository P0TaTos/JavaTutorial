public class ExtendsNewClass extends NewClass{
    public ExtendsNewClass(String getName) {
        super(getName);
    }

    public void PrintExtends()
    {
        System.out.println("자식 메소드 오버라이드");
    }
}
