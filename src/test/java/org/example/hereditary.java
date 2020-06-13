package org.example;


import org.junit.Test;


//How to perform inheritance
public class hereditary extends wrapper
{   private String course;
    @Test
    public void setCourse(String course)
    {
        this.course = course;

    }

    @Test
    public String getCourse()
    {

        return course;
    }
    public static void main( String[] args )
    {
        hereditary hered = new hereditary();
        wrapper wrap = new wrapper();
        //performing polymorphism
        wrapper rap = new hereditary();
        rap.getStudent();

        wrap.setStudent("Abram Rakgotho");
        wrap.setStudentNum(215031393);
        hered.setCourse("ICT in Application development");
        System.out.println("Student:"+" " +wrap.getStudent()+"" +"\n"+"Student Number:"+wrap.getStudentNum()
        +"\n"+"Course name:"+hered.getCourse());

    }
}
