package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Service implements QuestionImpl{
    ArrayList <Questions> questions = new ArrayList<>();


    public Service() {
        questions.add(new Questions("What is inheritance in Java?", new String[]{"A. A way to create new classes", "B. A way to create new methods", "C. A way to create new variables", "D. None of the above"}, "A"));
        questions.add(new Questions("What is polymorphism in Java?", new String[]{"A. The ability of a variable, function or object to take on multiple forms", "B. The ability to inherit methods from a superclass", "C. The ability to encapsulate data", "D. None of the above"}, "A"));
        questions.add(new Questions("What is encapsulation in Java?", new String[]{"A. The wrapping up of data and methods into a single unit", "B. The ability to inherit methods from a superclass", "C. The ability to create new classes", "D. None of the above"}, "A"));
        questions.add(new Questions("What is abstraction in Java?", new String[]{"A. The process of hiding the implementation details and showing only functionality", "B. The ability to inherit methods from a superclass", "C. The ability to create new classes", "D. None of the above"}, "A"));
        questions.add(new Questions("What is an interface in Java?", new String[]{"A. A reference type in Java, it is similar to class, it is a collection of abstract methods", "B. A class that cannot be instantiated", "C. A class that inherits from another class", "D. None of the above"}, "A"));
    }

    @Override
   public void startQuiz() {
    displayQuestions();
    getUserInput();
    calculateScore();
}

    @Override
    public void displayQuestions() {
        for (Questions question : questions) {
            System.out.println(question);
        }
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
        int score = 0;
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
                score++;
            }
        }
        System.out.println("Your total score is: " + score + "/" + questions.size());
    }
}
