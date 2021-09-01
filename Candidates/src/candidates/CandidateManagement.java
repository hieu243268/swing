/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package candidates;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
// quản lý các ứng viên
public class CandidateManagement {

    // chứa danh sách các ứng viên
    List<Candidate> listCandidates = new ArrayList<>();
    // MUốn nhập vào từ bàn phím
    Validate validate = new Validate();
    // hàm nhập

    public int indexID(int id) {// kiểm tra id có trong danh sách hay không
        for (int i = 0; i < listCandidates.size(); i++) {
            if (listCandidates.get(i).getID() == id) {
                return i;// trả về vị trí của của id, từ vị trí có thể làm nhiều việc hoen
            }

        }
        return -1;

    }

    public void addCandidate(int type) {// thêm 1 ứng viên
        int id;
        do {// kiểm tra xem id có tồn tại hay không
            id = validate.getInt("Enter ID: ", 1, Integer.MAX_VALUE);
        } while (indexID(id) != -1);// tồn tại id thì mới khác -1, khác -1 thì nhập lại

        //nhập first name
        String firstname = validate.getString("Enter firstname: ", "[a-zA-Z ]+");

        // nhập address:
        String address = validate.getString("Enter address: ", "[a-zA-Z ]+");

        // nhập lastname:
        String lastname = validate.getString("Enter lastname: ", "[a-zA-Z ]+");

        // nhập birthdate
        int birthDate = validate.getInt("Enter birthDate", 1900, 2022);

        // nhập phone
        String phone = validate.getString("Enter Phone: ", "[0-9]+{10,}");// hoặc viết gon hơn thì "d{10,}

        // email
        String email = validate.getString("Enter email: ", "^[a-zA-Z]\\w+@(\\w+.)+(\\w+)$");// ^ là bắt đầu, $ là kết thúc
        // w bao gồm số, chữ và dấu _; \\ để phân biệt
        switch (type) {
            case 0:// 0 là experience
                // năm kinh nghiệm
                int yearofEXP = validate.getInt("Enter year of experience: ", 1, Integer.MAX_VALUE);
                String proSkill = validate.getString("Enter proskill: ", "[a-zA-Z]+");

                // tạo candidate và add condidate
                Candidate E = new Experience(id, firstname, lastname, birthDate, address, phone, email, type, yearofEXP, proSkill);
                listCandidates.add(E);
                break;

            case 1: // 1 là Fresher
                int graTime = validate.getInt("Enter Graduation Time: ", 1900, 2022);

                String rank;
                do {
                    rank = validate.getString("Enter rank: ", "[a-zA-Z]+");// dấu cộng 1 hoạc nhiều ký tự
                } while (!rank.equals("Excellence") && rank.equals("Good") && rank.equals("Poor") && rank.equals("Fair"));
                // để xét nếu khác 4 chữ này thì nhập lại.

                String education = validate.getString("Enter education: ", "[a-zA-Z ]+");
                // tạo fresher thông qua condidate
                Candidate F = new Fresher(graTime, education, education, id, firstname, lastname, birthDate, address, phone, email, type);
                listCandidates.add(F);
                break;

            case 2: // 2 là inner

                String major = validate.getString("Enter major: ", "[a-zA-Z ]+");
                int semester = validate.getInt("Enter semester: ", 1, Integer.MAX_VALUE);
                String university = validate.getString("Enter university: ", "[a-zA-Z ]+");
                //Tạo Iner thông qua Candidate
                Candidate I = new Intern(major, semester, university, id, firstname, lastname, birthDate, address, phone, email, type);
                listCandidates.add(I);
                break;
        }
    }

    public void search() {
        String inputSearch = validate.getString("Input Candidate name (First name or last name): ", "[a-zA-Z]+");
        int type = validate.getInt("Input type of candidate: ", 0, 2);
        for (Candidate c : listCandidates) {
            if (c.getType() == type) {
                String fullName = c.getFirstName() + c.getLastName();
                if (fullName.contains(inputSearch)) {
                    System.out.println(c);
                }

            }
        }
    }
    public void displayAll(){
        for(Candidate c:listCandidates){
            System.out.println(c);
        }
        
    }
}
