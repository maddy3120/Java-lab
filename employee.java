class employee
{
 public void display()
 {
  System.out.println("Name of class is employee");
  }
  public void calcsalary()
  {
    System.out.println("Salary of employee is 10000");
    }}
    class Engineer extends Employee{
      public void calcsaslary()
      {
        System.out.println("salary of engineer is 20000");
        }
        }
        class Main{
        public static void main(String args[])
        {
        Engineer e =new Engineer();
        e.calcsalary();
        e.display();                                                                                
        }
        }
       
