package com.sergiogd.my_league.dto;

import lombok.Data;

@Data
public class StandingDTO {

    private Integer ranking;
    private String teamName;
    private Integer journeyNumber;
    private Integer points;
    private Integer goalsFor;
    private Integer goalsAgainst;
}
