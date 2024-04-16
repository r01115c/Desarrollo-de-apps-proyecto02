package CEjemplo;

public class Operaciones {
    public float suma(float num1, float num2){
        float suma;
        suma = num1 + num2;
        return suma;
    }
    public float resta(float num1, float num2){
        float resta;
        resta = num1 - num2;
        return resta;
    }
    public float division(float num1, float num2){
        float division;
        division = num1 / num2;
        return division;
    }
    public float multiplicacion(float num1, float num2){
        float multiplicacion;
        multiplicacion = num1 * num2;
        return multiplicacion;
    }
    public float raizCuadrada1(float num1){
        float raizCuadrada;
        raizCuadrada = (float) Math.sqrt(num1);
        return raizCuadrada;
    }
    public float raizCuadrada2(float num2){
        float raizCuadrada;
        raizCuadrada = (float) Math.sqrt(num2);
        return raizCuadrada;
    }
    public float potencia(float num1, float num2){
        float potencia;
        potencia = (float) Math.pow(num1, num2);
        return potencia;
    }
    public float seno(float num1){
        float seno;
        seno =  (float) Math.sin(num1);
        return seno;
    }
    public float coseno(float num1){
        float coseno;
        coseno =  (float) Math.cos(num1);
        return coseno;
    }
    public float raizCubica(float num1){
        float raizCubica;
        raizCubica = (float) Math.cbrt(num1);
        return raizCubica;
    }
    public float mayorNumero(float num1, float num2){
        float mayorNumero;
        mayorNumero =  Math.max(num1, num2);
        return mayorNumero;
    }
}
