import java.util.Scanner;
class Test
{
    String child;
    static String mother;
    static
    {
        mother="Jean";
    }
}
class Demo_Static_Block
{
    public static void main(String[] args)
    {
        Test son=new Test();
        son.child="Lucifer";
        Test daughter=new Test();
        daughter.child="Linda";
        System.out.println(son.child+" is the son of "+son.mother);
        System.out.println(daughter.child+" is the daughter of "+daughter.mother);
    }
}