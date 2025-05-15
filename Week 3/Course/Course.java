public class Course {
    private String courseName;
    private Instructor instructor;
    private TextBook textbook;

    public Course(String name, Instructor instr,TextBook text)
    {
        this.courseName = name;
        this.instructor = instr;
        this.textbook = text;
    }
    public String getCourseName() {
        return courseName;
    }
    public Instructor getInstructor() {
        return instructor;
    }
    public TextBook getTextbook() {
        return textbook;
    }
    public String toString()
    {
        return(this.courseName+" Taught by: " + this.instructor + ", TextBook: " + this.textbook);
    }
    
}
