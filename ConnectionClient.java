package prac;
import static net.mindview.util.Print.*;
import prac.ConnectionManager;

class ConnectionClient{
	public static void main(String[] args){
		print(ConnectionManager.getConnection());
		print(ConnectionManager.getConnection());
		print(ConnectionManager.getConnection());
		print(ConnectionManager.getConnection());
	}
}