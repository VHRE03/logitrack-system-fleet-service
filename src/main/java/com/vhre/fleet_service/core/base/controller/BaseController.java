package com.vhre.fleet_service.core.base.controller;

import com.vhre.fleet_service.core.base.service.BaseService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
public abstract class BaseController<Entity, Dto, ID> {

    protected final BaseService<Dto, ID> service;

    @Operation(summary = "Get all records", description = "Retrieves a list of all existing records.")
    @ApiResponse(responseCode = "200", description = "Successful operation")
    @GetMapping
    public ResponseEntity<List<Dto>> getAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @Operation(summary = "Get a record by its ID", description = "Retrieves a single record by its specific identifier.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Record found successfully"),
            @ApiResponse(responseCode = "404", description = "Record not found")
    })
    @GetMapping("/{id}")
    public ResponseEntity<Dto> getById(@PathVariable ID id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @Operation(summary = "Create a new record", description = "Creates and saves a new record in the database.")
    @ApiResponse(responseCode = "201", description = "Record created successfully")
    @PostMapping
    public ResponseEntity<Dto> create(@RequestBody Dto dto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(dto));
    }

    @Operation(summary = "Update an existing record", description = "Updates a record matching the provided ID.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Record updated successfully"),
            @ApiResponse(responseCode = "404", description = "Record not found for update")
    })
    @PutMapping("/{id}")
    public ResponseEntity<Dto> update(@PathVariable ID id, @RequestBody Dto dto) {
        return ResponseEntity.ok(service.update(id, dto));
    }

    @Operation(summary = "Delete a record", description = "Deletes a specific record by its ID.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "204", description = "Record deleted successfully"),
            @ApiResponse(responseCode = "404", description = "Record not found for deletion")
    })
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable ID id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
