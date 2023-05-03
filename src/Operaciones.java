public class Operaciones {
    //SUMAS
    public int sumar (int a,int b){
        return a + b;
    }

    public double sumar (double a,double b){
        return a + b;
    }

    public float sumar (float a,float b){
        return a + b;
    }

    public String sumar (String a,String b){
        return a + b;
    }

    //RESTA
    public int resta (int a,int b){
        return a - b;
    }

    public double resta (double a,double b){
        return a - b;
    }

    public float resta (float a,float b){
        return a - b;
    }

    public String resta (String a,String b){
        return a.replace(b,"");
    }

    //MULTIPLICACION
    public int multiplicacion (int a,int b){
        return a * b;
    }

    public double multiplicacion (double a,double b){
        return a * b;
    }

    public float multiplicacion (float a,float b){
        return a * b;
    }

    public String multiplicacion (String a,int b){
        String repetido = "";

        for (int i = 0; i < b; i++) {
            repetido += a;
        }
        return repetido;
    }

    //DIVISION
    public int division (int a,int b){
        return a / b;
    }

    public double division (double a,double b){
        return a / b;
    }

    public float division (float a,float b){
        return a / b;
    }

    public String division (String a,String  b){
        double n1,n2,resultado;
        String res;

        n1 = Double.parseDouble(a);
        n2 = Double.parseDouble(b);
        resultado = n1/n2;

        res = String.valueOf(resultado);

        return res;
    }
}
