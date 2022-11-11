//leyendo Contac uno a uno y guardarlo en un array
// Quien va a crear el array?
//para que Action solo trabaje con un array de Group
public class PhoneBook {
  static Group contacto;

  public static void main(String[] args) {
    contacto=new Group();
    //Podemos llamar directamente al nombre desde contacto;
    System.out.print(contacto.fullName);
    //Podemos llamar Contact desde Grupo;
    contacto.probando();
  }
}
