/**
 * 
 */
package lt.itakademija.database.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

/**
 * @author CodeCamp
 * 2017
 */
@Entity
@Table(name = "District_Representatives")
public class District_Representatives {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "district_id")
	private Integer district_id;
	
	@Column(name = "name")
	@NotNull
	@Length(min = 1, max = 30)
	private String name;
	
	@Column(name = "last_name")
	@NotNull
	@Length(min = 1, max = 30)
	private String last_name;
	
	public District_Representatives(Integer id, Integer district_id, String name, String last_name) {
		this.id = id;
		this.district_id = district_id;
		this.name = name;
		this.last_name = last_name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getDistrict_id() {
		return district_id;
	}

	public void setDistrict_id(Integer district_id) {
		this.district_id = district_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
		
}
