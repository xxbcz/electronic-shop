package com.example.electronicshop.filter;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.data.domain.Sort;

@Data
@Schema(description = "Запрос на поиск пылесосов")
public class VacuumCleanerFilterRequest extends AbstractFilter {

    @Schema(description = "Фильтр на поиск")
    private VacuumCleanerFilter filter;

}
