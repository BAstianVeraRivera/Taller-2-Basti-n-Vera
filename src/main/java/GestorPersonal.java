import java.io.PrintStream;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class GestorPersonal {
    public class Launcher {
        private String nombreGestor;
        public String getNombreGestor() {
            return this.nombreGestor;
        }

        public void setNombreGestor(String nombreGestor) {
            this.nombreGestor = nombreGestor;
        }
        public ArrayList<Persona> personas = new ArrayList<Persona>();
        public ArrayList<Correo_Electronico> correos = new ArrayList<Correo_Electronico>();
        public ArrayList<Automovil> autos = new ArrayList<Automovil>();

        public void agregarPersonas(Persona persona, Correo_Electronico correo, Automovil auto) {
            this.personas.add(persona);
            System.out.println("Persona agregado");
        }

        public void agregarCorreo(Correo_Electronico correo) {
            this.correos.add(correo);
            System.out.println("Correo agregado");
        }

        public void agregarAutomovil(Automovil auto) {
            this.autos.add(auto);
            System.out.println("Automovil agregado");
        }

        public Persona buscarNombrePersonaPorNombre(String nombre) {
            for (Persona persona : this.personas) {
                if (persona.getNombre().equals(nombre)) {
                    System.out.println(persona);;
                }
            }
            return null;
        }

        public Persona buscarPersonaPorRut(int rut) {
            for (Persona persona : this.personas) {
                if (persona.getNombre().equals(rut)) {
                    System.out.println(persona);;
                }
            }
            return null;
        }
        public Persona buscarPersonaPorAuto(Automovil auto){
            for(Persona persona : this.personas){
                if(persona.getNombre().equals(auto) && persona.getApellido().equals(auto)){
                    System.out.println(persona);;
                }
            }
            return null;
        }

    }

}
