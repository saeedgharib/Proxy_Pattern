package ModifiedExample;

public class VirtualProxyExam implements Exam {
    private RealExam realExam;
    private String examContent;

    public VirtualProxyExam(String examContent){
        this.examContent = examContent;
    }

    @Override
    public void display() {
        if (realExam == null) {
            realExam = new RealExam(examContent);
        }
        realExam.display();
    }
}
