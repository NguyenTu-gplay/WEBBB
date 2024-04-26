package com.anhtusz.adminwebbe.Repository;

import com.anhtusz.adminwebbe.Entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Long>{
    @Query("SELECT DISTINCT q.subject FROM Question q")
    List<String> findDistinctSubject();

}
