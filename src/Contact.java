import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Contact extends ContactInfo {
  //quien elije grupo? El usuario? puede ser cualquier cosa
  private Map<TipeOfGroup,String> group = new HashMap<>();
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
    group.put(TipeOfGroup.personalized,"Undefined");
    groupByCodeArea();
    groupByEmailDomain();
  }

  public void groupByEmailDomain(){
    String[] parts = getEmail().split("@");
    group.put(TipeOfGroup.emailDomain,parts[1]);
  }

  public void groupByCodeArea(){
    String[] parts = getCellphone().split(" ");
    group.put(TipeOfGroup.areaCode,parts[0]);
  }

  public void changeGroup(String newGroup){
    group.put(TipeOfGroup.personalized, newGroup);
  }

  public void removeGroup(){
    group.put(TipeOfGroup.personalized, "Undefined");
  }

  public String getGroup(TipeOfGroup tipeOfGroup){
    return group.get(tipeOfGroup);
  }
}
