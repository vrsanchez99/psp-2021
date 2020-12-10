package Ejercicios_clase.UT2_Programacion_Multihilo.a3_comunicacion_y_sincronizacion_hilos.act1_exclusionmutua_regioncritica.cuenta_bancaria;

public class Cuenta {

    private int saldo;
    private int saldoMax;

    public Cuenta(int saldo, int saldoMax){
        this.saldo = saldo;
        this.saldoMax = saldoMax;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldoMax() {
        return saldoMax;
    }

    public void setSaldoMax(int saldoMax) {
        this.saldoMax = saldoMax;
    }

    /**
     *
     * @param saldo
     */
    public void hacerIngreso(int saldo){

        if(!(saldo<0)) {
            if ((this.saldo += saldo) > this.saldoMax) {

                System.err.println("ERROR. EL INGRESO SUPERA EL SALDO MÁXIMO AUTORIZADO.");

            } else {
                System.out.println("SE VA A INGRESAR SALDO (ACTUAL ES "+this.saldo+")\n" +
                        "");
                this.saldo+=saldo;
            }

        } else {
            System.err.println("ERROR. INTENTE DE NUEVO EL INGRESO.");

        }


    }

    /**
     *
     * @param saldo
     */
    public void hacerReintegro(int saldo){

        if((saldo < 0)){

            if ((this.saldo -= saldo) < 0) {

                System.err.println("ERROR. EL REINTEGRO SUPERA LA CANTIDAD DISPONIBLE EN LA CUENTA.");

            } else {
                System.out.println("SE HA REALIZADO UN REINTEGRO DE "+saldo);
                this.saldo-=saldo;
            }


        }


    }




}
