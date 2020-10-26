package Ejercicios_clase.act7_procesosjavadesdeotrosprocesosjavaenviardatos;

public class Suma {

    public static void main(String ar[])
    {
        int x,y,s;

        x=Integer.parseInt(ar[0]);
        y=Integer.parseInt(ar[1]);

        s=x+y;
        System.out.println("suma de " + x + " y " + y +" : " +s);
    }
}
