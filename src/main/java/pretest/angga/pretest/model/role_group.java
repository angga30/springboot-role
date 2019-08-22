package pretest.angga.pretest.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "role_group")
@EntityListeners(AuditingEntityListener.class)
public class role_group {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id_grp;
	@Column(name = "name_grp", nullable = false)
	private String name_grp;
	
	@OneToMany(mappedBy = "role_grp")
	private List<role_detail> detail;
	

	@OneToMany(targetEntity = user.class, mappedBy = "id", orphanRemoval = false, fetch = FetchType.LAZY)
	private List<user> user;



	public List<user> getUser() {
		return user;
	}

	public void setUser(List<user> user) {
		this.user = user;
	}

	public long getId_grp() {
		return id_grp;
	}

	public void setId_grp(long id_grp) {
		this.id_grp = id_grp;
	}

	public String getName_grp() {
		return name_grp;
	}

	public void setName_grp(String name_grp) {
		this.name_grp = name_grp;
	}

	public List<role_detail> getDetail() {
		return detail;
	}

	public void setDetail(List<role_detail> detail) {
		this.detail = detail;
	}
	
	
	
}
