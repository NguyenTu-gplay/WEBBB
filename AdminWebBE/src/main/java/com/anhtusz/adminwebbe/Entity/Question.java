package com.anhtusz.adminwebbe.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
@Entity
@Getter
@Setter
public class Question {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Content;

    private String subject;
    @ElementCollection
    private List<String> choices;
    @ElementCollection
    private List<String> RighAnswer;
}
