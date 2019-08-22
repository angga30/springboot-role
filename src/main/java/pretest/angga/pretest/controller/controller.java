package pretest.angga.pretest.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pretest.angga.pretest.dto.dtoemp;
import pretest.angga.pretest.repo.userRepo;

@RestController
@RequestMapping("/api/v1")
public class controller {

	@Autowired
	  private userRepo userRepository;
	  @GetMapping("/users/{id}")
	  public Map<String, List<dtoemp>> getAllUsers(@PathVariable Long id) {
		  Map<String, List<dtoemp>> map = new HashMap<String, List<dtoemp>>();
		  map.put("modules",userRepository.fetchEmpDeptDataLeftJoin(id));
	    return  map;

	  }
}
