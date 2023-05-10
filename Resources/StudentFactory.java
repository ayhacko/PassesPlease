package Resources;

import Backend.Document;

import java.util.ArrayList;

public class StudentFactory {
    public static String generateName() {
        return "";
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
        int height = (int) (Math.random() * 100) + 100;
        return height + "";
    }


    public static String generateWeight(){
        int weight = (int) (Math.random() * 100) + 100;
        return weight + "";
    }

    public static String idExpiration(){
        int year = 2089;
        int month = (int) (Math.random() * 5) + 8;
        int day = (int) (Math.random() * 28) + 1;
        return year + "-" + month + "-" + day;
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


    public static ArrayList<Document> generateDocument(){
        ArrayList<Document> document = new ArrayList<Document>();
        int number = 0;

        for(int i = 0; i<4; i++){
            number = (int) (Math.random()*1)+1;
            if(number == 1){
                if(i == 0){

                }else if(i == 1){

                }else if(i == 2){

                }else{

                }
            }
        }

        return document;

    }
}
