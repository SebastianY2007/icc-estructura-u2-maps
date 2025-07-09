package controllers;

import java.util.Map;
import java.util.TreeMap;
import models.Empleado;

public class EmpleadoDAOTreeMap implements EmpleadoDAO{
    private Map<Empleado, Empleado> empleados;

    public EmpleadoDAOTreeMap() {
        empleados = new TreeMap<>();
    }

    @Override
    public void agregar(Empleado empleado) {
        empleados.put(empleado, empleado);
    }

    @Override
    public void eliminar(int id) {
        Empleado temp = new Empleado(id);
        
        empleados.remove(temp);
    }

    @Override
    public void listar() {
        System.out.println(empleados);
    }
}
