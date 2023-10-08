package prof;

import lombok.*;

import java.util.Date;

@Getter
@Builder
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Professor {
    private String firstName;
    private String lastName;
    private int employeeId;
    private Date dateOfBirth;
    private String department;

}
