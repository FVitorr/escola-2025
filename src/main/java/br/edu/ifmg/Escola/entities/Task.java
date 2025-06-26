package br.edu.ifmg.Escola.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.time.Instant;

@Data
@NoArgsConstructor
@Entity
@Table(name = "td_task")
public class Task extends Lesson{
    private String description;
    private Integer questionCount;
    private  Integer approvalCount;
    private  Double weight;
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant dueData;
}
