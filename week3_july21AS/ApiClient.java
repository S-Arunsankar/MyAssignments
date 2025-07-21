package week3_july21AS;

public class ApiClient {
	public void sendRequest(String endpoint) {
		System.out.println("Endpoint output:"+" " +endpoint);
	}
	
	public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
		System.out.println("sendrequest output:"+" "+endpoint+requestBody+requestStatus);
	}

	public static void main(String[] args) {
		ApiClient client = new ApiClient();
		client.sendRequest("End point received");
		client.sendRequest("received", "inputbody", true);
		
	}
}
