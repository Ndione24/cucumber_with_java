package prof;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ProfessorManagement {
    private List<Professor> professors;

    public void addProfessor(Professor professor) {
        professors.add(professor);
    }

    public void removeProfessor(Professor professor) {
        professors.remove(professor);
    }

    public List<Professor> getAllProfessors() {
        return professors;
    }

    public Professor findProfessorById(int employeeId) {
        for (Professor professor : professors) {
            if (professor.getEmployeeId() == employeeId) {
                return professor;
            }
        }
        return null;
    }

    public List<Professor> findProfessorsByDepartment(String department) {
        List<Professor> matchingProfessors = new ArrayList<>();
        for (Professor professor : professors) {
            if (professor.getDepartment().equalsIgnoreCase(department)) {
                matchingProfessors.add(professor);
            }
        }
        return matchingProfessors;
    }

}
