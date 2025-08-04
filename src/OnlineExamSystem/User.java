package OnlineExamSystem;

import java.util.Scanner;

public class User {
    private String name;
    private int score;

    public User(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void takeExam(Exam e) {
        Scanner scanner = new Scanner(System.in);
        int totalScore = 0;

        for (Question q : e.getQuestions()) {
            System.out.println("Question: " + q.getQuestionText());
            System.out.print("Your answer: ");
            String answer = scanner.nextLine();

            if (q.checkAnswer(answer)) {
                totalScore++;
            }
        }

        this.score = totalScore;
        System.out.println("Exam finished. Your score: " + score);
    }
}
