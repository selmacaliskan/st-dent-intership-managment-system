
package app;
public class Internship {
    private int internshipId;
    private int studentId;
    private String company;
    private int duration;//days

    public Internship(int internshipId,int studentId,String company,int duration){
        this.internshipId = internshipId;
        this.studentId = studentId;
        this.company = company;
        this.duration = duration;

    }
    public int getInternshipId(){ return internshipId;}
    public int getStudentId(){return studentId;}
    public String getCompany(){return company;}
    public int getDuration(){return duration;}

    @Override
    public String toString(){
        return "Internship ID:" + internshipId + ",Student ID:" +studentId +",Company:"
        + company +",Duration:"+duration +"days";
    }

}
