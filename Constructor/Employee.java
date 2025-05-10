public class Employee {

    int emp_id;
    String name;
    Employee(int emp_id,String name)
    {
        this.emp_id=emp_id;
        this.name=name;
    }
    public static void main(String[] args) 
    {
        Employee emp=new Employee(101, "Anurag");
        Employee emp2=new Employee(102, "Vivek");
        System.out.println("Employee 1 :- \nEmp_Id : "+emp.emp_id+" Emp_Name : "+emp.name);
        System.out.println("Employee 2 :- \nEmp_Id : "+emp2.emp_id+" Emp_Name : "+emp2.name);
    }
    
}
