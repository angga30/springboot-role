package pretest.angga.pretest.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pretest.angga.pretest.dto.dtoemp;
import pretest.angga.pretest.model.user;

@Repository
public  interface userRepo extends CrudRepository<user, Long> {
	@Query("SELECT new pretest.angga.pretest.dto.dtoemp(f.orderd,f.NameRole) "
			+ "FROM user d LEFT JOIN d.role_id e LEFT JOIN e.detail f where d.id = ?1")
	List<dtoemp> fetchEmpDeptDataLeftJoin(long id);
	    
}
