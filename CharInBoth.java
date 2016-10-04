import java.io.*;

public class CharInBoth{
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			String line = reader.readLine();
			String line2 = reader.readLine();
			boolean found = false;
			char founded = '\033';
			int i;int j;
			for(i = 0; i < line.length(); i++){
				for(j = 0; j < line2.length(); j++){
					if(line.charAt(i) == line2.charAt(j) ){
						founded = line.charAt(i);
						break;
					}
				}
			}
			if(found){
				System.out.println("同じ文字"+founded+"が見つかりました");
			} else {
				System.out.println("同じ文字は見つかりませんでした");
			}
		} catch (IOException e) {
		}
	}
}

