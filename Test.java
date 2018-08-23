import java.util.Scanner;
class Test
{
    static int i;
    int j;
    static
    {
        i = 10;
        System.out.println("Static block called ");
    }
}

class Main
{
    public static void main(String args[])
    {
        System.out.println(Test.i);
    }
}