
public class lista1 {
    
    public static void main (String[] args){
        /* Questão 1
        int   i = 150;
        while(i<=300){
            System.out.println(i);
            i = i + 1;
        }*/


        /* Questão 2
        int i = 1;
        int resultado = 0;
        while(i<=1000){
            resultado = resultado + i;
            i = i + 1;
        }
        System.out.println(resultado);
        
        */

         /*Questão 3 
        for(int i = 3; i <= 100; i+=3){
            System.out.println(i);
        }*/


        /* Questão 4 
        int resultado = 1;
        System.out.println(resultado);
        for(int i = 1; i <= 9; i++){
            resultado = resultado*(i+1);
            System.out.println(resultado);
        }*/





        /* 
        //Questão 5
        // Fatorial até 10
        System.out.println("Fatoriais até 10!");
        long resultado = 1;
        System.out.println(resultado);
        for(int i = 1; i <= 9; i++){
            resultado = resultado*(i+1);
            System.out.println(resultado);
        }
        System.out.println("_____________________\n\n");


        // Fatorial até 20
        System.out.println("Fatoriais até 20!");
        resultado = 1;
        System.out.println(resultado);
        for(int i = 1; i <= 19; i++){
            resultado = resultado*(i+1);
            System.out.println(resultado);
        }
        System.out.println("_____________________\n\n");

        
        // Fatorial até 30
        System.out.println("Fatoriais até 30!");
        resultado = 1;
        System.out.println(resultado);
        for(int i = 1; i <= 29; i++){
            resultado = resultado*(i+1);
            System.out.println(resultado);
        }
        System.out.println("_____________________\n\n");
        //*/ 


        //Questão 6
        /* 
        int primeiro = 0;
        int segundo = 1;
        System.out.println(primeiro);
        System.out.println(segundo);
        int atual = primeiro + segundo;
        System.out.println(atual);
        while(atual <= 100){
            primeiro = segundo;
            segundo = atual;
            atual = primeiro + segundo;
            System.out.println(atual);
        }
        */

        

        // Questão 7
        /* 
        int cima = 1;
        int baixo = 1;
        float resultado = 0;
        
        while(cima <= 99){
            while(baixo <= 50){
                resultado += (cima/baixo);
                cima += 2;
                baixo += 1;
            }
        }
        System.out.println(cima);
        System.out.println(baixo);
        System.out.println(resultado);
        */
        

        // Questão 8
        /* 
        int x = 22;
        while(x != 1){
            if((x % 2) == 0){
                x = x / 2;
            }else{
                x = 3 * x + 1;
            }
            System.out.println(x);
        }*/




        // Questão 9
        /* 
        for(int i = 1; i <= 4; i++){
            System.out.print(i+" ");
            for(int j = 2; j <= i; j++){
                System.out.print(i*j+" ");
            }
           System.out.println("");
        }*/


        // Questão 10
        /* 
        for(int a = 1000; a <= 9999; a++){
            int doisPrimeiros = a / 100;
            int doisUltimos = a % 100;
            if((doisPrimeiros + doisUltimos) * (doisPrimeiros + doisUltimos) == a){
                System.out.println(a);
            }
        }*/
        




        





}
}

    
        
    

    

