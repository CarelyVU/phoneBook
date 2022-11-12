import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ListOfContacts {

  //Hacer la lista de contactos
  //va a ser una lista
  public List<Contact> listOfContacts;
  static final String FILE = "data/contacts.json";
  Object contactsJson = new JSONParser().parse(new FileReader(FILE));
  JSONObject jo = (JSONObject) contactsJson;
  JSONArray ja = (JSONArray) jo.get("contacts");

  public ListOfContacts() throws Exception {
    listOfContacts = new ArrayList<>();
    //lee el archivo
    Iterator itr2 = ja.iterator();
    Contact contact;
    while (itr2.hasNext()) {
      JSONObject slide = (JSONObject) itr2.next();
      //tenemos array de info
      JSONArray jsonInfo = (JSONArray) slide.get("info");
      contact = new Contact(
          (String) slide.get("fullName"), (String) slide.get("nickname"),
          (String) slide.get("birthday"), jsonInfo);
      listOfContacts.add(contact);
    }
  }

  //key nombre de la persona
  //new value el nuevo parametro
  public void write(String fullName, String parameter, String newValue) {
    Iterator itr2 = ja.iterator();
    String keySlide;
    while (itr2.hasNext()) {
      JSONObject slide = (JSONObject) itr2.next();
      keySlide = (String) slide.get("fullName");
      if (keySlide.equals(fullName)) {
        slide.remove(parameter);
        slide.put(parameter, newValue);
      }
    }
    try {
      FileWriter file = new FileWriter(FILE);
      file.write(jo.toJSONString());
      file.flush();
      file.close();

    } catch (Exception ex) {
      System.out.println("Error: " + ex.toString());
    }
  }

}
