package app;

import java.util.ArrayList;
import java.util.List;

public class InternshipService {
    private List<Internship> internships = new ArrayList<>();
    public void addInternship(Internship internship){
        internships.add(internship);
        System.out.println("Internship added successfully.");
    }

    public void listInternships(){
        if(internships.isEmpty()){
            System.out.println("No internships found.");
            return;
        }
//"internships koleksiyonu içindeki her bir Internship nesnesi için"
        for(Internship i:internships){
            System.out.println(i);
        }
    }
}
