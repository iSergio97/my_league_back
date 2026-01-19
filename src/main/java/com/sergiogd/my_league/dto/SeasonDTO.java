package com.sergiogd.my_league.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class SeasonDTO {

    private UUID seasonId;
    private String name;
}
