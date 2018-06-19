package cl.vicentepc.pairandodd;

public class PairOddCalculator {

    private PairOddCallBack callback;

    public PairOddCalculator() {
    }

    public PairOddCalculator(PairOddCallBack callback) {
        this.callback = callback;
    }

    public void calculation(String value){

        if(Integer.parseInt(value) %2 == 0){

            callback.pair("El valor: " + value + ", es par");


        } else if(Integer.parseInt(value) %2 != 0){

            callback.odd("El valor: " + value + ", es impar");

        }else{

            callback.blankInput();

        }

    }

}
