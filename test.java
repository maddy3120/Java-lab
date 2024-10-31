import java.util.Scanner;
class Employee
{
    private String name;
    private int age;
    private long num;
    private	String address;
    private	double salary;

    public void setname(String name)
    {
        this.name=name;
    }
    public void setage(int age)
    {
        this.age=age;
    }
    public void setnum(long num)
    {
        this.num=num;
    }
    public void setaddress(String address)
    {
        this.address=address;
    }
    public void setsalary(double salary)
    {
        this.salary=salary;
    }
    public double printsalary()
    {
        return salary;
    }
    public String getname()
    {
    return name;
    }
    public int getage()
    {
        return age;
    }
    public String getaddress()
    {
        return address;
    }
    public long getnum()
    {
    return num;
    }
}



class officer extends Employee
{
    private String specialization;
    private String department;
    public void setspecialization(String specialization)
    {
        this.specialization=specialization;
    }
    public void setdepartment(String department)
    {
        this.department=department;
    }
    public String getdepartment()
    {
        return department;
    }
    public String getspecialization()
    {
        return specialization;
    }
}


class manager extends Employee
{
    private String specialization;
    private String department;
    public void setspecialization(String specialization)
    {
        this.specialization=specialization;
    }
    public void setdepartment(String department)
    {
        this.department=department;
    }
    public String getspecialization()
    {
        return specialization;
    }
}


class test
{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    officer o=new officer();
    System.out.println("Enter the officer's details");
    System.out.println("Name: ");
    o.setname(sc.nextLine());
    System.out.println("Specialization: ");
    o.setspecialization(sc.nextLine());
    System.out.println("Department: ");
    o.setdepartment(sc.nextLine());
    System.out.println("Address: ");
    o.setaddress(sc.nextLine());
    System.out.println("Age: ");
    o.setage(sc.nextInt());
    System.out.println("Phone number: ");
    o.setnum(sc.nextLong());
    System.out.println("Salary: ");
    o.setsalary(sc.nextDouble());
    sc.nextLine();

    System.out.println("The officer's details");
    System.out.println("Name: "+o.getname());
    System.out.println("Age: "+o.getage());
    System.out.println("Number: "+o.getnum());
    System.out.println("Address: "+o.getaddress());
    System.out.println("Salary: "+o.printsalary());
    System.out.println("Specialization: "+o.getspecialization());
    System.out.println("Department: "+o.getdepartment());
}
}






































































