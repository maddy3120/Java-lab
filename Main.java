import java.util.Scanner;
class Employee
{
public void display()
{
System.out.println("Name of class is Employee");
}
public void calcSalary()
{
System.out.println("Salary of the Employee is 1000");
}}
class Engineer extends Employee{
public void calcSalary(){
System.out.println("Salary of the Engineer is 20000");
}}
class Main
{
public static void main(String args[])
{
Engineer e=new Engineer();
e.calcSalary();
e.display();
}}

