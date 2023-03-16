public class distancia {
  double a;
  double b;
  double c;
    
    public  double distancia(double a,double b, double c){
        System.out.println("Informe a distância da corrida em três pontos ");
        
        double distancia = distancia(a,b,c);
        return distancia;
    }
        public double delta()}
        double del=b*b-(4*a*c);
        {
               
        double x1 = (-b+Math.sqrt(del))/(2*a);
                double x2 = (-b-Math.sqrt(del))/(2*a);
                while(del<=0){
                  System.out.println("o motorista não podera realizar a corrida,tente outras cordenadas.");
                }
                if(x1<x2){
                  System.out.println("distancia de x é: " + x1);
                  return x1;
                }
                if(x1>x2){
                    System.out.println("distancia de x é: " + x2);
                    return x2;
                }
                else{
                  System.out.println(" o motorista está a acaminho...");
                }
      }
}