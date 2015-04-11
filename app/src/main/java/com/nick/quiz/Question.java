package com.nick.quiz;

class Question {
    public int currentQuestion;

    private boolean answer;

    Question(int currentIndex, boolean answer) {
        this.currentQuestion = currentIndex;
        this.answer = answer;
    }

    public int getCurrentQuestion() {
        return currentQuestion;
    }

    public void setCurrentQuestion(int currentQuestion) {
        this.currentQuestion = currentQuestion;
    }

    public boolean isAnswer() {
        return answer;
    }

    public void setAnswer(boolean answer) {
        this.answer = answer;
    }
}