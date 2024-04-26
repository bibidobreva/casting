package castingsite.casting.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Table
@Entity
public class Audition extends BaseEntity{
    @Column(unique = true, nullable = false)
    private String name;

    @Column( nullable = false)
    private String description;
}
