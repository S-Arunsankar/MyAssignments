package week3_july22;

public class Concrete implements DatabaseConnections {

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("Connected Successfully");
		
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("Disconnected Successfully");
	}

	@Override
	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("Updated successfully");
		
	}
	
	public static void main(String[] args) {
		Concrete Data = new Concrete();
		Data.connect();
		Data.disconnect();
		Data.executeUpdate();
	}

}
