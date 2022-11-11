//necesita un nuevo nombre
public abstract class Contact {
  public static String fullName = "nombre de prueba";
  private String nickname;
  private String birthday;
  private ContactInfo contactInfo;

  /*public static void imprimirArray() throws IOException, ParseException {
    //obj deja leer el archivo
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
  }*/
  public abstract String groupByEmailDomain();
  public abstract String groupByCodeArea();
  public abstract String changeGroup(String contactKey, String newGroup);
  public abstract void removeContactOfGroup(String contactKey);
}
