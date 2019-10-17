package softwaregeometria;

import classes.Ponto;
import classes.Quadrado;
import classes.Triangulo;
import classes.Cone;
import classes.Cilindro;
import classes.Paralelepipedo;
import classes.EquacaoSegundoGrau;
import java.util.ArrayList;
import java.util.Scanner;

public class SoftwareGeometria {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList array_de_objetos = new ArrayList();
        ArrayList<Cilindro> objetos_cilindro = new ArrayList();
        ArrayList<Paralelepipedo> objetos_paralepipedo = new ArrayList();
        ArrayList<EquacaoSegundoGrau> objetos_equacaosegundograu = new ArrayList();
        Ponto p = null;
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

                                array_de_objetos.add(p = new Ponto(pos_x, pos_y));
                                break;
                            }//case 1
                            
                            
                            case 2:{
                                System.out.println("\nInformações de todos os pontos criados: ");
                                for(int i = 0; i < array_de_objetos.size(); i++){
                                    Ponto point = (Ponto)array_de_objetos.get(i);
                                    System.out.println(point.toString());
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
                                //array_de_objetos.clear();
                                array_de_objetos.add(new Quadrado(lado, p.getPosicionamentoX(), p.getPosicionamentoY()));
                                break;
                            }
                            
                            case 2:{
                                System.out.println("\n O Perimetro dos quadrados criados foram: ");
                                for(int i = 0; i < array_de_objetos.size(); i++){
                                    if(array_de_objetos.get(i) instanceof Quadrado){
                                        Quadrado quad = (Quadrado)array_de_objetos.get(i);
                                        System.out.println(quad.retornaPerimetroQuadrado());
                                    }
                                    //Ponto point = (Ponto)array_de_objetos.get(i);
                                    System.out.println("\n ---------\n");
                                }
                                
                                break;
                            }
                            
                            case 3: {
                                System.out.println("\n A area total dos quadrados criados foram: ");
                                for(int i = 0; i < array_de_objetos.size(); i ++){
                                    if(array_de_objetos.get(i) instanceof Quadrado){
                                        Quadrado area_quad = (Quadrado)array_de_objetos.get(i);
                                        System.out.println(area_quad.retornaAreaQuadrado());
                                    }
                                    //System.out.println(objetos_quadrado.get(i).retornaAreaQuadrado())
                                System.out.println("\n ---------\n");
                                }
                                break;
                            }
                            
                            case 4:{
                                System.out.println("Informações de todos os quadrados criados: ");  
                                for(int i = 0; i < array_de_objetos.size(); i ++){
                                    if(array_de_objetos.get(i) instanceof Quadrado){
                                        Quadrado all_quad = (Quadrado)array_de_objetos.get(i);
                                        System.out.println(all_quad.toString());
                                    }
                                    
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
                                
                                array_de_objetos.add(new Triangulo(base,
                                        altura,
                                        p.getPosicionamentoX(),
                                        p.getPosicionamentoY()));
                                break;
                            }
                            
                            case 2:{
                                System.out.println("Perimetro de todos os triangulos criados: \n");
                                for(int i = 0; i < array_de_objetos.size(); i++){
                                    if(array_de_objetos.get(i) instanceof Triangulo){
                                        Triangulo t = (Triangulo)array_de_objetos.get(i);
                                        System.out.println(t.retornaPerimetro());
                                    }
                                    System.out.println("\n ---- \n ");
                                }
                                
                                break;
                            }
                            
                            case 3: {
                                System.out.println("Area total de todos os triangulos criados: \n");
                                for(int i = 0; i < array_de_objetos.size(); i++){
                                    if(array_de_objetos.get(i) instanceof Triangulo){
                                        Triangulo t = (Triangulo)array_de_objetos.get(i);
                                        System.out.println(t.retornaAreaTotal());
                                    }
                                    System.out.println("\n ---- \n ");
                                }
                                
                                break;
                            }
                            
                            case 4:{
                                System.out.println("todas as informações de todos os triangulos criados: \n");
                                for(int i = 0; i < array_de_objetos.size(); i++){
                                    if(array_de_objetos.get(i) instanceof Triangulo){
                                        Triangulo t = (Triangulo)array_de_objetos.get(i);
                                        System.out.println(t.toString());
                                    }
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
                    break;
                }
                
                case 4:{ //case 4
                    int option_cone = 0;
                    while(option_cone != 7 ){
                        System.out.print("\n O que deseja fazer com a classe Cone ?\n"
                                + "[1] Criar um novo Cone \n"
                                + "[2] Visualizar o Volume \n"
                                + "[3] Visualizar a  Area da base \n" 
                                + "[4] Visualizar a Area Lateral \n" 
                                + "[5] Visualizar a Area total \n"
                                + "[6] Visualizar todas informações \n"
                                + "[7] Sair \n"
                                + "Opção: ");
                        option_cone = input.nextInt();
                        switch(option_cone){
                            case 1:{
                              System.out.print("\n Digite um valor para raio: ");
                                float raio = input.nextFloat(); 
                              System.out.print("\n Digite um valor para altura: ");
                                float altura = input.nextFloat();
                              System.out.print("\n Digite um valor para geratriz: ");
                                float base = input.nextFloat();
                                array_de_objetos.add(new Cone(raio,
                                        altura,
                                        base,
                                        p.getPosicionamentoX(),
                                        p.getPosicionamentoY()));
                            break;
                            }
                            case 2:{
                                System.out.print("\n O volume dos cones criados é: ");
                                for(int i=0; i < array_de_objetos.size(); i++ ){
                                    if(array_de_objetos.get(i) instanceof Cone){
                                        Cone c = (Cone)array_de_objetos.get(i);
                                        System.out.println(c.retornaVolume());
                                    }                                   
                                   System.out.println("\n ---- \n ");
                               }
                            break;
                            }
                            case 3:{
                                System.out.print("\n A area da base dos cones criados é de: ");
                                for(int i=0; i< array_de_objetos.size(); i++){
                                    if(array_de_objetos.get(i) instanceof Cone){
                                        Cone c = (Cone)array_de_objetos.get(i);
                                        System.out.println(c.retornaAreaBase());
                                    }
                                    System.out.println("\n ---- \n ");
                                }
                            break;
                            }
                            case 4:{
                                System.out.print("\n A area lateral dos cones criados é de: ");
                                for(int i=0; i < array_de_objetos.size(); i++){
                                    if(array_de_objetos.get(i) instanceof  Cone){
                                        Cone c = (Cone)array_de_objetos.get(i);
                                        System.out.println(c.retornaAreaLateral());
                                    }
                                    System.out.println("\n ---- \n ");
                                }
                            break;
                            }
                            case 5:{
                                System.out.println("\n A area total dos cones criados é de: ");
                                for(int i=0; i< array_de_objetos.size(); i++){
                                    if(array_de_objetos.get(i) instanceof Cone){
                                        Cone c = (Cone)array_de_objetos.get(i);
                                        System.out.println(c.retornaAreaTotal());
                                    }
                                    System.out.println("\n ---- \n ");
                                }
                                break;
                            }
                            case 6:{
                                System.out.println("\n Todos as informações dos cones criados são: ");
                                for(int i=0; i< array_de_objetos.size(); i++){
                                    if(array_de_objetos.get(i) instanceof Cone){
                                        Cone c = (Cone)array_de_objetos.get(i);
                                        System.out.println(c.toString());
                                    }
                                    System.out.println("\n ---- \n ");
                                }
                            break;
                            }
                            case 7:{
                                try{
                                    System.out.println("Voltando... ");
                                    Thread.sleep(2500);
                                }catch(Exception error){};
                                break;
                            }
                        }
                    }
                    break;
                }  // fim case 4
                case 5:{ //case 5
                    int option_cilindro = 0;
                    while(option_cilindro != 7){
                         System.out.print("\n O que deseja fazer com a classe Cilindro ?\n"
                                + "[1] Criar um novo Cilindro \n"
                                + "[2] Visualizar o Volume \n"
                                + "[3] Visualizar a  Area da base \n" 
                                + "[4] Visualizar a Area Lateral \n" 
                                + "[5] Visualizar a Area total \n"
                                + "[6] Visualizar todas informações \n"
                                + "[7] Sair \n"
                                + "Opção: ");
                        option_cilindro = input.nextInt();
                        switch(option_cilindro){
                            case 1:{
                                System.out.print("\n Digite o valor do raio: ");
                                float raio = input.nextFloat();
                                System.out.print("\n Digite o valor da altura: ");
                                float altura = input.nextFloat();
                                Cilindro cil = new Cilindro(raio, altura);
                                 objetos_cilindro.add(cil);
                            break; 
                            }
                            case 2:{
                                System.out.println("\n O volume dos cilindros criados é: ");
                                for(int i=0; i< objetos_cilindro.size(); i++){
                                    System.out.println(objetos_cilindro.get(i).retornaVolume());
                                    System.out.println("\n ---- \n ");
                                }
                            break;
                            }
                            case 3:{
                                System.out.println("\n A area da base dos cilindros criados é: ");
                                for(int i=0; i < objetos_cilindro.size(); i++){
                                    System.out.println(objetos_cilindro.get(i).retornaAreaBase());
                                    System.out.println("\n ---- \n ");
                                }
                            break;
                            }
                            case 4:{
                                System.out.println("\n A area lateral dos cilindros criados é: ");
                                for(int i=0; i < objetos_cilindro.size();i++){
                                    System.out.println(objetos_cilindro.get(i).retornaAreaLateral());
                                    System.out.println("\n ---- \n ");
                                }
                            break;    
                            }
                            case 5:{
                                System.out.println("\n A area Total dos cilindros criados é: ");
                                for(int i=0; i < objetos_cilindro.size(); i++){
                                    System.out.println(objetos_cilindro.get(i).retornaAreaTotal());
                                    System.out.println("\n ---- \n ");
                                }
                            break;
                            }
                            case 6:{
                                System.out.println("\n Todas as informações dos cilindros criados são: ");
                                for (int i=0; i < objetos_cilindro.size(); i++){
                                    System.out.println(objetos_cilindro.get(i).toString());
                                    System.out.println("\n ---- \n ");
                                }
                            break;
                            }
                            case 7:{
                                 try{
                                    System.out.println("Voltando... ");
                                    Thread.sleep(2500);
                                }catch(Exception error){};
                                break;
                            }
                            
                        }       
                    }
                } // fim case 5
                case 6:{ // case 6
                    int option_paralelepipedo = 0;
                    while(option_paralelepipedo != 5){
                        System.out.print("\n O que deseja fazer com a classe Paralelepipedo ?\n"
                                + "[1] Criar um novo paralelepipedo \n"
                                + "[2] Visualizar o Volume \n"
                                + "[3] Visualizar a Area total \n"
                                + "[4] Visualizar todas informações \n"
                                + "[5] Sair \n"
                                + "Opção: ");
                        option_paralelepipedo = input.nextInt();
                        switch(option_paralelepipedo){
                            case 1:{
                                System.out.print("\n Digite um valor para o comprimento: ");
                                float comprimento = input.nextFloat();
                                System.out.print("\n Digite um valor para a largura: ");
                                float largura = input.nextFloat();
                                System.out.print("\n Digite um valor para a altura: ");
                                float altura = input.nextFloat();
                            Paralelepipedo parale = new Paralelepipedo(comprimento, largura, altura);
                                objetos_paralepipedo.add(parale);
                            break;
                            }
                            case 2:{
                                System.out.println("\n Os volumes dos paralelepipedos criados é: ");
                                for(int i=0; i < objetos_paralepipedo.size(); i++){
                                    System.out.println(objetos_paralepipedo.get(i).retornaVolume());
                                    System.out.println("\n ---- \n ");
                                }
                            break;
                            }
                            case 3:{
                                System.out.println("\n As Áreas totais dos paralelepipedos criados é: ");
                                for(int i=0; i < objetos_paralepipedo.size();i++){
                                    System.out.println(objetos_paralepipedo.get(i).retornaAreaTotal());
                                    System.out.println("\n ---- \n ");
                                }
                            break;
                            }
                            case 4:{
                                System.out.println("\n Todas as informações dos paralelepipedos criados são: ");
                                for(int i=0; i < objetos_paralepipedo.size(); i++){
                                    System.out.println(objetos_paralepipedo.get(i).toString());
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
                } // fim case6
                case 7:{ //case 7
                    int option_equacaosegundograu = 0;
                    while(option_equacaosegundograu != 5){
                        System.out.print("\n O que deseja fazer com a classe Equação segundo grau ?\n"
                                + "[1] Criar uma nova Equação do segundo grau \n"
                                + "[2] Visualizar a bhaskara \n"
                                + "[3] Visualizar X um \n"
                                + "[4] Visualizar X dois \n"
                                + "[5] Visualizar Todas as informações: \n"
                                + "[6] Sair \n"
                                + "Opção: ");
                        option_equacaosegundograu = input.nextInt();
                        switch(option_equacaosegundograu){
                            case 1:{
                                System.out.print("\n Digite o valor de A: ");
                                int valorA = input.nextInt();
                                System.out.print("\n Digite o valor de B: ");
                                int valorB = input.nextInt();
                                System.out.print("\n Digite o valor de C: ");
                                int valorC = input.nextInt();
                            EquacaoSegundoGrau eqsegrau = new EquacaoSegundoGrau(valorA, valorB, valorC);
                                objetos_equacaosegundograu.add(eqsegrau);
                            break;
                            }
                            case 2:{
                                System.out.println("\n Os deltas das equações de segundo grau criadas é: ");
                                for(int i=0; i < objetos_equacaosegundograu.size(); i++){
                                    System.out.println(objetos_equacaosegundograu.get(i).retornaCalcbhaskara());
                                    System.out.println("\n ---- \n ");
                                
                                }
                            break;
                            }
                            case 3:{
                                System.out.println("\n Os X um das equações de segundo grau criadas é: ");
                                for(int i=0; i < objetos_equacaosegundograu.size(); i++){
                                    System.out.println(objetos_equacaosegundograu.get(i).retornaCalcXum());
                                    System.out.println("\n ---- \n ");
                                }
                            break;
                            }
                            case 4:{
                                System.out.println("\n Os X dois das equações de segundo grau criadas é: ");
                                for(int i = 0; i < objetos_equacaosegundograu.size(); i++ ){
                                System.out.println(objetos_equacaosegundograu.get(i).retornaCalcXdois());    
                                }
                            break;    
                            }
                            case 5:{
                                System.out.println("\n Todas as informações das equações do segundo grau são: ");
                                for(int i=0; i < objetos_equacaosegundograu.size(); i++){
                                    System.out.println(objetos_equacaosegundograu.get(i).toString());
                                    System.out.println("\n ---- \n ");
                                }
                            break;
                            }
                            case 6:{
                                try{
                                    System.out.println("Voltando... ");
                                    Thread.sleep(2500);
                                }catch(Exception error){};
                                break;
                            }
                        }
                    }
                } // fim case 7
                case 8:{
                    for(int i = 0; i < array_de_objetos.size(); i++){
                        System.out.println(array_de_objetos.get(i)+"\n---------\n");
                    }
                    break;
                }
                case 9:{
                    int voltar = 0;
                     System.out.println("digite 0 para sair: ");
                     voltar = input.nextInt();
                    switch(voltar){
                        case 0:{
                            try{
                        System.out.println("Você saiu... ");
                        Thread.sleep(750);
                        }catch(Exception error){};
                        break;
                        }
                    }
                }
            }//switch option
            
        }//while
        
    }
}
