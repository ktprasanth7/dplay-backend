package com.decathlon.application.ports.input;

import com.decathlon.application.domain.entities.DayOfWeek;
import com.decathlon.application.domain.entities.Session;
import com.decathlon.application.domain.entities.Schedule;

import java.util.List;

public interface ScheduleInterface {
    Schedule getSchedule(List<DaySchedule> daySchedules);
    Schedule createSchedule(DayOfWeek dayOfWeek, List<Session> sessions);
}
