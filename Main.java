import java.util.ArrayList;
import java.util.Collections;

public class main {
    public static void main(String[] args) {


        String[] list = new String[]{"word", "hello", "party", "peace", "Greace", "prototype", "elephant", "word", "batman", "silence", "party"};
        ArrayList unicList = new ArrayList();

//вывод уникальных слов
        for (int i = 0; i < list.length; i++) {
            if (!unicList.contains(list[i])){
                unicList.add(list[i]);
            }
        }System.out.println(unicList);

        //счет слов
        for (int i = 0; i < unicList.size(); i++){
            int count = 0;
            for (int j = 0; j < list.length; j++){

                if (list[j] == unicList.get(i)){
                    count++;

                }
            }System.out.println(unicList.get(i) +" "+ count + "раз(а)");
        }

        ArrayList<Employee> phonebook = new ArrayList<>();
        phonebook.add(new Employee(23232, "White"));
        phonebook.add(new Employee(23233, "Green"));
        phonebook.add(new Employee(23234, "Brown"));
        phonebook.add(new Employee(23235, "Green"));


       for (Employee employee: phonebook){
          if (employee.getSurname().equals("Green")) {
              System.out.println(employee.getPhone());
          }
       }


    }

}


