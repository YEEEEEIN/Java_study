package Java_230414;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

//import org.json.simple.perser.JSONParser;

public class P20 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		// JSON Parser κ°μ²΄ ??±
		JSONParser parser = new JSONParser();
		// ??Ό?? JSON ?°?΄?° ?½κΈ?
		Object obj = parser.parse(new FileReader("C:\\Users\\??Έ\\Desktop\\?λ°μ¬?(v2023)-?λ°μ¬?\\datas.json"));

		// JSON λ°°μ΄λ‘? λ³??
		JSONArray array = (JSONArray) obj;

		// λ°°μ΄? ?¬κΈ°λ§?Ό λ°λ³΅
		System.out.printf("*****************************\n");
		for (int i = 0; i < array.size(); i++) {
			// λ°°μ΄?? JSON κ°μ²΄ ???© κ°?? Έ?€κΈ?
			JSONObject result = (JSONObject) array.get(i);
			// ?΄λ¦? μΆλ ₯
			System.out.println("?΄λ¦? : " + result.get("name"));
			// ?λ²? μΆλ ₯
			System.out.println("?λ²? : " + result.get("studentid"));

			// ? ? λ°°μ΄ κ°?? Έ?€κΈ?
			JSONArray score = (JSONArray) result.get("score");
			// κ°? κ³Όλͺ© ? ? μΆλ ₯
			long kor = (long) score.get(0); // λ°°μ΄ μ€? μ²«λ²μ§Έλ κ΅??΄
			long eng = (long) score.get(1); // λ°°μ΄ μ€? μ²«λ²μ§Έλ ??΄
			long mat = (long) score.get(2); // λ°°μ΄ μ€? μ²«λ²μ§Έλ ??
			System.out.println("κ΅??΄ : " + kor);
			System.out.println("??΄ : " + eng);
			System.out.println("?? : " + mat);
			// μ΄μ  μΆλ ₯
			System.out.println("μ΄μ  : " + (kor + eng + mat));
			// ?κ·? μΆλ ₯
			System.out.println("?κ·? : " + (kor + eng + mat) / 3);
			System.out.println("\"*****************************");
		}
	}
}
