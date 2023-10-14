import java.util.Scanner;
public class App{
    static  Scanner lector= new Scanner(System.in);
    
    public static void main(String[] args) throws Exception {
      
      char l;
       

       System.out.println("Elija el cuerpo geometrico que quiere calcular");
         System.out.println(":::::::::::::::::::::::::::::::::::::::::");
         System.out.println("a.Prisma");
         System.out.println("b.Cilindro");
         System.out.println("c.Piramide");
         System.out.println("d.Cono");
         System.out.println("e.Esfera");
         System.out.println("f.Zona Esferica");
         System.out.println("g.Casquete Esferico");
         System.out.println("h.Ortoedro");
         System.out.println("i.Tetraedro");
      System.out.println("j.Hexaedro");
      System.out.println("k.Octaedro");
      System.out.println("l.Dodecaedro");
      System.out.println("m.Icosaedro");
      System.out.println("n.Tronco de cono");
      System.out.println("o.Tronco de piramide");
      System.out.println("p.Cuña Esferica y Huso esferico");
         l=lector.next().charAt(0);

         if(l <= 0 ){
          System.out.println("no se pueden ingresar valores numericos");
         }else{
          
        
         
         switch(l){
                      case 'a':
                      Prisma();

                      break;

                      case 'b':
                      cilindro();
                      break;
                      case'c':
                      piramide();
                      break;
                      case'd':
                      Cono();
                      break;
                      case'e':
                      Esfera();
                      break;
                      case'f':
                      zonaesferica();
                      break;
                      case'g':
                      casqueteEsferico();
                      break;
                      case'h':
                      Ortoedro();
                      break;
                      case'i':
                      Tetraedro();
                      break;
                      case'j':
                      Hexaedro();
                      break;
                      case'k':
                      Octaedro();
                      break;
                      case'l':
                      Dodecaedro();
                      break;
                      case'm':
                      Icosaedro();
                      break;
                      case'n':
                      TroncodeCono();
                      break;
                      case'o':
                      TroncodeCono();
                      break;
                      case'p':
                      Cuñayhusoesferico();
                      break;
                      default:
                      System.out.println("valor erroneo ingrese otro valor");
                      




         }

         }
        }
public static void Prisma(  ){
    double altura,perimetro,Arealateral,volumen,Areabase,Areatotal;

    System.out.println("ingrese la altura del cuerpo");
                      altura=lector.nextDouble();
                      System.out.println("ingrese el perimetro del cuerpo");
                      perimetro=lector.nextDouble();
                      
              
                      Arealateral=altura*perimetro;
              
                      System.out.println("ingrese el area base del cuerpo");
                      Areabase=lector.nextDouble();
              
                      Areatotal=Arealateral+(Areabase*2);
              
                      volumen=Areabase*altura;
              
                      System.out.println("El Area lateral es:"+Arealateral);
                      System.out.println("El Area Total es:"+Areatotal);

}
public static void cilindro(){
  double altura,perimetro,Arealateral,Areabase,volumen,Areatotal;
  System.out.println("ingrese el altura del cuerpo");
  altura=lector.nextDouble();
  System.out.println("ingrese el perimetro del cuerpo");
  perimetro=lector.nextDouble();

  Arealateral=altura*perimetro;

  System.out.println("ingrese el area del cuerpo");
  Areabase=lector.nextDouble();

  Areatotal=Arealateral+(Areabase*2);

  volumen=Areabase*altura;

  System.out.println("El Area lateral es:"+Arealateral);
  System.out.println("El Area Total es:"+Areatotal);
  System.out.println("El volumen es:"+volumen);
}
public static void piramide(){
     double altura,perimetro,Arealateral,Areabase,volumen,Areatotal,Apotema;
  System.out.println("Ingrese el Area base del cuerpo");
  Areabase= lector.nextDouble();
  System.out.println("Ingrese el apotema del cuerpo ");
  Apotema=lector.nextDouble();
  System.out.println("Ingrese el perimetro del cuerpo");
  perimetro=lector.nextDouble();
  System.out.println("Ingrese la altura del cuerpo");
  altura=lector.nextDouble();

  Arealateral=perimetro*(Apotema/2);
  Areatotal=Arealateral+Areabase;
  volumen=Areabase*altura;

  System.out.println("El Area lateral es:"+Arealateral);
  System.out.println("El Area total es :"+Areatotal);
  System.out.println("Ël volumen es :"+volumen);

}
public static void Cono(){
  double altura,perimetro,Arealateral,Areabase,volumen,Areatotal,Generatris;
  System.out.println("Ingrese el Area base del cuerpo");
  Areabase= lector.nextDouble();
  System.out.println("Ingrese el Gerenatris del cuerpo ");
  Generatris=lector.nextDouble();
  System.out.println("Ingrese el perimetro del cuerpo");
 perimetro=lector.nextDouble();
 System.out.println("Ingrese la altura del cuerpo");
 altura=lector.nextDouble();

 Arealateral=perimetro*(Generatris/2);
 Areatotal=Arealateral+Areabase;
 volumen=Areabase*altura;

System.out.println("El Area lateral es:"+Arealateral);
System.out.println("El Area total es :"+Areatotal);
System.out.println("Ël volumen es :"+volumen);  

}
public static void Esfera(){
  double radio,area,volumen,altura,Radiodelaesfera;
  System.out.println("ingrese el radio de la esfera");
  
                                radio=lector.nextDouble();
                        
                                 area=(4*3.14)*(radio*radio);
                             volumen=(4/3*3.14)*(radio*radio*radio);
                    
                             
                             System.out.println("el area es:"+area);
                             System.out.println("el volumen es:"+volumen);
                             
}                      
                             
  public static void zonaesferica(){
    double altura,Radiodelaesfera,radio,area,volumen;
     System.out.println("Ingrese la altura del cuerpo esferico");
                             altura=lector.nextDouble();
                             System.out.println("Ingrese el radio de la esfera");
                             Radiodelaesfera=lector.nextDouble();
                             System.out.println("Ingrese el radio");
                             radio=lector.nextDouble();
                    
                             area=(2*3.14)*(Radiodelaesfera*altura);
                             volumen=(3.14*altura)*(altura*altura+6+radio*radio+radio*radio)/(6);
                    
                             System.out.println("El area es :"+area);
                             System.out.println("El volumen es:"+volumen);


}
public static void casqueteEsferico(){
  double altura,Radiodelaesfera,area,volumen,radio;
  System.out.println("Ingrese la altura del cuerpo esferico");
  altura=lector.nextDouble();
  System.out.println("Ingrese el radio de la esfera");
  Radiodelaesfera=lector.nextDouble();
  System.out.println("Ingrese el radio");
  radio=lector.nextDouble();

  area=(2*3.14)*(Radiodelaesfera*altura);
  volumen=(3.14*altura)*(3*Radiodelaesfera-altura)/3;

  System.out.println("El area es:"+area);
  System.out.println("El volumen es:"+volumen);
}
public static void Ortoedro(){
  double longitud,altura,area,profundidad,volumen;
  System.out.println("Ingrese una longitud");
                             longitud=lector.nextDouble();
                             System.out.println("Ingrese una altura");
                             altura=lector.nextDouble();
                             System.out.println("ingrese una profundidad");
                             profundidad=lector.nextDouble();
                      
                             volumen=altura*profundidad*longitud;
                             area=2*(altura*longitud+altura*profundidad+longitud*profundidad);
                      
                             System.out.println("El volumen es :"+volumen);
                             System.out.println("El Area es :"+area);

}
public static void Tetraedro(){
  double altura,area,volumen;
  System.out.println("Ingrese la altura del cuerpo");
  altura=lector.nextDouble();

  area=2*(altura*altura)*1.17;
  volumen=1.41/12*(altura*altura*altura);

  System.out.println("El Area del cuerpo es :"+area);
  System.out.println("El Volumen del cuerpo es :"+volumen);
}
public static void Hexaedro(){
  double altura,area,volumen;
  System.out.println("Ingrese una altura");
  altura=lector.nextDouble();

  area=6*(altura*altura);
  volumen=altura*altura*altura;

  System.out.println("El Area del cuerpo es :"+area);
  System.out.println("El Volumen del cuerpo es :"+volumen);
}
public static void Octaedro(){
  double altura,area,volumen;
  System.out.println("Ingrese una altura");
  altura=lector.nextDouble();

  area=2*(altura*altura)*Math.sqrt(3);
  volumen=Math.sqrt(2)/3*(altura*altura*altura);

  System.out.println("El Area del cuerpo es :"+area);
  System.out.println("El Volumen del cuerpo es :"+volumen);
}
public static void Dodecaedro(){
   double altura,area,volumen;
  System.out.println("Ingrese una altura");
  altura=lector.nextDouble();

  area=3*(altura*altura)*Math.sqrt(35*Math.sqrt(5));
  volumen=(1/4*15+7*Math.sqrt(5))*(altura*altura*altura);

  System.out.println("El Area del cuerpo es :"+area);
  System.out.println("El Volumen del cuerpo es :"+volumen);
}
public static void Icosaedro(){
   double altura,area,volumen;
  System.out.println("Ingrese una altura");
  altura=lector.nextDouble();

  area=5*(altura*altura)*Math.sqrt(3);
  volumen=5/12*3+Math.sqrt(5)*altura*altura*altura;

  System.out.println("El Area del cuerpo es :"+area);
  System.out.println("El Volumen del cuerpo es :"+volumen);
 }
public static void TroncodeCono(){
  double Generatris,Areabase,Radiomayor,Areamayor,radio,altura,Arealateral,volumen,Areatotal;
  System.out.println("Ingrese una generatris");   
  Generatris=lector.nextDouble();
  System.out.println("Ingrese un Radiomayor");
  Radiomayor=lector.nextDouble();
  System.out.println("Ingrese un Areabase");
  Areabase=lector.nextDouble();
  System.out.println("Ingrese un Areamayor");
  Areamayor=lector.nextDouble();
  System.out.println("Ingrese el radio");
  radio=lector.nextDouble();
  System.out.println("Ingrese una altura");
  altura=lector.nextDouble();

  Arealateral=3.14*Generatris*(Radiomayor+radio);
  Areatotal=Arealateral+Areabase+Areamayor;
  volumen=1/3*3.14*altura*(Radiomayor*Radiomayor)+(radio*radio+Radiomayor*radio);

  System.out.println("El Area lateral es:"+Arealateral);
  System.out.println("El Area total es:"+Areatotal);
  System.out.println("El Volumen es:"+volumen);
}
public static void TroncodePiramide(){
  double perimetro,perimetromayor,Areabase,Areamayor,Apotema,altura,Arealateral,Areatotal,volumen,Volumen;
  System.out.println("Ingrese un perimetrobase");   
  perimetro=lector.nextDouble();
  System.out.println("Ingrese un perimetromayor");
  perimetromayor=lector.nextDouble();
  System.out.println("Ingrese un Areabase");
  Areabase=lector.nextDouble();
  System.out.println("Ingrese un Areamayor");
  Areamayor=lector.nextDouble();
  System.out.println("Ingrese el apotema");
  Apotema=lector.nextDouble();
  System.out.println("Ingrese una altura");
  altura=lector.nextDouble();

  Arealateral=perimetro+perimetromayor/2*Apotema;
  Areatotal=Arealateral+Areabase+Areamayor;
  volumen=Math.sqrt(Areabase*Areamayor);
  Volumen=(1/3*altura)*(Areabase+Areamayor);

  System.out.println("El Area lateral es:"+Arealateral);
  System.out.println("El Area total es:"+Areatotal);
  System.out.println("El Volumen es:"+volumen+Volumen);
 }
public static void Cuñayhusoesferico(){
  double radio,numerodegrados,area,volumen;
  System.out.println("Ingrese el radio ");
  radio=lector.nextDouble();
  System.out.println("Ingrese numero de grados");
  numerodegrados=lector.nextDouble();

  area=(4*3.14)*(radio*radio)*numerodegrados/360;
  volumen=4/3*(radio*radio*radio)*numerodegrados/360;

  System.out.println("El Area es:"+area);
  System.out.println("El Volumen es:"+volumen);
}}
 
