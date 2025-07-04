package com.example.demo.gardencell.controller.dtos;

import jakarta.validation.constraints.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CreateGardenCellRequest {
    @NotBlank(message = "PlantInventory ID must not be blank")
    String plantInventoryId;

    @NotNull(message = "Row index must not be null")
    @Min(value = 0, message = "Row index must be >= 0")
    Integer rowIndex;

    @NotNull(message = "Column index must not be null")
    @Min(value = 0, message = "Column index must be >= 0")
    Integer colIndex;

    @NotNull(message = "Quantity must not be null")
    @Min(value = 0, message = "Quantity must be >= 0")
    Short quantity;
}
