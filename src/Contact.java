import java.io.FileReader;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
public class Contact {
  public static String fullName;
  public static String nickname;
  public static String birthday;
  public static void main(String[] args) throws Exception {
    // parsing file "JSONExample.json"
    Object ob = new JSONParser().parse(new FileReader("data/contacts.json"));

    // typecasting ob to JSONObject
    JSONObject js = (JSONObject) ob;
    fullName = (String) js.get("fullName");
    nickname = (String) js.get("nickname");
    birthday = (String) js.get("birthday");

    System.out.printf("%s\t%s\t%s",fullName,nickname,birthday);
  }
}
