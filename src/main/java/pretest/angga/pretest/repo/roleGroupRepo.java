package pretest.angga.pretest.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pretest.angga.pretest.model.role_group;

@Repository
public interface roleGroupRepo extends JpaRepository<role_group, Long> {}
