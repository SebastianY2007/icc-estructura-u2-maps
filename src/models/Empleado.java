package models;

public class Empleado implements Comparable<Empleado>{
    private int id;
    private String name;
    private String position;

    

    public Empleado(int id) {
        this.id = id;
    }

    public Empleado(int id, String name, String position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Empleado other = (Empleado) obj;
        if (id != other.id)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "ID: " + id + "Nombre: " + name + "Posicion: " + position;
    }

    @Override
    public int compareTo(Empleado o) {
        int positionComparison = this.position.compareTo(o.position);

        if (positionComparison == 0) {
            return this.name.compareTo(o.name);
        }
        return positionComparison;
    }
}