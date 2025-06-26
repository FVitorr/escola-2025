package br.edu.ifmg.Escola.entities;


import br.edu.ifmg.Escola.entities.pk.EnrollmentPk;
import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name="tb_enrollment")
public class Enrollment {
    @EmbeddedId
    private EnrollmentPk id = new EnrollmentPk();

    private Instant enrollMoment;
    private Instant refundMoment;
    private boolean available;
    private boolean onlyUpdate;

    @ManyToMany(mappedBy = "enrollmentsDone")
    private Set<Lesson> lessonDone = new HashSet<Lesson>();
}
