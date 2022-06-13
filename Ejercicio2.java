public class Ejercicio2 {

    public static int MCD(int num1, int num2){

        int mcd;

        if(num1 == num2){
            mcd = num1;
        }else{
            if(num2 > num1){
                mcd = MCD(num1, num2-num1);
            }else{
                mcd = MCD(num1-num2, num2);
            }
        }
        
        return mcd;

    }
    
}
