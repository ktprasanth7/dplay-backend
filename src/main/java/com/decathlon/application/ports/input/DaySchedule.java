package com.decathlon.application.ports.input;

import com.decathlon.application.domain.entities.DayOfWeek;
import com.decathlon.application.domain.entities.Session;

import java.util.List;

public interface DaySchedule {
 Schedule createDaySchedule(DayOfWeek dayOfWeek, List<Session> sessions);
 Schedule updateDaySchedule(DayOfWeek dayOfWeek, List<Session> sessions);


}
