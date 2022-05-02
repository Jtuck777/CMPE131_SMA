package SMA.QuizApp.model;

import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class QuestionForm {
    private List<Question> questions;

    public List<Question> getQuestions() {
        return questions;
    }

    public void Add(Question Q){this.questions.add(Q);
    }
    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
}
