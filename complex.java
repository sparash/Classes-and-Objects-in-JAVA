import java.util.Scanner;
class complex
{
    int real;
    int imaginary;
    complex()
    {
        this.real=2;
        this.imaginary=5;
    }
    int Display()
    {
        System.out.println("The complex number is :");
        System.out.println(real+"+"+imaginary+"i");
        return 0;
    }

}
class Displaycomplex
{
    public static void main(String[] args)
    {
        complex a=new complex();
        a.Display();
    }
}