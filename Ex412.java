//Mohamed Camara
//DBE

//Ex 4.1.2 object hello world

public class Ex412{

    public void HelloWorld() {
        System.out.println("Hello world");
    }
    //methode objet 2
    public void m(Ex412 odeux) {
        odeux.HelloWorld();
    }


public static void main(String[] args) {
        //apell de objet 2
        Ex412 o2 = new Ex412();
        Ex412 o1 = new Ex412();

        o1.m(o2);
    }
}
