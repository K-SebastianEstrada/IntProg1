public class coche {
    int puertas;
    
    public void addpuerta(int puertas){
        this.puertas = this.puertas+1;
    }

    public static void main(String[] args) {
        coche c = new coche();
        c.puertas = 4;
        c.addpuerta(1);
        System.out.println(c.puertas);
    }
}
