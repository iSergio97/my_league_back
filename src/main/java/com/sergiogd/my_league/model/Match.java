package com.sergiogd.my_league.model;

import java.util.UUID;
import java.time.LocalDate;
import java.math.BigDecimal;
import lombok.Data;

@Data
public class Match {
    private UUID id;
    private Integer matchDay;
    private UUID localTeam;
    private UUID awayTeam;
    private UUID seasonId;
    private LocalDate matchDate;
    private String status;
    private Integer localGol; // Usamos Integer si prefieres, o BigDecimal según tu precisión
    private Integer awayGol;
}