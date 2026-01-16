package com.sergiogd.my_league.model;

import lombok.Data;

import java.util.UUID;

@Data
public class SeasonTeam {

    private UUID seasonId;
    private UUID teamId;
    private Boolean isPromoted;
    private Boolean isDefendingChampion;
}
