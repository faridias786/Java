package head.first;
public class Player {
    int number;
    public void guess(){
        number=(int)(Math.random()*10);
        System.out.println("I am Guessing " + number);
    }
}
