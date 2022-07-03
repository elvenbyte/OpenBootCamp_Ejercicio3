public class Main {
    public static void main(String[] args) {
	Persona persona = new Persona();
	persona.setEdad(18);
	persona.setNombre("David");
	persona.setTelefono("000000000");
	System.out.println(persona.getEdad());
	System.out.println(persona.getNombre());
	System.out.println(persona.getTelefono());
    }
}

