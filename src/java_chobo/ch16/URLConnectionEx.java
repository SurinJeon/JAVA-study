package java_chobo.ch16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;

public class URLConnectionEx {

	public static void main(String[] args) throws MalformedURLException {
		
		URL url = new URL("https://news.naver.com/main/ranking/read.nhn?mode=LSD&mid=shm&sid1=001&oid=025&aid=0003080763&rankingType=RANKING");
		// 해당 url을 input으로 가져옴
		// 그리고 bufferedwriter로 내보낼 것
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("test.html")))){ // url의 openStream한걸 InputStream으로 받아온 뒤 BufferedReader 돌리는 
			String line = null;
			while ( (line = br.readLine()) != null ) { // 해당 내용이 비어있지 않으면 읽어라
				System.out.println(line);
				bw.write(line);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
