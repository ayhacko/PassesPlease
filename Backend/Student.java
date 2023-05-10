package Backend;

import Resources.*;

public class Student extends Person {
    public Student() {
        super(StudentFactory.generateName(), StudentFactory.generateIDNumber(), StudentFactory.generateBirthDate(), StudentFactory.generateHeight(), StudentFactory.generateWeight(), StudentFactory.generateIDExpiration(), StudentFactory.generateVaccineExpiration());
    }
}
