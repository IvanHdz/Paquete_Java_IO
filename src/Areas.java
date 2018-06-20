/**
 *
 * @author Ivan
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Areas{
    private final InputStreamReader isr;
    private final BufferedReader br;
    private int ioPcn;
    private Double d, base, altura, baseMenor, radio;
    private Boolean radioOpcion = false;
    
    public Areas(){
        isr = new InputStreamReader(System.in);
        br = new BufferedReader(isr);
        ioPcn = -1;
        calculoAreas();       
    }
   
    private void calculoAreas(){
          do{
          try{
               System.out.println("-----------------------------------");
               System.out.println(" 1. Calcular el area de un triangulo");
               System.out.println(" 2. Calcular el area de un trapecio");
               System.out.println(" 3. Calcular el volumen de una esfera");
               System.out.println(" 0. Terminar");
               System.out.println("-----------------------------------");
               System.out.print("Teclea el número de la opción que desees: ");
               ioPcn = Integer.parseInt( br.readLine() );              
               System.out.println("\n*----------------------------------------------*");

          switch ( ioPcn ){
               case 1: // Calcular el area de un triangulo
                    System.out.println("* CÁLCULO DEL AREA DE UN TRIANGULO *");
                    System.out.println("*----------------------------------------------*");
                    System.out.print("Valor de la base: ");
                    d = new Double( br.readLine() );
                    
                    base = d;
               
                    System.out.print("Valor de la altura: ");
                    d = new Double( br.readLine() );
                    
                    altura = d;
                    
                    System.out.println("El área del triangulo es: " +
                    //Base x Altura / 2        
                    (( base * altura ) / 2 ));
               break;

               case 2: // Calcular el area de un trapecio
                    System.out.println("* CÁLCULO DEL AREA DE UN TRAPECIO *");
                    System.out.println("*----------------------------------------------*");
                    System.out.print("Valor de la base mayor: ");
                    d = new Double( br.readLine() );
                    base = d;
                    
                    System.out.print("Valor de la base menor: ");
                    d = new Double( br.readLine() );
                    baseMenor = d;
                    
                    System.out.print("Valor de la altura: ");
                    d = new Double( br.readLine() );
                    altura = d;
               
                    System.out.println("El área del trapecio es: " +
                    //Base Mayor + Base Menor x Altura / 2
                    ((( base + baseMenor ) * altura ) / 2 ));
               break;

               case 3: // Calcular el area de una esfera
                    System.out.println("* CÁLCULO DEL VOLUMEN DE UNA ESFERA *");
                    System.out.println("*----------------------------------------------*");
                    do{
                        System.out.print("Teclea el valor del radio: ");
                        d = new Double( br.readLine() );
                        radio = d;
                    
                        if ( radio <= 0 ){
                            System.out.println( "El radio no puede ser igual o menor a cero" );

                        }else{
                            radioOpcion = true;
                        }
                    }while( radioOpcion != true );                    
                        System.out.println("El área de la esfera es: " +
                        //( 3 x PI x r^3 / 4 )
                        ( 3 * 3.14159 * Math.pow( radio , 3 ) / 4 ));
               break;

               case 0:
                    System.out.println("*----------------------------------------*");
                    System.out.println("* Gracias por utilizar este programa! *");
                    System.out.println("*----------------------------------------*");
                    System.exit(0);
               return;

              default:
                  System.out.println("Opcion no valida...");
                  break;

          } // fin del switch

            System.out.println("*----------------------------------------------*\n\n");
            System.out.println("Presiona Enter para continuar...");
            br.readLine();
            System.out.println("*----------------------------------------------*\n\n");
        } // fin del try
        catch( IOException ex ){
            System.out.println("\n\n\n");
            System.out.println( "--o--o--o--o--o--o--o--o--o--");
            System.out.println( "- Error! Numero incorrecto -");
            System.out.println( "--o--o-A-o--o--o--o--o--o--o--");
            System.out.println("\n\n\n");
        }     catch (NumberFormatException ex) {
            System.out.println("\n\n\n");
            System.out.println( "--o--o--o--o--o--o--o--o--o--");
            System.out.println( "- Error! Numero incorrecto -");
            System.out.println( "--o--o-A-o--o--o--o--o--o--o--");
            System.out.println("\n\n\n");
              } // fin del catch
               // fin del catch        
    }while( ioPcn != 0 );
  }
} // fin de la clase