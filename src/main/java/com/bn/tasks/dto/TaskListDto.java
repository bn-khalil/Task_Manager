package com.bn.tasks.dto;

import java.util.List;
import java.util.UUID;

public record TaskListDto(
        UUID id,
        String title,
        String description,
        List<TaskDto> tasksDto
) {}
