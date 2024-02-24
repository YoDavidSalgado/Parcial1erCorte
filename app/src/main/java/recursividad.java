
public class recursividad {

    public static void main(String[] args) {

        int n = 8;
        int resultado = divisionRecursiva(n);

    }

    public static int divisionRecursiva(int numero){

        int res;

        if(numero==1){
            return 1;
        }else{
            res = divisionRecursiva(numero) / 2;
            System.out.println(res);
        }
        return res;
    }
}

