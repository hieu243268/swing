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
// mỗi thg experience kế thừa nguyên các thuộc tính của thg candidate
// nó là 1 ứng cử viên
public class Experience extends Candidate{
    private int expInYear;
    private String proSkill;

    public Experience() {
    }

    public Experience(int ID, String firstName, String lastName, int birthDate, String address, String phone, String email, int type,int expInYear, String proSkill) {
        super(ID, firstName, lastName, birthDate, address, phone, email, type);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public int getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(int expInYear) {
        this.expInYear = expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }
    
    
    
    
    
}
