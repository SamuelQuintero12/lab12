import javax.swing.JOptionPane;

public class Cancha{
 double lado_A;
 double lado_B;
 double Areatotal;
  public Cancha(){

    lado_A=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la medida del lado A"));


    lado_B=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la medida del lado B"));
  }

  public void operacion() {Areatotal=ladoA*ladoB;
  }
  public void imprimir(){
    System.out.println("El area del rectangulo es de: "+Areatotal);
  }
}
