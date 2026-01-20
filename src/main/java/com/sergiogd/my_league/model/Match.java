package com.sergiogd.my_league.model;

import java.time.LocalDateTime;
import java.util.UUID;
import lombok.Data;

@Data
public class Match {
    private UUID id;
    private Integer matchDay;
    private UUID localTeam;
    private UUID awayTeam;
    private UUID seasonId;
    private LocalDateTime matchDate;
    private String status;
    private Integer localGol; // Usamos Integer si prefieres, o BigDecimal según tu precisión
    private Integer awayGol;
}