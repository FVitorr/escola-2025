package br.edu.ifmg.Escola.entities;


import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "tb_lesson")
@Entity
public abstract class Lesson {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private Integer position;

    @ManyToOne
    @JoinColumn(name="section_id")
    private Section section;

    @ManyToOne
    @JoinColumn(name="prerequisite")
    private Lesson prerequisite;



    @ManyToOne
    @JoinTable(joinColumns= @JoinColumn(name="lesson_id"),
    inverseJoinColumns = {
            @JoinColumn(name="user_id"),
            @JoinColumn(name = "offer_id")
    })
    private Set<Enrollment> enrollmentsDone = new HashSet<>();
}
