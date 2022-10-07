public class Main {
    public static void main(String[] args) {
        NewClass newClass = new NewClass("부모");
        ExtendsNewClass extendNewClass = new ExtendsNewClass("자식");

        newClass.PrintName();
        extendNewClass.PrintName();

        newClass.PrintExtends();
        extendNewClass.PrintExtends();
    }
}