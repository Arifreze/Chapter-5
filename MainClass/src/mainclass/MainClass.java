
package mainclass;

public class MainClass {//nama class

    
    public static void main(String[] args) {//main
        //classname //object
        gradebook myGradeBook =new gradebook();//utk setup class dgn objek
        myGradeBook.displayMessage();//baca objek duluu
        //classname   //method
        listname myListname =new listname();//utk setup class dgn objek
        myListname.listNameBook();//= method
        
        Joption displaycantik = new Joption();
        displaycantik.cutedispl();
        
        findmaxmin maxminfinder = new findmaxmin();
        maxminfinder.pencarian();
        
        oddevennum oddevenfinder = new oddevennum();
        oddevenfinder.mencari();
        }
    }
    

