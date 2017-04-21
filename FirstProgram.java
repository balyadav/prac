import java.util.*;
import static net.mindview.util.Print.*;

class FirstProgram{

	public void testVA(String... args){
		for(String s: args){
			print(s + " ");
		}
	}

	public static void main (String... args){
		// print("whaddup");
		// FirstProgram fp = new FirstProgram();
		// fp.testVA(new String[]{"a","e","f"});
		// fp.testVA("a", "e", "fgd");
		for(String s: args){
			print(s);
		}
	}
}