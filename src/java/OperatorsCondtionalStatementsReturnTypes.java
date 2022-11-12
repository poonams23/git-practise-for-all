public class OperatorsCondtionalStatementsReturnTypes {


    public static void main(String[] args) {

        int variable1 = 10;
        int variable2 = 30;
        int variable3 = 10;

//        datatype  variableNmae operator

        String name="Hello";
        String name2="test";
        String name3="test";

        char charName = 'c';

        Boolean booleanVariable = true;
        Boolean booleanVariable2 = false;

        /* if loop samples */

        if ( variable1 > 5){
            System.out.println("variable1 > 5");
        }
        else if(variable1== 5){
            System.out.println("variable1 == 5");
        }
        else {
            System.out.println("variable1 < 5");
        }


        /*for loop */
        /*for(intializing ; condition ; increment or decrement )
        * i=i+1*/
        for(int i=0 ; i< 5 ; i++){
            System.out.println(i);
        }

        System.out.println("/*while loop*/");

        /*while loop*/

        while(variable3 > 5){
            System.out.println(variable3);
            variable3 =variable3 - 1;

        }


    }
}
