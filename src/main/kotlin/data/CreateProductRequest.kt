package data

import annotations.NotBlank

//data class CreateProductRequest(
//    val id: String,
//    val name: String,
//    val price: Long
//);

data class CreateProductRequest(
    @NotBlank val id: String,
    @NotBlank val name: String,
    @NotBlank val price: Long
);

data class CreateCategoryRequest(
    @NotBlank val id: String,
    @NotBlank val name: String
)