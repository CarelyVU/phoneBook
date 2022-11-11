//necesita un nuevo nombre
public class Group extends Contact{
  //group puede ser un map?
  public String group;
  //PUEDEN SER VACIOS?
  //asi solo tendrian que encargarse de poner el grupo;
  public String groupByEmailDomain(){
    return "hOLA";
  }
  //esto tambien
  public String groupByCodeArea(){
    return "hOLA";
  }
  public String changeGroup(String contactKey, String newGroup){
    return "hOLA";
  }
  public void removeContactOfGroup(String contactKey){

  }

  public void probando(){
    System.out.println(fullName);
  }
}
