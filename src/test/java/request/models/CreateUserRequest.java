package request.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateUserRequest {
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
    
    CreateUserRequest(){}
    
	public CreateUserRequest(String firstName, String lastName, String email, String mobile, String dob, String gender,
			String address, String country, List<String> skills) {
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
    
    public static class Builder{
    		public String firstName;

        @JsonProperty("last_name")
        public String lastName;

        public String email;

        public String mobile;

        public String dob;

        public String gender;

        public String address;

        public String country;

        public List<String> skills;
        
    		public Builder firstName(String firstName) {
    			this.firstName=firstName;
    			return this;
    		}
    		
    		public Builder lastName(String lastName) {
    			this.lastName=lastName;
    			return this;
    		}
    		
    		public Builder email(String email) {
    			this.email=email;
    			return this;
    		}
    		
    		public Builder mobile(String mobile) {
    			this.mobile=mobile;
    			return this;
    		}
    		
    		public Builder dob(String dob) {
    			this.dob=dob;
    			return this;
    		}
    		
    		public Builder gender(String gender) {
    			this.gender=gender;
    			return this;
    		}
    		
    		public Builder address(String address) {
    			this.address=address;
    			return this;
    		}
    		
    		public Builder country(String country) {
    			this.country=country;
    			return this;
    		}
    		
    		public Builder skills(List<String> skills) {
    			this.skills=skills;
    			return this;
    		}
    		
    		public CreateUserRequest build() {
    			return new CreateUserRequest(firstName,lastName,email,mobile,
    					               dob,gender,address,country,skills);
    		}
    }
}
