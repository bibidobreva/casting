package castingsite.casting.repository;

import castingsite.casting.models.entity.Audition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuditionRepository extends JpaRepository<Audition, Long> {
}
