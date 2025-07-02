package VideoClud;

public class Main{
    public static void main(String[] args) {
        System.out.println("=== Sistema de Gestion de VideoClub ===");

        VideoClud miVideoClud = VideoClud.getInstancia();

        System.out.println("\n --- agregando Clientes ---");
        Cliente cliente1 = new Cliente(1,"15154848545A", "Juan Perez","5559264","juanP33123@gmail.com");
        Cliente cliente2 = new Cliente(1,"84548784515B", "Lola Meras","5454545","lomeras23@hotmail.com");
        miVideoClud.agregarClientes(cliente1);
        miVideoClud.agregarClientes(cliente2);

        System.out.println("Clientes registrados: ");
        miVideoClud.getClientes().forEach(System.out::println);


        System.out.println("\n --- Modificando Cliente  ---");
        Cliente clienteModificado = new Cliente (1,"15411854885C","Juan Perez Gomez","5559264","juanP33123@gmail.com");
        miVideoClud.modificacionCliente((clienteModificado));
        System.out.println("Cliente con codigo 1 despues de la modificacion: ");
        System.out.println(miVideoClud.buscarCliente(1));


        System.out.println("\n--- Buscando clientes por nombre 'Lola' ---");
        miVideoClud.mostarClientes("","Lola").forEach(System.out::println);
    }
}