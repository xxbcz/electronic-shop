package com.example.electronicshop.controller;

import com.example.electronicshop.filter.SmartphoneFilterRequest;
import com.example.electronicshop.model.SmartphoneModel;
import com.example.electronicshop.model.page.CustomPage;
import com.example.electronicshop.service.SmartphoneService;
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
@RequestMapping("/smartphone")
public class SmartphoneController {
    private final SmartphoneService service;

    @Operation(summary = "Поиск по смартфонам")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Данные получены успешно",
                    content = @Content(schema = @Schema(implementation = SmartphoneModel.class))),
            @ApiResponse(responseCode = "404", description = "Запрошенные данные не найдены"),
            @ApiResponse(responseCode = "403", description = "Доступ запрещен"),
            @ApiResponse(responseCode = "422", description = "Ошибка обработки запроса")
    })
    @PostMapping("/find")
    public CustomPage<SmartphoneModel> findBy(@RequestBody SmartphoneFilterRequest filter) {
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
    public void addSmartphone(@RequestBody SmartphoneModel model) {
        service.addSmartphone(model);
    }
}
