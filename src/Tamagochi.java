import java.util.ArrayList;
import java.util.Random;

public class Tamagochi {
    private int hunger;
    private int boredom;
    private ArrayList<String> words = new ArrayList<>();
    private boolean isAlive;
    private Random rand = new Random();
    public String name;


    public void tick(){
        hunger ++;
        boredom ++;
        if (hunger == 10 && boredom == 10){
            isAlive = false;
        }
        //ökar hunger och boredom, och om någon av dem kommer över 10 så blir isAlive false.
    }
    public void feed(){
        hunger --;

        //sänk hunger
    }
    public void speak(){
        //skriver ut ett slumpat ord från words, och anropar reduceBoredom
    }
    public void teach(String word){
        //lägger till ett ord i words, och anropar reduceBoredom
    }
    public void printStats(){
        //skriver ut nuvarande hunger och boredom, och meddelar också huruvida tamagotchin lever.
    }

    public void getAlive(){
        //returnerar värdet som isAlive har.
    }
    private void reduceBoredom(){
       boredom --;
        // sänker boredom.
    }




}
