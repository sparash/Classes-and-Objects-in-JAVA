import java.util.Scanner;
class rectar
{
    public static void main(String arg[])
    {
        rectangle rect = new rectangle(10, 5);

        System.out.println("Length = " + rect.length);
        System.out.println("Breadth = " + rect.breadth);
        System.out.println("Area = " + rect.getArea());
        System.out.println("Perimeter = " + rect.getPerimeter());

    }
}

class rectangle
{
    double length;
    double breadth;

    rectangle(double length, double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    double getArea()
    {
        return length * breadth;
    }

    double getPerimeter()
    {
        return 2 * (length + breadth);
    }
}