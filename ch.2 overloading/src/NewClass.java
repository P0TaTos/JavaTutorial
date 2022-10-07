public class NewClass {
    public void overloadMethod()
    {
        System.out.println("오버로딩 nothing");
    }
    public void overloadMethod(String string)
    {
        System.out.println("오버로딩 string :"+string);
    }
    public void overloadMethod(int integer)
    {
        System.out.println("오버로딩 integer : "+integer);
    }
    public void overloadMethod(String string,int integer)
    {
        System.out.println("오버로딩 string :"+string+"\tinteger : "+integer);
    }
}
