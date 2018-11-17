package studentportal.view;

import studentportal.controller.StudentManager;
import studentportal.model.Student;
import javax.swing.table.DefaultTableModel;

public class StudentTableModel extends DefaultTableModel {

    private final StudentManager studentManager;

    private static final String HEADER_LIST[] = {"id", "name", "gender", "email"};

    public StudentTableModel(StudentManager studentManager) {
        this.studentManager = studentManager;
    }

    @Override
    public int getColumnCount() {
        return HEADER_LIST.length;
    }

    @Override
    public int getRowCount() {
        return studentManager.getAllStudents().size();
    }

    @Override
    public Object getValueAt(int row, int column) {
        Student student = studentManager.getAllStudents().get(row);

        switch (column) {
            case 0:
                return student.getId();
            case 1:
                return student.getName();
            case 2:
                return student.getGender();
            case 3:
                return student.getEmail();
            default:
                return "";
        }
    }

    public String getColumnName(int col) {
        return HEADER_LIST[col];
    }
}


