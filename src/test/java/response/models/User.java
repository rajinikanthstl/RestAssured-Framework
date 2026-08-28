package response.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("last_name")
    private String lastName;

    private String email;

    private String mobile;

    private String dob;

    private String gender;

    private String address;

    private String country;

    private List<String> skills;

    @JsonProperty("updated_at")
    private String updatedAt;

    @JsonProperty("created_at")
    private String createdAt;

    private Integer id;
    
    User(){}

	public User(String firstName, String lastName, String email, String mobile, String dob, String gender,
			String address, String country, List<String> skills, String updatedAt, String createdAt, Integer id) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobile = mobile;
		this.dob = dob;
		this.gender = gender;
		this.address = address;
		this.country = country;
		this.skills = skills;
		this.updatedAt = updatedAt;
		this.createdAt = createdAt;
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public List<String> getSkills() {
		return skills;
	}

	public void setSkills(List<String> skills) {
		this.skills = skills;
	}

	public String getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", mobile=" + mobile
				+ ", dob=" + dob + ", gender=" + gender + ", address=" + address + ", country=" + country + ", skills="
				+ skills + ", updatedAt=" + updatedAt + ", createdAt=" + createdAt + ", id=" + id + "]";
	}
    
    
}