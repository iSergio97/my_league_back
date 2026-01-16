package com.sergiogd.my_league.model;

import java.util.UUID;
import lombok.Data;

@Data
public class Team {
    private UUID id;
    private String nombre;
    private UUID leagueId;
}
