public class Planeta {
    String nombre;
    int satelites;
    double masa;
    double volumen;
    double diametro;
    double distanciaSol;
    boolean observable;

    public Planeta(String nombre, int satelites, double masa, double volumen, int diametro, int distanciaSol, boolean observable) {

      this.nombre = nombre;
      this.satelites = satelites;
      this.masa = masa;
      this.volumen = volumen;
      this.diametro = diametro;
      this.distanciaSol = distanciaSol;
      this.observable = observable;     
    }

    public void imprimir(){
        System.out.println("nombre : " +nombre);
        System.out.println("Cantidad de satelites : " +satelites);
        System.out.println("Masa : " +masa);
        System.out.println("Volúmen : " +volumen);
        System.out.println("Diametro : " +diametro);
        System.out.println("Distancia al sol : " +distanciaSol);
        System.out.println("¿Es observable? : " +observable);
    }

    public double calcularDensidad() {
        return masa/volumen;
    }

    public static void main(String[] args) {
        Planeta P1 = new Planeta("Tierra", 1, 5.9736E24, 1.08321E12, 12742, 150000000, true);
        Planeta P2 = new Planeta("Jupiter", 1, 1.899E27, 1.4313E15, 139820, 750000000, true);
    

    System.out.println("Información de P1 = ");
    P1.imprimir();
    System.out.println("Densidad de P1 =" +P1.calcularDensidad() + "Kg/m^3");
    
    System.out.println("Información de P2 = ");
    P2.imprimir();
    System.out.println("Densidad de P2 =" +P2.calcularDensidad() + "Kg/m^3");
    }
}