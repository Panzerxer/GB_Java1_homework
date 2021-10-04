import java.sql.SQLOutput;
import java.util.Arrays;

public class Team {

    String name;
    Player teammate1;
    Player teammate2;
    Player teammate3;
    Player teammate4;

    Player[] arr;

    public Team(String name, Player teammate1, Player teammate2, Player teammate3, Player teammate4) {
        this.name = name;
        this.teammate1 = teammate1;
        this.teammate2 = teammate2;
        this.teammate3 = teammate3;
        this.teammate4 = teammate4;
                System.out.println("Команда " + name + " создана.");
        arr = new Player[]{teammate1,teammate2,teammate3,teammate4};


    }

    void sostav() {
        System.out.println("Состав команды:");
        System.out.println("Имя: " + teammate1.name + " Возраст: " + teammate1.age + " Интеллект: " + teammate1.IQ);
        System.out.println("Имя: " + teammate2.name + " Возраст: " + teammate2.age + " Интеллект: " + teammate2.IQ);
        System.out.println("Имя: " + teammate3.name + " Возраст: " + teammate3.age + " Интеллект: " + teammate3.IQ);
        System.out.println("Имя: " + teammate4.name + " Возраст: " + teammate4.age + " Интеллект: " + teammate4.IQ);

    }

    public void result() {


    }
}
