
package pkgwhile;

/**
 * @author: Veysel Dogan 
 * Date: 07-Aug-2018
 * Console Application: While//Do While
 * Main Class
 */

public class While {

    /*
    while(boolean condition){
        <Block of statements>;
    }
     */

    public static void main(String[] args) {
        int number = 1;
        while (number < 8) {
            System.out.println("Result" + number);//From 1 to 8 will print the results, not including 8
            number++;

        }
        int j = 10;
        int k = 20;

        while (++j < --k);
        System.out.println("Number j :" + j + "\n Number k :" + k);//number j increase adn number k decrease until equal

        /*
            do{
             <Block of statements>;
            }while(boolean condition);
         */
        int number1 = 1;
        do {
            System.out.println("Result : " + number1);
            number1++;
        } while (number1 < 9);

    }

}
