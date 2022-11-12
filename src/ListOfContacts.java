import java.io.FileReader;
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
  public ListOfContacts() throws Exception {
    listOfContacts = new ArrayList<>();
    //lee el archivo
    Object obj = new JSONParser().parse(new FileReader("data/contacts.json"));
    JSONObject jo = (JSONObject) obj;
    //tenemos Array contactos
    JSONArray ja = (JSONArray) jo.get("contacts");
    Iterator itr2 = ja.iterator();
    Contact contact;
    while (itr2.hasNext()) {
      JSONObject slide = (JSONObject) itr2.next();
      //tenemos array de info
      JSONArray jsonInfo = (JSONArray) slide.get("info");
      contact = new Contact(
          (String) slide.get("fullName"), (String)slide.get("nickname"), (String)slide.get("birthday"), jsonInfo);
      listOfContacts.add(contact);
    }

  }



}
