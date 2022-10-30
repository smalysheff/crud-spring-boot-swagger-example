package com.example.student_db_rest_api.controller.api;

import com.example.student_db_rest_api.domain.model.SpecialtyDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Collection;

@Tag(name = "Specialty API")
@RequestMapping("/specialties")
public interface SpecialtyControllerApi {

    @Operation(summary = "Find specialty by ID", description = "Returns a single specialty")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successful operation", content = @Content(schema = @Schema(implementation = SpecialtyDto.class))),
            @ApiResponse(responseCode = "400", description = "Invalid ID supplied", content = @Content),
            @ApiResponse(responseCode = "404", description = "Specialty not found", content = @Content)})
    @GetMapping(value = "/{id}", produces = {"application/json", "application/vnd.api+json"})
    @ResponseStatus(HttpStatus.OK)
    SpecialtyDto getById(
            @Parameter(description = "Идентификатор специальности", required = true)
            @PathVariable String id
    );

    @Operation(summary = "Get specialties", description = "Returns a specialties collection")
    @GetMapping
    Collection<SpecialtyDto> getAll();

    @Operation(summary = "Create specialties", description = "Create specialties.")
    @ApiResponses(value = {
            @ApiResponse(description = "successful operation", content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = SpecialtyDto.class)),
                    @Content(mediaType = "application/xml", schema = @Schema(implementation = SpecialtyDto.class))})
    })
    @PostMapping(consumes = {"application/json", "application/xml", "application/x-www-form-urlencoded"})
    @ResponseStatus(HttpStatus.CREATED)
    void create(
            @NotNull
            @Parameter(description = "Created specialty object", required = true)
            @Valid @RequestBody SpecialtyDto request
    );

    @Operation(summary = "Update specialties", description = "Update specialties.")
    @ApiResponses(value = {
            @ApiResponse(description = "successful operation", content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = SpecialtyDto.class)),
                    @Content(mediaType = "application/xml", schema = @Schema(implementation = SpecialtyDto.class))})
    })
    @PutMapping(value = "/{id}", consumes = {"application/json", "application/xml", "application/x-www-form-urlencoded"})
    @ResponseStatus(HttpStatus.OK)
    void update(
            @Parameter(description = "Update specialty object", required = true)
            @RequestBody SpecialtyDto request,
            @Parameter(description = "Идентификатор специальности", required = true)
            @PathVariable String id
    );

    @Operation(summary = "Delete specialty", description = "Delete specialty.")
    @DeleteMapping(value = "/{id}", produces = {"application/json", "application/vnd.api+json"})
    @ResponseStatus(HttpStatus.OK)
    void delete(@PathVariable String id);
}
