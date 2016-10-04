import java.io.*;
import java.util.*;

public class Prime{
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("正の整数を入力してください。");
			String line = reader.readLine();
			int n = Integer.parseInt(line);
			//sqrt(n)以下の素数をprimeに格納する
			ArrayList<Integer> prime = new ArrayList<Integer>();
			//prime.add(2);
			for(int i=2; i*i<=n; i++){
				boolean flag = true;
				for(int j=0; j < prime.size(); j++){
					if(i % prime.get(j) == 0){
						flag = false;
						break;
					}
				}
				if(flag){
					prime.add(i);
				}
			}
			boolean flag = true;
			for(int j=0; j < prime.size(); j++){
				if(n % prime.get(j) == 0){
					flag = false;
					break;
				}
			}
			if(flag & n != 1){
				System.out.println(""+n+"は素数です");
			}else{
				System.out.println(""+n+"は素数ではありません");
			}
		} catch (IOException e) {
		}
	}
}

