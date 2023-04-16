package com.example.client.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;


import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SensorDTO implements Serializable {

    private String name;

}
