package com.example.electronicshop.controller;

import com.example.electronicshop.filter.VacuumCleanerFilterRequest;
import com.example.electronicshop.model.VacuumCleanerModel;
import com.example.electronicshop.model.page.CustomPage;
import com.example.electronicshop.service.VacuumCleanerService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/vacuum")
public class VacuumController {
    private final VacuumCleanerService service;

    @Operation(summary = "Поиск по пылесосам")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Данные получены успешно",
                    content = @Content(schema = @Schema(implementation = VacuumCleanerModel.class))),
            @ApiResponse(responseCode = "404", description = "Запрошенные данные не найдены"),
            @ApiResponse(responseCode = "403", description = "Доступ запрещен"),
            @ApiResponse(responseCode = "422", description = "Ошибка обработки запроса")
    })
    @PostMapping("/find")
    public CustomPage<VacuumCleanerModel> findBy(@RequestBody VacuumCleanerFilterRequest filter) {
        return service.findBy(filter);
    }

    @Operation(summary = "Добавление товара")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Товар добавлен успешно"),
            @ApiResponse(responseCode = "404", description = "Запрошенные данные не найдены"),
            @ApiResponse(responseCode = "403", description = "Доступ запрещен"),
            @ApiResponse(responseCode = "422", description = "Ошибка обработки запроса")
    })
    @PostMapping("/add")
    public void addVacuumCleaner(@RequestBody VacuumCleanerModel model) {
        service.addVacuumCleaner(model);
    }
}
