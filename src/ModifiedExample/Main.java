package ModifiedExample;

import ModifiedExample.ProxyExam;
import ModifiedExample.VirtualProxyExam;

public class Main {
    public static void main(String[] args) {
        Exam exam = new VirtualProxyExam("MDCAT Exam");


        exam.display();
        System.out.println("");


        exam.display();


        ProxyExam proxyResults = new ProxyExam();
        proxyResults.addResult(new ExamResult("Muhammad Saeed", "Answer1"));
        proxyResults.addResult(new ExamResult("Malik Haris", "Answer2"));

        System.out.println("\nSaeed viewing results:");
        proxyResults.displayResults("student", "Muhammad Saeed");

        System.out.println("\nTeacher viewing results:");
        proxyResults.displayResults("teacher", "Mam");
    }
}

