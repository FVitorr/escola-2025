package br.edu.ifmg.Escola.entities;


import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "tb_section")
public class Section {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private String imgUri;

    private Integer possition;

    @ManyToOne
    @JoinColumn(name="resource_id")
    private Resource resource;

    @ManyToOne
    @JoinColumn(name="prerequisite")
    private Section prerequisite;

    @OneToMany(mappedBy = "section")
    private Set<Lesson> lesson = new HashSet<Lesson>();
}
