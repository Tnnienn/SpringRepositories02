package co.develhope.springrepositories2.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Year;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProgrammingLanguage {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(nullable = false)
    private String name;
    private Year firstAppearance;
    @Column(nullable = false)
    private String inventor;
}