package response.models;

import com.fasterxml.jackson.annotation.JsonProperty;


public class ParkResponse {
    @JsonProperty("reservation_id")
    private String reservationId;

    private Integer cost;

    private String currency;

    private Integer years;

    private Integer days;

    private Integer hours;

    private Integer minutes;
    
    ParkResponse(){}
    
    public ParkResponse(String reservationId, Integer cost, String currency, Integer years, Integer days, Integer hours,
			Integer minutes) {
		super();
		this.reservationId = reservationId;
		this.cost = cost;
		this.currency = currency;
		this.years = years;
		this.days = days;
		this.hours = hours;
		this.minutes = minutes;
	}

	public String getReservationId() {
		return reservationId;
	}

	public void setReservationId(String reservationId) {
		this.reservationId = reservationId;
	}

	public Integer getCost() {
		return cost;
	}

	public void setCost(Integer cost) {
		this.cost = cost;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Integer getYears() {
		return years;
	}

	public void setYears(Integer years) {
		this.years = years;
	}

	public Integer getDays() {
		return days;
	}

	public void setDays(Integer days) {
		this.days = days;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public Integer getMinutes() {
		return minutes;
	}

	public void setMinutes(Integer minutes) {
		this.minutes = minutes;
	}

	@Override
	public String toString() {
		return "response [reservationId=" + reservationId + ", cost=" + cost + ", currency=" + currency + ", years="
				+ years + ", days=" + days + ", hours=" + hours + ", minutes=" + minutes + "]";
	}
}