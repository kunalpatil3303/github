class calculate
{
    int a;
    int b;
    int result;
    public void perform()
    {
        result= a*b;
    }
}

public class Hello {
    public static void main(String[] args) {
        calculate obj = new calculate();
        obj.a=10;
        obj.b=10;
        obj.perform();
        System.out.println(obj.result);






    }
}
