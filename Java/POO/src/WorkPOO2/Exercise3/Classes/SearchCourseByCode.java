package WorkPOO2.Exercise3.Classes;

import javax.swing.*;

public class SearchCourseByCode {
    public void search() {
        CourseManagement courseManagement = new CourseManagement();
        Course course = courseManagement.searchByCode(JOptionPane.showInputDialog(null, "Enter the code of the course that you are searching for"));
        if (course == null) {
            JOptionPane.showMessageDialog(null, "The code entered does not correspond to any course.");
        } else {

        }
    }
}
