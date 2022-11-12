import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

//necesita un nuevo nombre
/*Group personas[] = [Contactos de archivo]
* */
public class Contact extends ContactInfo {
  //quien elije grupo? El usuario? puede ser cualquier cosa
  private String group;
  public Contact(String fullName, String nickname, String birthday, JSONArray jsonInfo){
    setFullName(fullName);
    setNickname(nickname);
    setBirthday(birthday);
    Iterator i = jsonInfo.iterator();
    JSONObject info;
    while (i.hasNext()) {
      info = (JSONObject) i.next();
      setInfo((String) info.get("cellphone"), (String) info.get("email"), (String) info.get("address"));
    }
    this.group = "Ungrouped";
  }
  public void groupByEmailDomain(){
    //regresa un String
  }
  public void groupByCodeArea(){
    //regresa un String
  }
  public void changeGroup(String contactKey, String newGroup){

  }
  public void removeContactOfGroup(String contactKey){

  }
}
