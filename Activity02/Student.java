package Activity02;

public class Student extends Person{
    private String gradeLevel;
    public Student(String name, int id, String gradeLevel) {
        super(name, id);
        this.gradeLevel = gradeLevel;
    }
    public String getGradeLevel() {
        return gradeLevel;
    }
    @Override
    public void displayinfo(){
        super.displayinfo();
        System.out.println("Grade Level: " + gradeLevel);
    }
}
