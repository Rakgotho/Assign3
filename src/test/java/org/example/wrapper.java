package org.example;

import org.junit.Test;

//How to perform encapsulation
public class wrapper {

    private String student;
    private int studentNum;
    @Test
    public void setStudent(String name)
    {
        this.student=name;
    }
    @Test
    public void setStudentNum(int studentNum)
    {
        this.studentNum=studentNum;
    }
    @Test
    public String getStudent()
    {
        return student;

    }
    @Test
    public int getStudentNum()
    {
        return studentNum;
    }
    @Test
    public static void main( String[] args )
    {

        wrapper wrap = new wrapper();
        wrap.setStudent("Abram Rakgotho");
        wrap.setStudentNum(215031393);
        System.out.println("Student:"+" " +wrap.getStudent()+"" +"\n"+"Student Number:"+wrap.getStudentNum());
    }


}
