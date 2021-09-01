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
public class Fresher extends Candidate{
    private int graduationDate;
    private String graduationRank;
    private String Education;

    public Fresher() {
    }

    public Fresher(int graduationDate, String graduationRank, String Education, 
                   int ID, String firstName, String lastName, int birthDate, String address, String phone, String email, int type) {
        super(ID, firstName, lastName, birthDate, address, phone, email, type);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.Education = Education;
    }

    public int getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(int graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    public String getEducation() {
        return Education;
    }

    public void setEducation(String Education) {
        this.Education = Education;
    }
    
    
    
}
