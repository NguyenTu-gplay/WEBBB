package com.anhtusz.adminwebbe.Service;

import com.anhtusz.adminwebbe.Entity.Question;
import com.anhtusz.adminwebbe.Repository.QuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class QuestionService {
    private final QuestionRepository questionRepository;



    public Question createQuestion(Question question)
    {
        return  questionRepository.save(question);
    }

    public List<Question> getAllQuestion()
    {
        return questionRepository.findAll();
    }

    public List<String> getAllSubject()
    {
        return questionRepository.findDistinctSubject();
    }
    public Optional<Question> getQuestionById(Long id) {
        return questionRepository.findById(id);
    }
    public Question updateQuestion(Long id, Question question) throws ChangeSetPersister.NotFoundException {
        Optional<Question> quess = this.getQuestionById(id);
        if(!quess.isEmpty())
        {
            Question Updatedques = quess.get();
            Updatedques.setContent(question.getContent());
            Updatedques.setChoices(question.getChoices());
            Updatedques.setRighAnswer(question.getRighAnswer());
            return questionRepository.save(Updatedques);
        }
        else {
            throw new ChangeSetPersister.NotFoundException();
        }
    }
    public void delQues(Long id)
    {
        questionRepository.deleteById(id);
    }

}
