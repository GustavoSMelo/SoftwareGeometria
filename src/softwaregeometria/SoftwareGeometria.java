package softwaregeometria;

import classes.Ponto;
import classes.Quadrado;
import classes.Triangulo;
import java.util.ArrayList;
import java.util.Scanner;

public class SoftwareGeometria {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Ponto> objetos_pontos = new ArrayList();
        ArrayList<Quadrado> objetos_quadrado = new ArrayList();
        ArrayList<Triangulo> objetos_triangulo = new ArrayList();
        
        System.out.println("========== Software Geometria ========== ");
        int option = 0;
                
        while(option != 9){
            System.out.print("\nDigite a opção que deseja: \n"
                    + "[1] Ponto \n"
                    + "[2] Quadrado \n"
                    + "[3] Triangulo \n"
                    + "[4] Cone \n"
                    + "[5] Cilindro \n"
                    + "[6] Paralelepipedo \n"
                    + "[7] Equação do segundo grau \n"
                    + "[8] Visualizar todos \n"
                    + "[9] Sair \n"
                    + "Opção: ");
            option = input.nextInt();
            
            
            switch(option){
                case 1:{
                    int option_point = 0;
                    while(option_point != 3){
                        System.out.println("\n============================= \n ");
                        System.out.print("O que deseja fazer com a classe ponto \n"
                                + "[1] Criar um novo ponto \n"
                                + "[2] Visualizar ponto \n"
                                + "[3] Voltar \n"
                                + "Opção: ");
                        option_point = input.nextInt();
                        switch(option_point){
                            case 1:{
                                System.out.println("\nDigite a posição X do ponto: ");
                                float pos_x = input.nextFloat();

                                System.out.println("\nDigite a posição Y do ponto: ");
                                float pos_y = input.nextFloat();

                                Ponto p = new Ponto(pos_x, pos_y);
                                objetos_pontos.add(p);
                                break;
                            }//case 1
                            
                            
                            case 2:{
                                System.out.println("\nInformações de todos os pontos criados: ");
                                for(int i = 0; i < objetos_pontos.size(); i++){  
                                    System.out.println(objetos_pontos.get(i).toString());
                                    System.out.println("\n---\n");
                                }
                                
                                break;
                                
                            }  
                            
                            case 3:{
                               try{
                                   System.out.println("Voltando... ");
                                   Thread.sleep(2500);
                               }
                               catch(Exception error){}
                               break;
                            }
                        }//switch option_point
                    }//while
                    break;
                }//case 1
                
                case 2:{
                    
                    int option_quad = 0;
                    while(option_quad != 5){
                        System.out.print("\nO que você deseja fazer com a classe quadrado?\n"
                                + "[1] Criar quadrado \n"
                                + "[2] Visualizar perimetro dos quadrados registrados \n"
                                + "[3] Visualizar a area dos quadrados registrados \n"
                                + "[4] Visualizar tudo \n"
                                + "[5] Sair \n"
                                + "Opção: ");
                        
                        option_quad = input.nextInt();
                        
                        switch(option_quad){
                            case 1:{
                                System.out.print("\nDigite tamanho do lado do quadrado: ");
                                float lado = input.nextFloat();
                                
                                Quadrado quad = new Quadrado(lado);
                                objetos_quadrado.add(quad);
                                break;
                            }
                            
                            case 2:{
                                System.out.println("\n O Perimetro dos quadrados criados foram: ");
                                for(int i = 0; i < objetos_quadrado.size(); i++){     
                                    System.out.println(objetos_quadrado.get(i).retornaPerimetroQuadrado());
                                    System.out.println("\n ---------\n");
                                }
                                
                                break;
                            }
                            
                            case 3: {
                                System.out.println("\n A area total dos quadrados criados foram: ");
                                for(int i = 0; i < objetos_quadrado.size(); i ++){
                                    System.out.println(objetos_quadrado.get(i).retornaAreaQuadrado());
                                System.out.println("\n ---------\n");
                                }
                                break;
                            }
                            
                            case 4:{
                                System.out.println("Informações de todos os quadrados criados: ");  
                                for(int i = 0; i < objetos_quadrado.size(); i ++){
                                                                      
                                    System.out.println(objetos_quadrado.get(i).toString());
                                    System.out.println("\n-----\n");
                                }
                                
                                break;
                            }
                            
                            case 5:{
                                try{
                                    System.out.println("Voltando... ");
                                    Thread.sleep(2500);
                                }catch(Exception Error){};
                                break;
                            }//case 5
                            
                            
                        }//switch option quad
                        
                    }//while option quad
                   
                    
                    break;
                }//case 2
                
                case 3:{
                    int option_triangulo = 0;
                    while(option_triangulo != 5){
                        System.out.print("\nO que deseja fazer com a classe triangulo ?\n"
                                + "[1] Criar um novo triangulo\n"
                                + "[2] Visualizar perimetro \n"
                                + "[3] Visualizar area total \n"
                                + "[4] Visualizar todas as informações \n"
                                + "[5] Sair \n"
                                + "Opção: ");
                        option_triangulo = input.nextInt();
                        
                        switch(option_triangulo){
                            case 1:{
                                System.out.print("\n Digite a base do triangulo: ");
                                float base = input.nextFloat();
                                
                                System.out.print("\nDigite a altura do triangulo: ");
                                float altura = input.nextFloat();
                                
                                Triangulo t = new Triangulo();
                                objetos_triangulo.add(t);
                                
                                break;
                            }
                            
                            case 2:{
                                System.out.println("Perimetro de todos os triangulos criados: \n");
                                for(int i = 0; i < objetos_triangulo.size(); i++){
                                    System.out.println(objetos_triangulo.get(i).retornaPerimetro());
                                    System.out.println("\n ---- \n ");
                                }
                                
                                break;
                            }
                            
                            case 3: {
                                System.out.println("Area total de todos os triangulos criados: \n");
                                for(int i = 0; i < objetos_triangulo.size(); i++){
                                    System.out.println(objetos_triangulo.get(i).retornaAreaTotal());
                                    System.out.println("\n ---- \n ");
                                }
                                
                                break;
                            }
                            
                            case 4:{
                                System.out.println("todas as informações de todos os triangulos criados: \n");
                                for(int i = 0; i < objetos_triangulo.size(); i++){
                                    System.out.println(objetos_triangulo.get(i).toString());
                                    System.out.println("\n ---- \n ");
                                }
                                
                                break;
                            }
                            
                            case 5:{
                                try{
                                    System.out.println("Voltando... ");
                                    Thread.sleep(2500);
                                }catch(Exception error){};
                                
                                break;
                            }
                        }
                    }
                }
                
            }//switch option
        }//while
        
    }
}
