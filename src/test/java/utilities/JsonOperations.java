package utilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonOperations {

	public static String endPointsReader(String endPointName) {

		JSONParser jsonParser = new JSONParser();
		String url = "";
		try (FileReader reader = new FileReader("src/test/resources/testData/endPoints.json")) {

			Object obj = jsonParser.parse(reader);
			JSONObject jsonObject = (JSONObject) obj;

			url = (String) jsonObject.get(endPointName);
//			System.out.println(url);
			return url;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return "[ERROR] Couldn't find the requested endpoint : "+endPointName+". Please check the details provided.";	
	}
	
	public static String environementDataReader(String envName, String data) {

		JSONParser jsonParser = new JSONParser();
		JSONObject url;
		try (FileReader reader = new FileReader("src/test/resources/testData/endPoints.json")) {

			Object obj = jsonParser.parse(reader);
			JSONObject jsonObject = (JSONObject) obj;

			url = (JSONObject) jsonObject.get(envName);
			
			return (String) url.get(data);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return "[ERROR] Couldn't find the requested data : "+data+". Please check the details provided.";
	}
	

//	public static void main(String[] args) {
//		endPointsReader("getCustomer");
//	}

}
