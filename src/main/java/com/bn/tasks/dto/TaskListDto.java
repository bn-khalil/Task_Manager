package com.bn.tasks.dto;

import lombok.Builder;

import java.util.List;
import java.util.UUID;

@Builder
public record TaskListDto(
        UUID id,
        String title,
        String description,
        List<TaskDto> tasksDto
) {}
