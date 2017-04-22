package prac;

class Connection{
	protected Connection(){};
}

public class ConnectionManager extends Connection{
	private static int numberOfConnections = 3;

	public static Connection getConnection(){
		numberOfConnections--;
		return (numberOfConnections >= 0) ? new Connection() : null;
	}
}