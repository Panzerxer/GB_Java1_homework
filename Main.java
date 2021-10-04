public class Main {
    public static void main(String[] args) {
    Player player1 = new Player("Саня", 10, 60);
    Player player2 = new Player("Толик", 22, 10);
    Player player3 = new Player("Вася", 31, 92);
    Player player4 = new Player("Игорь", 54, 130);
   Team team = new Team("игруны", player1, player2, player3, player4); // создайте команду
   team.sostav();
        Course c = new Course(10,10, 50); //укажите сложность заданий



        if(player1.IQ > c.a){
            if(player1.IQ > c.b){
                if(player1.IQ > c.c){
                    System.out.println(player1.name + " Прошёл тесты");
                } else {System.out.println(player1.name + " не прошёл тесты");}
            } else {System.out.println(player1.name + " не прошёл тесты");}
        } else {System.out.println(player1.name + " не прошёл тесты");}
        if(player2.IQ > c.a){
            if(player2.IQ > c.b){
                if(player2.IQ > c.c){
                    System.out.println(player2.name + " Прошёл тесты");
                } else {System.out.println(player2.name + " не прошёл тесты");}
            } else {System.out.println(player2.name + " не прошёл тесты");}
        } else {System.out.println(player2.name + " не прошёл тесты");}
        if(player3.IQ > c.a){
            if(player3.IQ > c.b){
                if(player3.IQ > c.c){
                    System.out.println(player3.name + " Прошёл тесты");
                }else {System.out.println(player3.name + " не прошёл тесты");}
            }else {System.out.println(player3.name + " не прошёл тесты");}
        }else {System.out.println(player3.name + " не прошёл тесты");}
        if(player4.IQ > c.a){
            if(player4.IQ > c.b){
                if(player4.IQ > c.c){
                    System.out.println(player4.name + " Прошёл тесты");
                } else {System.out.println(player4.name + " не прошёл тесты");}
            } else {System.out.println(player4.name + " не прошёл тесты");}
        } else {System.out.println(player4.name + " не прошёл тесты");}

    }

}