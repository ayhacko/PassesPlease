package Backend;

import java.util.ArrayList;

public abstract class Person {
    private String name;
    private String idNumber;
    private String birthDate;
    private String height;
    private String weight;
    private String idExpiration;
    private String passDay;
    private String permitDay;
    private String vaccineExpiration;
    private StudentID studentID;
    private TeacherID teacherID;
    private EaglePass eaglePass;
    private MediaPass mediaPass;
    private VaccinationSupplement supplement;
    private boolean letThrough;

    public Person(String name, String idNumber, String birthDate, String height, String weight, String idExpiration, String vaccineExpiration) {
        studentID = new StudentID(name, idNumber, birthDate, height, weight, idExpiration, vaccineExpiration);
        teacherID = new TeacherID(name, idNumber, birthDate, height, weight, idExpiration, vaccineExpiration);
        eaglePass = new EaglePass(name, idNumber, birthDate, height, weight, idExpiration, vaccineExpiration);
        mediaPass = new MediaPass(name, idNumber, birthDate, height, weight, idExpiration, vaccineExpiration);
        supplement = new VaccinationSupplement(name, idNumber, birthDate, height, weight, idExpiration, vaccineExpiration);
        letThrough = Math.random() >= 0.33;
    }

    public String getName() {
        return name;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getHeight() {
        return height;
    }

    public String getWeight() {
        return weight;
    }

    public String getIdExpiration() {
        return idExpiration;
    }

    public String getPassDay() {
        return passDay;
    }

    public String getPermitDay() {
        return permitDay;
    }

    public String getVaccineExpiration() {
        return vaccineExpiration;
    }

    public boolean letThrough() {
        return letThrough;
    }

    public void setLetThrough(boolean letThrough) {
        this.letThrough = letThrough;
    }

    public StudentID getStudentID() {
        return studentID;
    }

    public void setStudentID(StudentID studentID) {
        this.studentID = studentID;
    }

    public TeacherID getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(TeacherID teacherID) {
        this.teacherID = teacherID;
    }

    public EaglePass getEaglePass() {
        return eaglePass;
    }

    public void setEaglePass(EaglePass eaglePass) {
        this.eaglePass = eaglePass;
    }

    public MediaPass getMediaPass() {
        return mediaPass;
    }

    public void setMediaPass(MediaPass mediaPass) {
        this.mediaPass = mediaPass;
    }

    public VaccinationSupplement getSupplement() {
        return supplement;
    }

    public void setSupplement(VaccinationSupplement supplement) {
        this.supplement = supplement;
    }
}
