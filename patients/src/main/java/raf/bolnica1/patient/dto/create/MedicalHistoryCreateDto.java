package raf.bolnica1.patient.dto.create;

import lombok.Getter;
import lombok.Setter;
import raf.bolnica1.patient.domain.constants.TreatmentResult;
import raf.bolnica1.patient.dto.general.DiagnosisCodeDto;

@Getter
@Setter
public class MedicalHistoryCreateDto {
    private boolean confidential;
    private TreatmentResult treatmentResult;
    private String currStateDesc;
    private DiagnosisCodeDto diagnosisCodeDto;
    private boolean exists;
}
