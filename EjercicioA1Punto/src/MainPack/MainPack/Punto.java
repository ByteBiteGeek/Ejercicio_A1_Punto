package MainPack;

class Punto{

    private int x; // Usada para coordenadas plano X
    private int y; // Usada para coordenada plano Y

    
    // Construct
    Punto (int x, int y){

        this.x = x;
        this.y = y;
    }

    // method Get
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    //method Set

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    
}