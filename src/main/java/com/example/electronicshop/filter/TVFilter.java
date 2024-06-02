package com.example.electronicshop.filter;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "Фильтр по персональным компьютерам")
public class TVFilter extends AbstractBaseFilter {

    @Schema(description = "Категория телевизора")
    private String category;
    @Schema(description = "Технология изготовления")
    private String technology;

}
