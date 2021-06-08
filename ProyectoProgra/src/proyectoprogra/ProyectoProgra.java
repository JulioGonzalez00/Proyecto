package proyectoprogra;


public class ProyectoProgra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PortadaHotel port = new PortadaHotel();
        PruebaInterfazGrafica login = new PruebaInterfazGrafica();
        port.setVisible(true);
        port.setLocationRelativeTo(null);
        try{
            Thread.sleep(1000);
        }catch(InterruptedException ex){
            System.out.println("Error al dormir el hilo");
        }
        port.cerrar();
        //login.setVisible(true);
    }
    
}
