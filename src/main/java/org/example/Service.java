package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Service implements QuestionImpl{
    ArrayList <Questions> questions = new ArrayList<>();


    public Service() {
    }

    @Override
    public void startQuiz() {

    }

    @Override
    public void displayQuestions() {

    }

    @Override
    public void getUserInput() {
        Scanner scanner = new Scanner(System.in);
        for (Questions question : questions) {
            System.out.println(question.getQuestions());
            String[] options = question.getOptions();
            for (int i = 0; i < options.length; i++) {
                System.out.println((i + 1) + ": " + options[i]);
            }
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();
            if (userAnswer.equalsIgnoreCase(question.getAnswer())) {
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect!");
            }
        }
        scanner.close();
    }

    @Override
    public void calculateScore() {

    }
}
