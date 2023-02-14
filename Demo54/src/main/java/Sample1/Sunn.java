package Sample1;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Sunn {
	@Id
	private int Id;
	private String name;
	private String city;
	private long Ph_No;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getPh_No() {
		return Ph_No;
	}
	public void setPh_No(long ph_No) {
		Ph_No = ph_No;
	}
	@Override
	public String toString() {
		return "Sunn [Id=" + Id + ", name=" + name + ", city=" + city + ", Ph_No=" + Ph_No + "]";
	}
	
	

}
