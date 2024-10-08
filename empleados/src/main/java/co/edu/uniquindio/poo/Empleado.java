package co.edu.uniquindio.poo;

public abstract class Empleado {
    private String nombre; 
    private int Id; 
 


/**
 * metodo contructor de la clase empleado
 * @param nombre
 * @param Id
 * @param salario
 */
    public Empleado(String nombre,int Id){
        this.nombre=nombre;
        this.Id=Id;
    
    }
/**
 * 
 * Metodo abtracto para calcular el salario
 */
    public abstract int calcularSalario();

/**
 * 
 * Metodos getters y setters 
 */
public String getNombre() {
    return nombre;
}


public void setNombre(String nombre) {
    this.nombre = nombre;
}


public int getId() {
    return Id;
}


public void setId(int id) {
   this.Id = id;
}



@Override
public String toString() {

    return "Empleado [nombre=" + nombre + ", Id=" + Id + "]";
}


}
 