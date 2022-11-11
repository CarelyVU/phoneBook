import java.io.*;
import java.util.Iterator;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.JSONArray;
import org.json.simple.parser.ParseException;

public class Contact {
  public static String fullName;
  public static String nickname;
  public static String birthday;
  public static void imprimirArray() throws IOException, ParseException {
    Object obj = new JSONParser().parse(new FileReader( "data/contacts.json" ));
      JSONObject jsonObject = (JSONObject) obj;
      JSONArray slideContent = (JSONArray) jsonObject.get("contacts");
      Iterator i = slideContent.iterator();

      while (i.hasNext()) {
        JSONObject slide = (JSONObject) i.next();
        fullName = (String) slide.get("fullName");
        nickname = (String) slide.get("nickname");
        birthday = (String) slide.get("birthday");
        System.out.printf("%s\t%s\t%s\n", fullName, nickname, birthday);
      }
  }
  public static void main(String[] args) throws Exception {
    imprimirArray();
  }
}
