/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package candidates;

/**
 *
 * @author DELL
 */
public class Intern extends Candidate{
    private String major;
    private int semester;
    private String university;

    public Intern() {
    }

    public Intern(String major, int semester, String university, int ID, String firstName, String lastName, int birthDate, String address, String phone, String email, int type) {
        super(ID, firstName, lastName, birthDate, address, phone, email, type);
        this.major = major;
        this.semester = semester;
        this.university = university;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

           
}
