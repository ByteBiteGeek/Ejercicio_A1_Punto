package MainPack;

public class App {
    public static void main(String[] args) {
        
        Punto objeto0 = new Punto(0 , 0);
        Punto objeto1 = new Punto(0 , 0);
        Punto objeto2 = new Punto(0 , 0);

        objeto0.setX(5);
        objeto0.setY(0);

        objeto1.setX(10);
        objeto1.setY(10);

        objeto2.setX(-3);
        objeto2.setY(7);

        System.out.println("Coordenadas del punto 1 ("+ objeto0.getX()+ ","+ objeto0.getY()+")");
        System.out.println("Coordenadas del punto 2 ("+ objeto1.getX()+ ","+ objeto1.getY()+")");
        System.out.println("Coordenadas del punto 3 ("+ objeto2.getX()+ ","+ objeto2.getY()+")");


        objeto0.setX(8);
        objeto0.setY(6);

        objeto1.setX(5);
        objeto1.setY(28);

        objeto2.setX(-8);
        objeto2.setY(1);

        System.out.println("Nuevas coordenadas del punto 1 ("+ objeto0.getX()+ ","+ objeto0.getY()+")");
        System.out.println("Nuevas coordenadas del punto 2 ("+ objeto1.getX()+ ","+ objeto1.getY()+")");
        System.out.println("Nuevas coordenadas del punto 3 ("+ objeto2.getX()+ ","+ objeto2.getY()+")");
    }
}
