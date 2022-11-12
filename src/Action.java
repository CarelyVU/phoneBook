public class Action {
  private ListOfContacts Contacts;
  public Action() throws Exception {
    //Con esto ya pondriamos en setOfContacts todos los contactos
    Contacts = new ListOfContacts();
  }
  public void showContacts(){
    StringBuilder show=new StringBuilder("");
    for (Contact contact: Contacts.listOfContacts) {
      show.append(String.format("%s\t%s\t%s\n%s\t%s\t%s\n",
          contact.getFullName(), contact.getNickname(), contact.getBirthday(),
          contact.getInfoList().getEmail(), contact.getInfoList().getAdress(), contact.getInfoList().getCellphone()));
    }
    System.out.println(show);
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
