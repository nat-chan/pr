import java.io.*;

public class NoBreak {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			boolean found = false;
			String line = reader.readLine();
			for(int i = 0; i < line.length(); i++){
				if(line.charAt(i) == 'X'){
					found = true;
				}
				System.out.print(".");
			}
			if(found){
				System.out.println("Xが見つかりました．");
			}else{
				System.out.println("Xが見つかりませんでした．");
			}
		} catch (IOException e) {
		}
	}
}

