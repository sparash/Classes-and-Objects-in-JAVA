import java.util.Scanner;
class complex
{
    public static void main(String[] args)
    {
    private double real, imag;

    public void setVals(double r, double i)
    {
        real = r;
        imag = i;
    }

    public void display()
    {
        System.out.println("The complex number : " + real + " + i" + imag);
    }
    }
}

class q2
{

    {
        Complex obj = new Complex();
        obj.setVals(5.0,2.9);
        obj.display();
    }
}