package main;
public class App {
    public static int encontre(int[] arrayOrdenado, int num){

        for (int i = 0; i < arrayOrdenado.length; i++) {
            if (arrayOrdenado[i] == num) {
                return 1;
            }
        }
        return 0;
    }

    public static int maior(int[] arrayDesordenado){

        int num2 = -99999999;
        for (int i = 0; i < arrayDesordenado.length; i++) {
           int num = arrayDesordenado[i];
           if (num2 < num){
            num2 = num;

           }
        }
        return num2;
    }

    public static Integer parMaisProximo(Integer[][] pares){
        return 1;
    }
}
