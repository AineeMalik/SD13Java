public class Circle{
    //variables
    private double radius = 1.0;
    private String color = "red";
//Constructors
    //constructors are method like constructs that have same name as that of a 
    //class and no return type
    //not even void
    //2. no argument constructor 
    public Circle(){
        this.radius = 1.0;
        this.color = "red";
    }
    //3. Parameterised constructor
    public Circle(double r)
    {
        this.radius = r;
    }
    public Circle (double r, String c) {

        this.radius = r;
        this.color = c;
        
        }
        //Methods
  //getter & Setter methods

  public double getRadius()
    {
        return this.radius;
    }
    public String getColor()
    {
        return this.color;
    }
    public void setRadius(double r)
    {
        this.radius = r;
    }
    public void setColor(String c)
    {
        this.color = c;
    }

    public double getArea()
    {
        return (Math.PI * this.radius * this.radius);

    }
    //method that returns the current state of an object in string form
    public String toString()
    {
    return ("radius = "+ this.radius + " and colour = " + this.color) ;
    }


}