/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package candidates;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class Main {

    public static void main(String[] args) {
        Validate validate = new Validate();
        CandidateManagement C = new CandidateManagement();

        //loop until user want to exit
//        candidates.add(new Experience(99, "code", "1", "Pham Ngoc", "Hoa", 1991,
//                "Ninh Binh", "0968038714", "hoapnse05740", 0));
//        candidates.add(new Fresher("2000", "good", "2", "Đo Quang", "Hiep",
//                1995, "Ha Noi", "0984481349", "thaycacac@gmail.com", 1));
//        candidates.add(new Internship("PRJ311", "Spring", "FPT University",
//                "2", "Nguyen Xuan", "Cuong", 2018, "Ha Noi", "0986246813",
//                "thaycacacoficial@gmail.com", 2));
        while (true) {
            System.out.println("===============================");
            System.out.println("Menu");
            System.out.println("1. Experience");
            System.out.println("2. Fresher");
            System.out.println("3. Internship");
            System.out.println("4. Searching");
            System.out.println("5. Exit");
            int choice = validate.getInt("Enter choice: ", 1, 5);
            switch (choice) {
                case 1:
                    C.addCandidate(0);
                    break;
                case 2:
                    C.addCandidate(1);
                    break;
                case 3:
                    C.addCandidate(2);
                    break;
                case 4:
                    C.search();
                    break;
                case 5:
                    return;
            }
        }
    }
}


