
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

// 클래스간 데이터전달 방법명시

public class ET_DataClient {

	public static void main(String[] args) throws IOException {
		Socket s = new Socket("localhost", 5000);
		PrintWriter output = new PrintWriter(s.getOutputStream(), true);
		String str1 = "2019-04-23,13:27:00,35.8,57.7,180,0,0,0,100,100,1,2!!";
		output.println(str1);
		
		System.exit(0);
	}

}

