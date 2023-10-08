package student;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;


@Getter
@Setter
@ToString
@AllArgsConstructor
public class Student {
    private String firstName;
    private String lastName;
    private int studentId;
    private String dateOfBirth;
}
