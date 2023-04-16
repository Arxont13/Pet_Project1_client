package com.example.client.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.springframework.web.client.RestTemplate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MeteodataDTO {

    private Double temperature;

    private Boolean is_rainy;

    private SensorDTO sensor;

}
