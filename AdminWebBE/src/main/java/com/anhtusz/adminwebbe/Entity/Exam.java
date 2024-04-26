package com.anhtusz.adminwebbe.Entity;

import lombok.Data;

import java.util.List;
@Data
public class Exam {
    private long id;
    private String name;
    private String description;
    private String type;

    private List<Question> questionList;
}
