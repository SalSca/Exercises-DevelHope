package co.develhope.hybernate.entities;

import javax.persistence.*;

@Entity
@Table(name="enrollments")
public class Enrollment{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_class")
    private SchoolClass schoolClass;

    @ManyToOne
    @JoinColumn(name = "id_student")
    private Student student;


}