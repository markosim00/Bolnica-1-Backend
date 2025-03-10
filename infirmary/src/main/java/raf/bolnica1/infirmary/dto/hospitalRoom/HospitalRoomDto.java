package raf.bolnica1.infirmary.dto.hospitalRoom;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Getter
@Setter
@NoArgsConstructor
public class HospitalRoomDto {

    private Long id;
    private Long idDepartment;
    private int roomNumber;
    private String name;
    private int capacity;
    private int occupancy;
    private String description;

}
