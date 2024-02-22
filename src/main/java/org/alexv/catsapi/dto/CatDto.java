package org.alexv.catsapi.dto;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Accessors;

import java.time.LocalDate;

@Data
@Builder
@Accessors(chain = true)
public class CatDto {
    private String name;
    private LocalDate birthday;
}
