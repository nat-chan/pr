import java.io.*;

public class Palindrome{
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			String line = reader.readLine();
			boolean found = true;
			for(int i = 0;i < line.length()/2;i++){
				if(line.charAt(i) != line.charAt(line.length()-i-1)){
					found = false;
					break;
				}
			}
			if (found) {
				System.out.println(line+"は回文です");
			} else {
				System.out.println(line+"は回文ではありません");
			}
		} catch (IOException e) {
		}
	}
}

