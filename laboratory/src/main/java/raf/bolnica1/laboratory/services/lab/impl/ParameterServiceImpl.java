package raf.bolnica1.laboratory.services.lab.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import raf.bolnica1.laboratory.domain.lab.Parameter;
import raf.bolnica1.laboratory.dto.lab.parameter.ParameterDto;
import raf.bolnica1.laboratory.dto.response.MessageDto;
import raf.bolnica1.laboratory.mappers.ParameterMapper;
import raf.bolnica1.laboratory.repository.ParameterRepository;
import raf.bolnica1.laboratory.services.lab.ParameterService;

@Service
@AllArgsConstructor
public class ParameterServiceImpl implements ParameterService {

    private final ParameterRepository parameterRepository;
    private final ParameterMapper parameterMapper;

    public ParameterDto createParameter(ParameterDto parameterDto){

        Parameter parameter=parameterMapper.toEntity(parameterDto);
        parameter.setId(null);

        parameter=parameterRepository.save(parameter);

        return parameterMapper.toDto(parameter);
    }

    public ParameterDto updateParameter(ParameterDto parameterDto){

        /// ne moze da update ako se ne nalazi u bazi vec
        if(parameterRepository.findParameterById(parameterDto.getId())==null)
            throw new RuntimeException();

        Parameter parameter=parameterMapper.toEntity(parameterDto);

        parameter=parameterRepository.save(parameter);

        return parameterMapper.toDto(parameter);

    }

    public MessageDto deleteParameter(Long id){
        parameterRepository.deleteById(id);
        return new MessageDto("Parameter with ID "+id+" deleted");
    }

    public ParameterDto getParameter(Long id){
        return parameterMapper.toDto(parameterRepository.findParameterById(id));
    }


}
