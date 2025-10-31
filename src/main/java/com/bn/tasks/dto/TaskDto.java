package com.bn.tasks.dto;

import com.bn.tasks.enums.TaskPriority;
import com.bn.tasks.enums.TaskStatus;

import java.time.LocalDateTime;
import java.util.UUID;

public record TaskDto(UUID id,
                      String title,
                      String description,
                      TaskStatus status,
                      TaskPriority priority,
                      LocalDateTime dateToStart
) {}
