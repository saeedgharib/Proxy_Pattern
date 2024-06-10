package ModifiedExample;

import java.util.ArrayList;
import java.util.List;

public class ProxyExam {
    private List<ExamResult> Results = new ArrayList<>();

    public void addResult(ExamResult result) {
        Results.add(result);
    }

    public void displayResults(String userType, String userName) {
        if ("teacher".equalsIgnoreCase(userType)) {
            for (ExamResult result : Results) {
                result.display();
            }
        } else if ("student".equalsIgnoreCase(userType)) {
            for (ExamResult result : Results) {
                if (result.getStudentName().equalsIgnoreCase(userName)) {
                    result.display();
                    break;
                }
            }
        } else {
            System.out.println("Result not found");
        }
    }
}

