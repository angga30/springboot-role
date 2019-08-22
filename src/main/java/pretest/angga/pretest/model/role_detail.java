package pretest.angga.pretest.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "role_detail")
@EntityListeners(AuditingEntityListener.class)
public class role_detail {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id_detail;
	
	public long getId_detail() {
		return id_detail;
	}

	public void setId_detail(long id_detail) {
		this.id_detail = id_detail;
	}

	public String getNameRole() {
		return NameRole;
	}

	public void setNameRole(String nameRole) {
		NameRole = nameRole;
	}

	public role_group getRole_grp() {
		return role_grp;
	}

	public void setRole_grp(role_group role_grp) {
		this.role_grp = role_grp;
	}

	@Column(name="name_role")
	private String NameRole;
	@Column(name="orderd")
	private String orderd;
	
	public String getOrderd() {
		return orderd;
	}

	public void setOrderd(String orderd) {
		this.orderd = orderd;
	}

	@JoinColumn(name = "role_grp", referencedColumnName = "id_grp")
    @ManyToOne
    private role_group role_grp;
	
	

}
