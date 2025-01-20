package org.example;

import java.util.Arrays;

public class Questions {
    private String questions;
    private String[] options;
    private String answer;

    public Questions(String questions, String[] options, String answer) {
        this.questions = questions;
        this.options = options;
        this.answer = answer;
    }

    public String getQuestions() {
        return questions;
    }

    public void setQuestions(String questions) {
        this.questions = questions;
    }

    public String[] getOptions() {
        return options;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Questions{" +
                "questions='" + questions + '\'' +
                ", options=" + Arrays.toString(options) +
                ", answer='" + answer + '\'' +
                '}';
    }
}
