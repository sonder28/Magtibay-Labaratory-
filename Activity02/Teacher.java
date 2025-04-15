package Activity02;

public class Teacher extends Person{
    private String subject;
    public Teacher(String name,int id, String subject){
        super(name,id);
        this.subject = subject;
    }
    public String getSubject() {
        return subject;
    }
    @Override
    public void displayinfo(){
        super.displayinfo();
        System.out.println("Subject: " + subject);
   }
}