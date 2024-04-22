package com.decathlon.application.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Schedule {
    private DayOfWeek dayOfWeek;
    private List<Session> sessions;

}
