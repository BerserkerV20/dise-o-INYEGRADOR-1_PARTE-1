
package Alumno;


public class Alumno {
    String nombre;
    String apePat;
    String apeMat;
    String DNI;
    String Placa;

    public Alumno(String nombre, String apePat, String apeMat, String DNI, String carrera) {
        this.nombre = nombre;
        this.apePat = apePat;
        this.apeMat = apeMat;
        this.DNI = DNI;
        this.Placa = Placa;
    }

    public Alumno() {    
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApePat() {
        return apePat;
    }

    public void setApePat(String apePat) {
        this.apePat = apePat;
    }

    public String getApeMat() {
        return apeMat;
    }

    public void setApeMat(String apeMat) {
        this.apeMat = apeMat;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }}

    