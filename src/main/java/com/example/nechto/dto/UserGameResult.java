package com.example.nechto.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserGameResult {
    String nick;
    String gameId;
    String userRole;
    Integer queue;
    Boolean burned;
    Boolean mostUseful;
    Boolean mostDangerous;
    Integer luckFire;
    Integer badFire;
    Double penalty;
    Boolean bonusSacrifice;
    Integer minorityWin;
    Double totalSum;

}
