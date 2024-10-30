
package metodos;
import Alumno.Alumno;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Metodos {
    Vector vPrincipal = new Vector();
    
    public void guardar(Alumno unAlumno){
        vPrincipal.addElement(unAlumno);
    }
    
    public void guardarArchivo(Alumno Alumno){
        try{
            FileWriter fw = new FileWriter("Alumnos.txt",true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.print(Alumno.getNombre());
            pw.print("|"+Alumno.getApePat());
            pw.print("|"+Alumno.getApeMat());
            pw.print("|"+Alumno.getDNI());
            pw.println("|"+Alumno.getPlaca());
            pw.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    public DefaultTableModel listaAlumnos(){
        Vector cabeceras = new Vector();
        cabeceras.addElement("Nombre");
        cabeceras.addElement("Apelido Paterno");
        cabeceras.addElement("Apellido Materno");
        cabeceras.addElement("DNI");
        cabeceras.addElement("Placa");
        
        DefaultTableModel mdlTabla = new DefaultTableModel(cabeceras,0);
        try{
            FileReader fr = new FileReader("Alumnos.txt");
            BufferedReader br = new BufferedReader(fr);
            String d;
            while((d=br.readLine())!=null){
                StringTokenizer dato = new StringTokenizer(d,"|");
                Vector x = new Vector();
                while(dato.hasMoreTokens()){
                    x.addElement(dato.nextToken());
                }
                mdlTabla.addRow(x);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return mdlTabla;
    }
}
