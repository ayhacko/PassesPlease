package Backend;

public class VaccinationSupplement extends Document {
    private String idNumber;
    private String birthDate;
    private String vaccineExpiration;

    public VaccinationSupplement(String idNumber, String birthDate, String vaccineExpiration) {
        this.idNumber = idNumber;
        this.birthDate = birthDate;
        this.vaccineExpiration = vaccineExpiration;
    }

    public void messUpIDNumber() {
        String temp = idNumber;
        int typoPlacement = (int) (Math.random() * idNumber.length());
        while (temp.equals(idNumber)) {
            temp = "";
            for (int i = 0; i < 7; i++) {
                if (i == typoPlacement)
                    temp += (int) (Math.random() * 10);
                else
                    temp += idNumber.substring(i, i+1);
            }
        }
        idNumber = temp;
    }

    public void messUpBirthDate() {
        String temp = birthDate;
        while (temp.equals(birthDate)) {
            int year = (int) (Math.random() * 5) + 2071;
            int month = (int) (Math.random() * 12) + 1;
            int day = (int) (Math.random() * 28) + 1;
            temp = year + "-" + month + "-" + day;
        }
        birthDate = temp;
    }

    public void messUpVaccineExpiration() {
        int year = 89;
        int month = 8;
        int day = (int) (Math.random() * 28) + 1;
        vaccineExpiration = month + "-" + day + "-" + year;
    }

    public String getIDNumber() {
        return idNumber;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getVaccineExpiration() {
        return vaccineExpiration;
    }
}
