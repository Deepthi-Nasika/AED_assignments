/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example;

import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseCatalog.CourseCatalog;
import info5100.university.example.CourseSchedule.CourseLoad;
import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.CourseSchedule.CourseSchedule;
import info5100.university.example.CourseSchedule.SeatAssignment;
import info5100.university.example.Department.Department;
import info5100.university.example.Persona.Person;
import info5100.university.example.Persona.PersonDirectory;
import info5100.university.example.Persona.StudentDirectory;
import info5100.university.example.Persona.StudentProfile;
import info5100.university.example.Persona.Faculty.FacultyDirectory;
import info5100.university.example.Persona.Faculty.FacultyProfile;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author kal bugrara
 */
public class Info5001UniversityExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("-------------------------------------------------------");
        System.out.println("College of Engineering");
        System.out.println("-------------------------------------------------------");

        // Enter department name
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the department name: ");
        String dep = sc.nextLine();
        Department department = new Department(dep);
        PersonDirectory pd = department.getPersonDirectory();
        StudentDirectory sd = department.getStudentDirectory();
        FacultyDirectory fd = new FacultyDirectory(department);

        // Creating course catalog
        CourseCatalog coursecatalog = department.getCourseCatalog();

        Course c1 = coursecatalog.newCourse("app eng", "info 5100", 2);
        Course c2 = coursecatalog.newCourse("algos", "ds 6100", 2);
        Course c3 = coursecatalog.newCourse("sml", "ds 9820", 2);
        department.addCoreCourse(c1);
        department.addCoreCourse(c2);
        department.addCoreCourse(c3);
        Course c4 = coursecatalog.newCourse("web dev", "info 5101", 2);
        Course c5 = coursecatalog.newCourse("data management", "damg 5102", 2);
        Course c6 = coursecatalog.newCourse("data science", "damg 5103", 2);
        Course c7 = coursecatalog.newCourse("cloud computing", "info 5104", 2);
        Course c8 = coursecatalog.newCourse("career management", "encp 6000", 1);
        Course c9 = coursecatalog.newCourse("dmdd", "damg 3990", 1);
        Course c10 = coursecatalog.newCourse("software eng", "csye 3970", 1);
        department.addElectiveCourse(c4);
        department.addElectiveCourse(c5);
        department.addElectiveCourse(c6);
        department.addElectiveCourse(c7);
        department.addElectiveCourse(c8);
        department.addElectiveCourse(c9);
        department.addElectiveCourse(c10);

        System.out.println("Do you want to add course or browse the existing courses?");
        System.out.println("a) Enter 1 to Add course\nb) Enter 2 to Browse courses\nc) Enter 3 to Exit");
        while(true){
            Integer option = sc.nextInt();
            if(option == 1){
                System.out.print("-------------- Add Course --------------\n");
                System.out.print("Enter course name: ");
                sc.nextLine();
                String course_name = sc.nextLine();
                System.out.print("Enter course number: ");
                String course_num = sc.nextLine();
                System.out.print("Enter the number of credits for the course: ");
                String course_creds = sc.nextLine();
                Course course = coursecatalog.newCourse(course_name, course_num, Integer.parseInt(course_creds));

                System.out.print("a) Enter 1 if it is a Core course\nb) Enter 2 if it is an elective course\n");
                Integer course_type = sc.nextInt();
                if(course_type == 1){
                    department.addCoreCourse(course);
                }
                else if(course_type == 2){
                    department.addElectiveCourse(course);
                }
                System.out.print("-------------- Add/ Browse/Exit --------------\n");
                System.out.println("a) Enter 1 to Add course\nb) Enter 2 to Browse courses\nc) Enter 3 to Exit");

            }
            else if(option == 2){
                System.out.print("-------------- List of Courses --------------\n");
                ArrayList<Course> course_list = coursecatalog.getCourseList();
                System.out.print(course_list);
                System.out.print("\n");
                break;
            }
            else if(option == 3){
                break;
            }
        }

        ArrayList<Course> course_list = coursecatalog.getCourseList();

        System.out.print("\nThe course numbers for the courses are: ");
        System.out.print(course_list);
        System.out.print("\n");

        System.out.print("\nEnter the semester for which you want to create course schedule: ");
        sc.nextLine();
        String semester = sc.nextLine();
        CourseSchedule courseschedule = department.newCourseSchedule(semester);
        ArrayList<CourseOffer> courseoffers_list = new ArrayList<CourseOffer>();
        ArrayList<FacultyProfile> faculty_profiles = new ArrayList<FacultyProfile>();
        ArrayList<StudentProfile> student_profiles = new ArrayList<StudentProfile>();
        HashMap<String, String> course_prof = new HashMap<>();

        for(Integer i=0; i<course_list.size();i++){
            CourseOffer course_offer = courseschedule.newCourseOffer(String.valueOf(course_list.get(i)));
            courseoffers_list.add(course_offer);
            if(course_offer == null)return;
            course_offer.generatSeats(10);
            Person p = pd.newPerson("Professor" + String.valueOf(i+1));
            course_prof.put(String.valueOf(course_list.get(i)),"Professor" + String.valueOf(i+1));
            FacultyProfile fp = fd.newFacultyProfile(p);
            fp.AssignAsTeacher(course_offer);
            faculty_profiles.add(fp);
        }

        //System.out.print("Faculty profiles: " + faculty_profiles);

        for(Integer i=0; i<10;i++){
            Person p = pd.newPerson(String.valueOf(i+100));
            StudentProfile sp = sd.newStudentProfile(p);
            student_profiles.add(sp);
            CourseLoad cl = sp.newCourseLoad(semester);
            cl.newSeatAssignment(courseoffers_list.get(i));
            if(i+1 < 10){
                cl.newSeatAssignment(courseoffers_list.get(i));
                cl.newSeatAssignment(courseoffers_list.get(i+1));
            }
            else{
                cl.newSeatAssignment(courseoffers_list.get(i));
                cl.newSeatAssignment(courseoffers_list.get(i-i));
            }
            // System.out.print("\nCurrent course load for student" + sp + " is " + sp.getCurrentCourseLoad());
        }
        int total = department.calculateRevenuesBySemester(semester);
        System.out.print("\nTotal: " + total);

        System.out.println("\n-----------------------------------------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s\n", " Student_Name ", "     Registered_Course  ", " Professor ", " Grades ", " Tution_fee_paid ");
        System.out.println("-----------------------------------------------------------------------------------");

        ArrayList<SeatAssignment> seat_assignments = new ArrayList<SeatAssignment>();
        List<String> grades = new ArrayList<>();
        Collections.addAll(grades, "A", "A-", "B", "B-");
        Random rand = new Random();

        for(Integer i=0; i<student_profiles.size();i++){
            seat_assignments = student_profiles.get(i).getCourseList();
            seat_assignments.remove(0);
            for(SeatAssignment s: seat_assignments){
                int randomIndex = rand.nextInt(grades.size());
                System.out.printf("\t%-10s\t %-10s\t %-10s\t %-10s %-10s\t\n", student_profiles.get(i), s.getAssociatedCourse(), course_prof.get(String.valueOf(s.getAssociatedCourse())), grades.get(randomIndex), s.getCreditHours()*1000);
            }

        }

    }

}
