class overload
{
public void area(double r)
{
System.out.println("Area of Circle: "+(3.14*r*r));
}

public void area(int l,int w)
{
System.out.println("Area of Reactangle: "+(l*w));
}

public void area(double b,double h)
{
System.out.println("Area of Triangle: "+(0.5*b*h));
}
}

class testarea
{
public static void main(String args[])
{
overload o=new overload();
o.area(10);
o.area(2,4);
o.area(20.5,1.1);
}}
