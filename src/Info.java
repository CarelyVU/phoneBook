public class Info {
  private String cellphone;
  private String email;
  private String adress;
  public Info(String cellphone, String email, String address){
    this.cellphone=cellphone;
    this.email=email;
    this.adress=address;
  }

  public String getCellphone() {
    return cellphone;
  }

  public String getEmail() {
    return email;
  }

  public String getAdress() {
    return adress;
  }
}

/*while (itr2.hasNext())
      {
        Iterator<Map.Entry> itr1 = ((Map) itr2.next()).entrySet().iterator();
        while (itr1.hasNext()) {
          Map.Entry pair = itr1.next();
          System.out.println(pair.getKey() + " : " + pair.getValue());
        }
      }*/
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
