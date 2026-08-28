package request.models;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class ParkRequest {
	@JsonProperty
    private String parkType;
	@JsonProperty
    private String entryDate;
	@JsonProperty
	private String exitDate;
	
	ParkRequest(){}

	public ParkRequest(String parkType, String entryDate, String exitDate) {
		super();
		this.parkType = parkType;
		this.entryDate = entryDate;
		this.exitDate = exitDate;
	}
	
	public static class Builder{
		private String parkType;
	    private String entryDate;
		private String exitDate;
		
		public Builder parkType(String ptype) {
			this.parkType=ptype;
			return this;
		}
		
		public Builder entryDate(String entryDate) {
			this.entryDate=entryDate;
			return this;
		}
		
		public Builder exitDate(String exitDate) {
			this.exitDate=exitDate;
			return this;
		}
		
		public ParkRequest build() {
			ParkRequest req = new ParkRequest(parkType,entryDate,exitDate);
			return req;
		}
	}

	public String getParkType() {
		return parkType;
	}

	public void setParkType(String parkType) {
		this.parkType = parkType;
	}

	public String getEntryDate() {
		return entryDate;
	}

	public void setEntryDate(String entryDate) {
		this.entryDate = entryDate;
	}

	public String getExitDate() {
		return exitDate;
	}

	public void setExitDate(String exitDate) {
		this.exitDate = exitDate;
	}

	@Override
	public String toString() {
		return "request [parkType=" + parkType + ", entryDate=" + entryDate + ", exitDate=" + exitDate + "]";
	}
}