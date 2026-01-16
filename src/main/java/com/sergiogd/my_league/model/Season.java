package com.sergiogd.my_league.model;

import java.util.UUID;
import lombok.Data;

@Data
public class Season {
    private UUID id;
    private UUID leagueId;
    private String name;
}