import controllers.Ejercicios;
import controllers.EmpleadoContoller;
import controllers.EmpleadoDAO;
import controllers.EmpleadoDAOHashMap;
import controllers.EmpleadoDAOTreeMap;
import controllers.Mapa;
import java.util.Arrays;
import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {

        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        runMapExample();

        // Ejecuta el ejemplo de gestión de empleados usando HashMap
        runEmpleadoExample();

        // Ejecuta los ejercicios de sumatoria y anagramas
        runEjercicios();
    }

    private static void runEmpleadoExample() {
        EmpleadoDAO empleadoDAOHash = new EmpleadoDAOHashMap();
        EmpleadoContoller empleadoContoller = new EmpleadoContoller(empleadoDAOHash);

        EmpleadoDAO empleadoDAOTree = new EmpleadoDAOTreeMap();
        EmpleadoContoller empleadoContoller2 = new EmpleadoContoller(empleadoDAOTree);

        Empleado emp1 = new Empleado(5, "Pedro", "Dev");
        Empleado emp2 = new Empleado(3, "Juan", "Dev");
        Empleado emp3 = new Empleado(1, "Jose", "Dev");
        Empleado emp4 = new Empleado(2, "Pedro", "Dev");
        Empleado emp5 = new Empleado(4, "Pedro", "Dev");

        empleadoContoller.agregarEmpleado(emp1);
        empleadoContoller.agregarEmpleado(emp2);
        empleadoContoller.agregarEmpleado(emp3);
        empleadoContoller.agregarEmpleado(emp4);
        empleadoContoller.agregarEmpleado(emp5);

        empleadoContoller2.agregarEmpleado(emp1);
        empleadoContoller2.agregarEmpleado(emp2);
        empleadoContoller2.agregarEmpleado(emp3);
        empleadoContoller2.agregarEmpleado(emp4);
        empleadoContoller2.agregarEmpleado(emp5);

        empleadoContoller.listarEmpleados();
        empleadoContoller2.listarEmpleados();
    }

    private static void runMapExample() {
        Mapa mapa = new Mapa();
        mapa.ejemploConHashMap();
        mapa.ejemploConLinkedHashMap();
        mapa.ejemploConTreeMap();
    }

    private static void runEjercicios() {
        Ejercicios ejercicios = new Ejercicios();

        System.out.println("\nContando caracteres para 'hola':");
        ejercicios.contarCaracteres("hola");

        System.out.println("\nAnagramas:");
        System.out.println("'listen' y 'silent' son anagramas? -> " + ejercicios.sonAnagramas("listen", "silent"));
        System.out.println("'hello' y 'bello' son anagramas? -> " + ejercicios.sonAnagramas("hello", "bello"));
        System.out.println("'triangle' y 'integral' son anagramas? -> " + Ejercicios.areAnagrams("triangle", "integral"));

        System.out.println("\nSumatoria de dos:");
        int[] nums1 = {9, 2, 3, 6};
        int objetivo1 = 5;
        int[] resultado1 = ejercicios.sumatoriaDeDos(nums1, objetivo1);
        System.out.println("Para nums:" + Arrays.toString(nums1) + " y objetivo:" + objetivo1 + ", resultado: " + Arrays.toString(resultado1));

        int[] nums2 = {9, 2, 3, 6};
        int objetivo2 = 10;
        int[] resultado2 = ejercicios.sumatoriaDeDos(nums2, objetivo2);
        System.out.println("Para nums:" + Arrays.toString(nums2) + " y objetivo:" + objetivo2 + ", resultado: " + Arrays.toString(resultado2));
    }
}
