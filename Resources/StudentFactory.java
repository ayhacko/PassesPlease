package Resources;

import Backend.Document;

import java.util.ArrayList;

public class StudentFactory {
    public static String generateName() {
        String[] names = {"Logan", "Hayden", "Cameron", "Finley", "Avery", "Arden", "Landry", "JermaJesty", "Dweezil",
                "Cricket", "Panda", "Sideral", "Raddix"
        };
        int num = (int) (Math.random()*names.length);

        return names[num];
    }

    public static String generateGrade() {
        int grade = (int) (Math.random()*3)+9;
        return grade + "";
    }

    public static String generateIDNumber() {
        String id = "";
        for (int i = 0; i < 7; i++) {
            id += (int) (Math.random() * 10);
        }
        return id;
    }

    public static String generateBirthDate() {
        int year = (int) (Math.random() * 5) + 2071;
        int month = (int) (Math.random() * 12) + 1;
        int day = (int) (Math.random() * 28) + 1;
        return year + "-" + month + "-" + day;
    }

    public static String generateHeight(){
        int height = (int) (Math.random() * 100) + 50;
        return height + "";
    }


    public static String generateWeight(){
        int weight = (int) (Math.random() * 100) + 100;
        return weight + "";
    }

    public static String generateIDExpiration(){
        int year = 2089;
        int month = (int) (Math.random() * 2) + 10;
        int day = (int) (Math.random() * 28) + 1;
        return month + "/" + day + "/" + year;
    }

    public static String generateVaccineExpiration(){
        int year = 2089;
        int month = (int) (Math.random() * 2) + 10;
        int day = (int) (Math.random() * 28) + 1;
        return month + "/" + day + "/" + year;
    }

    public static String generatePermitDay(){
        int number = (int) Math.round((Math.random()));
        return number + "";
    }

    public static ArrayList<String> generateDiseases(){
        ArrayList<String> diseases = new ArrayList<String>();
        int number = 0;

        for(int i = 0; i<3; i++){
            number = (int) (Math.random()*5)+1;
            if(number == 1){
                if(i == 0){
                    diseases.add("Bogovirus");
                }else if(i == 1){
                    diseases.add("Yumyum");
                }else{
                    diseases.add("Mad Cow Disease");
                }
            }
        }
        return diseases;
    }
}
