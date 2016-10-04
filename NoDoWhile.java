import java.io.*;

public class NoDoWhile {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			String line;
			line = reader.readLine();
			System.out.println("You said: " + line);
			 while(line.equals("bye") == false){
				line = reader.readLine();
				System.out.println("You said: " + line);
			}
		} catch (IOException e) {
		}
	}
}
