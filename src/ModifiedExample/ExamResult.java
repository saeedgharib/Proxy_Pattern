package ModifiedExample;

public class ExamResult {
    String studentName;
    String answers;

    public ExamResult(String studentName, String answers) {
        this.studentName = studentName;
        this.answers = answers;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getAnswers() {
        return answers;
    }

    public void display() {
        System.out.println("Student: " + studentName + ",\n Answers: " + answers);
    }
}

