package com.example.electronicshop.filter;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "Фильтр по персональным компьютерам")
public class SmartphoneFilter extends AbstractBaseFilter {

    @Schema(description = "Объем памяти")
    private Integer memory;
    @Schema(description = "Количество камер")
    private Integer numberOfCameras;

}
