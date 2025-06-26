package br.edu.ifmg.Escola.entities.pk;

import br.edu.ifmg.Escola.entities.Offer;
import br.edu.ifmg.Escola.entities.User;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Embeddable
public class EnrollmentPk {

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name="offer_id")
    private Offer offer;
}
