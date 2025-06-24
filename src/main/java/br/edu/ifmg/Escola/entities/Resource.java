package br.edu.ifmg.Escola.entities;

import br.edu.ifmg.Escola.constants.ResourceType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "tb_course")
public class Resource {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;
    private String title;
    private String description;
    private Integer position;
    private String imgUri;

    @Enumerated(EnumType.STRING)
    private ResourceType resourceType;

    @OneToMany(mappedBy = "course")
    private List<Offer> offers = new ArrayList<>();
}
