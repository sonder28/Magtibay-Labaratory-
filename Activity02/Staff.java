package Activity02;

public class Staff extends Person{
    private String department;
    public Staff(String name,int id, String department){
        super(name,id);
        this.department = department;
    }
    public String getDepartment() {
        return department;
    }
    public void displayinfo(){
        super.displayinfo();
        System.out.println("Department: " + department);
    }
}
