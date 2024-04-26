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
public class Student {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Name;

    @ElementCollection
    private List<String> Exam;
    @ElementCollection
    private List<Float> RighAnswer;
}
