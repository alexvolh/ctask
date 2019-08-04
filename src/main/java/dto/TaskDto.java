package dto;

import lombok.Data;

import java.time.ZonedDateTime;

@Data
public class TaskDto {
    Long id;
    String title;
    String description;
    ZonedDateTime startDateTime;
    ZonedDateTime endDateTime;
}
