package OnlineExamSystem;

import java.util.ArrayList;
import java.util.List;

public class Exam {
    private List<Question> questions;

    public Exam() {
        this.questions = new ArrayList<>();
    }

    public void addQuestion(Question q) {
        questions.add(q);
    }

    public void showQuestions() {
        for (Question q : questions) {
            System.out.println("Question: " + q.getQuestionText());
        }
    }

    public Question[] getQuestions() {
    }
}
