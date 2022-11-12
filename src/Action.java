public class Action {
  private ListOfContacts contacts;
  public Action() throws Exception {
    //Con esto ya pondriamos en setOfContacts todos los contactos
    contacts = new ListOfContacts();
  }
  public void showContacts(){
    StringBuilder show=new StringBuilder("");
    for (Contact contact: contacts.listOfContacts) {
      show.append(String.format("%s\t%s\t%s\n%s\t%s\t%s\n",
          contact.getFullName(), contact.getNickname(), contact.getBirthday(),
          contact.getEmail(), contact.getAddress(), contact.getCellphone()));
    }
    System.out.println(show);
  }

  public void changeNickname(){
    contacts.write("Carmen Gonzales","nickname","Carmen");
  }
  /*
• Buscar por numero de cel
• Buscar por email
• Buscar por direccion

• Encontrar por codigo de area
• Encontrar por cumpleaños
• Encontrar por dominio de email

• Ordenar por nickname
• Ordenar por apellido

 Cambiar el nickname de un contacto
* */
}
