//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Usuario {
    String nombre = "Alberto";
    String apellido = "Cabrera";
    int edad = 47;
    String direccion = "Kelterweg, 13, 53125, Bonn";
    String telefono = "0157768754";
}

// Segunda clase
class Auto {
    String marca = "Ford";
    String modelo;
    byte numeroRuedas = 4;
    String color;
    String year;
}
public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario();
        Usuario usuario2 = new Usuario();

        Auto auto1 = new Auto();
        Auto auto2 = new Auto();

        auto1.modelo = "Mustang";
        auto1.color = "rojo";
        auto1.year = "1968";

        auto2.modelo = "Mondeo";
        auto2.color = "verde";
        auto2.year = "2012";
        // Auto 1
        System.out.println("----> Atributos del auto1");
        System.out.println(auto1.marca);
        System.out.println(auto1.modelo);
        System.out.println(auto1.color);
        System.out.println(auto1.year);
        System.out.println(auto1.numeroRuedas);

        // Auto 2
        System.out.println("----> Atributos del auto2");
        System.out.println(auto2.marca);
        System.out.println(auto2.modelo);
        System.out.println(auto2.color);
        System.out.println(auto2.year);
        System.out.println(auto2.numeroRuedas);



        // Reasignamos valores al objeto usuario
        usuario2.nombre = "Roberto";
        usuario2.apellido = "Gonzáles";
        usuario2.edad = 45;
        usuario2.telefono = "0157000000";
        usuario2.direccion = "Pinar del Rio, Cuba";


        System.out.println(usuario1.nombre);
        System.out.println(usuario1.apellido);
        System.out.println(usuario1.edad);
        System.out.println(usuario1.direccion);
        System.out.println(usuario1.telefono);
        System.out.println();
        System.out.println(usuario2.nombre);
        System.out.println(usuario2.apellido);
        System.out.println(usuario2.edad);
        System.out.println(usuario2.direccion);
        System.out.println(usuario2.telefono);





        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("Hello Alberto!");
        // bucle while
       /* int i = 0; // iterador

        while (i < 10) {
            System.out.println("El valor es: " + i);
            i++; */
        /*int i= 10;

        while (i > 0) {
            System.out.println("El valor es: " + i);
            i--; */

        /* int i = 5;

        do {
            System.out.println("El valor es: " + i);
            i++; // incremento
        } while (i < 10); // expresión

        for (int j = 0; i < 5; j++) {
            System.out.println("El va lor es " + j); */
        }

    }





