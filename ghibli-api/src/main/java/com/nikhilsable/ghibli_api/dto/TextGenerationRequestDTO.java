package com.nikhilsable.ghibli_api.dto;

import lombok.Data;

@Data
public class TextGenerationRequestDTO {

    private String prompt;
    private String style;
}
