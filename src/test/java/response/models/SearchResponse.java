package response.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;


class Links {
	@JsonProperty("url")
    private Object url;
	
	@JsonProperty("label")
    private String label;
	
	@JsonProperty("active")
    private Boolean active;
}

public class SearchResponse {
    @JsonProperty("current_page")
    private int currentPage;
    private List<UserData> data;
    @JsonProperty("first_page_url")
    private String firstPageUrl;
    private int from;
    @JsonProperty("last_page")
    private int lastPage;
    @JsonProperty("last_page_url")
    private String lastPageUrl;
    private List<Links> links;
    @JsonProperty("next_page_url")
    private String nextPageUrl;
    private String path;
    @JsonProperty("per_page")
    private int perPage;
    @JsonProperty("prev_page_url")
    private String prevPageUrl;
    private int to;
    private int total;

    // Getters and Setters
    public int getCurrentPage() { return currentPage; }
    public void setCurrentPage(int currentPage) { this.currentPage = currentPage; }

    public List<UserData> getData() { return data; }
    public void setData(List<UserData> data) { this.data = data; }

    public String getFirstPageUrl() { return firstPageUrl; }
    public void setFirstPageUrl(String firstPageUrl) { this.firstPageUrl = firstPageUrl; }

    public int getFrom() { return from; }
    public void setFrom(int from) { this.from = from; }

    public int getLastPage() { return lastPage; }
    public void setLastPage(int lastPage) { this.lastPage = lastPage; }

    public String getLastPageUrl() { return lastPageUrl; }
    public void setLastPageUrl(String lastPageUrl) { this.lastPageUrl = lastPageUrl; }

    public List<Links> getLinks() { return links; }
    public void setLinks(List<Links> links) { this.links = links; }

    public String getNextPageUrl() { return nextPageUrl; }
    public void setNextPageUrl(String nextPageUrl) { this.nextPageUrl = nextPageUrl; }

    public String getPath() { return path; }
    public void setPath(String path) { this.path = path; }

    public int getPerPage() { return perPage; }
    public void setPerPage(int perPage) { this.perPage = perPage; }

    public String getPrevPageUrl() { return prevPageUrl; }
    public void setPrevPageUrl(String prevPageUrl) { this.prevPageUrl = prevPageUrl; }

    public int getTo() { return to; }
    public void setTo(int to) { this.to = to; }

    public int getTotal() { return total; }
    public void setTotal(int total) { this.total = total; }
    
	@Override
	public String toString() {
		return "SearchResponse [currentPage=" + currentPage + ", data=" + data + ", firstPageUrl=" + firstPageUrl
				+ ", from=" + from + ", lastPage=" + lastPage + ", lastPageUrl=" + lastPageUrl + ", links=" + links
				+ ", nextPageUrl=" + nextPageUrl + ", path=" + path + ", perPage=" + perPage + ", prevPageUrl="
				+ prevPageUrl + ", to=" + to + ", total=" + total + "]";
	}
    
    
}
