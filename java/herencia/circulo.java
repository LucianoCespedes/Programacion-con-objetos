public class circulo extends punto{
    
    

    private double R;
    private double D;
    private double P;
    private double A;

    public circulo(double x, double y){
        super(x,y);
        this.R=0;
        this.D=0;
        this.P=0;
        this.A=0;
    }

    // 

    public void MoverCirculo(double u, double j){
        super.setX(u);
        super.setY(j);
    }

    public void ubicacion(){
        System.out.println("X: "+super.getX()+"\n"+"Y: "+super.getY());
    }

    public double Radio()
    {
        return R = Math.sqrt(Math.pow(super.getX(), 2)+Math.pow(super.getY(),2));
    }

    public double Diametro(){
        return D= 2*R;
    }
    
    public double Perimetro(){
        return P=2*Math.PI*R;
    }
    public double Area(){
        return A=Math.PI*Math.pow(R, 2);
    }

    public static void main(String[] args) {
        circulo redondo= new circulo(2, 4);

        redondo.MoverCirculo(2, 22);
        
        System.out.println(redondo.Radio());
        System.out.println(redondo.Diametro());
        System.out.println(redondo.Perimetro());
        System.out.println(redondo.Area());



    }
}