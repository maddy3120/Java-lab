abstract class shape
{
public abstract void numofsides();
}

class rectangle extends shape
{
public void numofsides()
{
System.out.println("Number of sides of rectangle = 4");
}}

class triangle extends shape
{
public void numofsides()
{
System.out.println("Number of sides of triangle = 3");
}}

class hexagon extends shape
{
public void numofsides()
{
System.out.println("Number of sides of Hexagon = 6");
}}

class testshape
{
public static void main(String args[])
{
rectangle r=new rectangle();
triangle t=new triangle();
hexagon h=new hexagon();
r.numofsides();
t.numofsides();
h.numofsides();
}}











