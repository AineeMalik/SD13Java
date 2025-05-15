public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String fn, String ln, int sal)
    {
        this.id = id;
        this.firstName = fn;
        this.lastName = ln;
        this.salary = sal;
    }

    public int getId() {
        return id;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getName()
    {
        return (this.firstName + " " + this.lastName);
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getAnnualSalary()
    {
        return (12 * this.salary);
    }
    public int raiseSalary(int percent)
    {
        double raise = this.salary * ((double)percent/100);
        System.out.println("raise" + raise);
        this.salary =this.salary + (int)raise;
        return this.salary;
    }
    public String toString()
    {
        return ("Id:"+this.id + " Name: " + this.getName() + " Salary: " + this.salary);
    }

}
