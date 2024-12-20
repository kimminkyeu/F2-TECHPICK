package kernel360.techpick.feature.structure.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kernel360.techpick.core.model.folder.StructureJson;
import kernel360.techpick.core.model.user.User;

@Repository
public interface StructureJsonRepository extends JpaRepository<StructureJson, Long> {

	Optional<StructureJson> findByUserId(Long userId);

	boolean existsByUser(User user);
}
