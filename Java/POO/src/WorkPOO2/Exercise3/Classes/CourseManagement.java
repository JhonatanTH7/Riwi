package WorkPOO2.Exercise3.Classes;

import javax.swing.*;
import java.util.ArrayList;

public class CourseManagement {
    private ArrayList<Course> coursesList;

    public CourseManagement() {
        this.coursesList = new ArrayList<>();
    }

    public void addCourse() {
        JOptionPane.showMessageDialog(null, "Adding new course");
        String name = JOptionPane.showInputDialog(null, "Enter the course name");
        String code = JOptionPane.showInputDialog(null, "Enter the course code");
        if (this.searchByCode(code) != null) {
            JOptionPane.showMessageDialog(null, "This code already exists");
        } else {
            Course course = new Course(code, name);
            this.coursesList.add(course);
            JOptionPane.showMessageDialog(null, "Course successfully added");
        }
    }

    public Course searchByCode(String searchedCode) {
        for (Course course : this.coursesList) {
            if (course.getCode().equalsIgnoreCase(searchedCode)) {
                return course;
            }
        }
        return null;
    }

    public ArrayList<Course> getCoursesList() {
        return this.coursesList;
    }

    public void setCoursesList(ArrayList<Course> coursesList) {
        this.coursesList = coursesList;
    }

    @Override
    public String toString() {
        return "CourseManagement{" +
                "coursesList=" + coursesList +
                '}';
    }
}
