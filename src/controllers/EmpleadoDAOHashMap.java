package controllers;

import java.util.HashMap;
import java.util.Map;
import models.Empleado;

public class EmpleadoDAOHashMap implements EmpleadoDAO{
    private Map<Empleado, Empleado> empleados;

    public EmpleadoDAOHashMap() {
        empleados = new HashMap<>();
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
