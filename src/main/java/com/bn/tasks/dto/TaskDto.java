package com.bn.tasks.dto;

import com.bn.tasks.enums.TaskPriority;
import com.bn.tasks.enums.TaskStatus;
import lombok.Builder;

import java.time.LocalDateTime;
import java.util.UUID;

@Builder
public record TaskDto(UUID id,
                      String title,
                      String description,
                      TaskStatus status,
                      TaskPriority priority,
                      LocalDateTime dateToStart
) {}
