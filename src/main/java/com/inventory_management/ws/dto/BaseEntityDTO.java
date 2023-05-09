package com.inventory_management.ws.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.ZonedDateTime;

@Data
@EqualsAndHashCode(of = "id")
public class BaseEntityDTO {
    protected Long id;
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private ZonedDateTime creationDate;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private ZonedDateTime modificationDate;
}
