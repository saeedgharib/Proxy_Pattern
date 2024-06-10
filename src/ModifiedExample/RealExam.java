package ModifiedExample;

public class RealExam implements Exam {
    private String examContent;

    public RealExam(String examContent){
        this.examContent = examContent;
        loadExam(examContent);
    }

    @Override
    public void display() {
        System.out.println("Displaying Exam: " + examContent);
    }

    private void loadExam(String examContent){
        System.out.println("Loading Exam: " + examContent);
    }
}
