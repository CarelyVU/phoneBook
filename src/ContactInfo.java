//necesita un nuevo nombre
public abstract class ContactInfo {
  private String fullName;
  private String nickname;
  private String birthday;
  private Info infoList;
  public String getFullName() {
    return fullName;
  }

  public String getNickname() {
    return nickname;
  }

  public String getBirthday() {
    return birthday;
  }
  public String getCellphone() {
    return infoList.cellphone;
  }
  public String getAddress() {
    return infoList.adress;
  }
  public String getEmail() {
    return infoList.email;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public void setBirthday(String birthday) {
    this.birthday = birthday;
  }

  public void setInfo(String cellphone, String email, String address) {
    this.infoList = new Info(cellphone, email, address);
  }
  //cambiar nickname
  public abstract void groupByEmailDomain();
  public abstract void groupByCodeArea();
  public abstract void changeGroup(String contactKey, String newGroup);
  public abstract void removeContactOfGroup(String contactKey);
}
