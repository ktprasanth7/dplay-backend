package com.decathlon.application.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Session {
    private int startHour;
    private int endHour;
   private  boolean isOnline;

}
