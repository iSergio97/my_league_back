package com.sergiogd.my_league.model;

import java.util.UUID;
import lombok.Data;

@Data
public class Standing {
    // Clave Primaria Compuesta
    private UUID seasonId;
    private UUID teamId;
    private Integer journeyNumber;

    // Estadísticas
    private Integer points;
    private Integer goalsFor;
    private Integer goalsAgainst;
    private Integer ranking;
}
