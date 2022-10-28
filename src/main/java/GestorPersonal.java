import java.util.ArrayList;

public class GestorPersonal {
    public class Launcher {
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
                    return persona;
                }
            }
            return null;
        }

        public Persona buscarPersonaPorRut(int rut) {
            for (Persona persona : this.personas) {
                if (persona.getNombre().equals(rut)) {
                    return persona;
                }
            }
            return null;
        }
        public Persona buscarPersonaPorAuto(Persona persona, Automovil auto){
            for(Persona persona : this.personas){
                if(persona.getNombre().equals(auto) && persona.getApellido().equals(auto)){
                    return persona;
                }
            }
            return null;
        }

    }
}
