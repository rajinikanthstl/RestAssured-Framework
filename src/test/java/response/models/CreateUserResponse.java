package response.models;

public class CreateUserResponse {
	
	private String message;

    private Boolean status;

    private User user;
    
    CreateUserResponse(){}

	public CreateUserResponse(String message, Boolean status, User user) {
		super();
		this.message = message;
		this.status = status;
		this.user = user;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "CreateUserResponse [message=" + message + ", status=" + status + ", user=" + user + "]";
	}
}
