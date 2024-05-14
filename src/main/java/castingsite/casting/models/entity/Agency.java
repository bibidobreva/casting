package castingsite.casting.models.entity;

import jakarta.persistence.*;

import java.util.List;

@Table
@Entity
public class Agency extends BaseEntity{
    @Column(unique = true, nullable = false)
    private String name;

    @Column
    private String description;

    @ManyToMany(fetch = FetchType.EAGER)
    private List<Audition> auditions;
}
