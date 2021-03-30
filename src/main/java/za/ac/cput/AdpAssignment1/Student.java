package za.ac.cput.AdpAssignment1;
/*
* @author Antin Micheal Williams
* Student number: 219212058
*/
public class Student {
    private int studNum;
    private String studName;

    public Student(){

    }
    public int getStudNum() {
        return studNum;
    }

    public String getStudName() {
        return studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public void setStudNum(int studNum) {
        this.studNum = studNum;
    }

    @Override
    public String toString() {
        return "Student{\nstudName = "+studName+"\nstudNum = "+studNum+"}";
    }
}
