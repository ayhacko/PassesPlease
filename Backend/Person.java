package Backend;

import java.util.ArrayList;

public abstract class Person {
    private String imageString;
    private String name;
    private String idNumber;
    private String birthDate;
    private String height;
    private String weight;
    private String grade;
    private String idExpiration;
    private String vaccineExpiration;
    private StudentID studentID;
    private TeacherID teacherID;
    private EaglePass eaglePass;
    private MediaPass mediaPass;
    private VaccinationSupplement supplement;
    private boolean letThrough;

    public Person(String imageString, String name, String idNumber, String birthDate, String height, String weight, String grade, String idExpiration, String vaccineExpiration) {
        this.imageString = imageString;
        this.name = name;
        this.idNumber = idNumber;
        this.birthDate = birthDate;
        this.height = height;
        this.weight = weight;
        this.grade = grade;
        this.idExpiration = idExpiration;
        this.vaccineExpiration = vaccineExpiration;
        studentID = new StudentID(name, idNumber, birthDate, height, weight, grade, idExpiration,imageString);
        teacherID = new TeacherID(name, idNumber, birthDate, height, weight, idExpiration, imageString);
        eaglePass = new EaglePass(idNumber, height, weight);
        mediaPass = new MediaPass(name);
        supplement = new VaccinationSupplement(idNumber, birthDate, vaccineExpiration);
        letThrough = Math.random() >= 0.6;
    }

    public abstract ArrayList<Document> getDocuments();

    public abstract String getReason();

    public String getImageString() { return imageString; };

    public String getName() {
        return name;
    }

    public String getIDNumber() {
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

    public String getGrade() {
        return grade;
    }

    public String getIDExpiration() {
        return idExpiration;
    }

    public String getVaccineExpiration() {
        return vaccineExpiration;
    }

    public boolean letThrough() {
        return letThrough;
    }
//
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
