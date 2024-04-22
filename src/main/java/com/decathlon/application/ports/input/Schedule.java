package com.decathlon.application.ports.input;

import com.decathlon.application.domain.entities.DayOfWeek;
import com.decathlon.application.domain.entities.Session;

import java.util.List;

public interface Schedule {
    Schedule getSchedule(List<DaySchedule> daySchedules);
    Schedule createSchedule(DayOfWeek dayOfWeek, List<Session> sessions);
}
