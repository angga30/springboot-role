package pretest.angga.pretest.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pretest.angga.pretest.model.role_detail;

@Repository
public interface roleDetailRepo extends JpaRepository<role_detail, Long> {}
