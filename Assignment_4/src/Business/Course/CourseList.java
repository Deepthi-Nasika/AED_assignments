/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Course;

import Business.Course.Course;
import java.util.ArrayList;

/**
 *
 * @author nasik
 */
public class CourseList {
    private ArrayList<Course> courseList;

   
    public CourseList() {
        this.courseList = new ArrayList<>();
    }

    public ArrayList<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(ArrayList<Course> CourseList) {
        this.courseList = CourseList;
    }
    
    public Course addNewCourse(){
        Course newCourse = new Course();
        courseList.add(newCourse);
        return newCourse;
    }
    
    public void deleteCourse(Course course){
        courseList.remove(course);
    }
}
