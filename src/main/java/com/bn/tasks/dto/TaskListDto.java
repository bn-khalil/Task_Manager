package com.bn.tasks.dto;

import com.bn.tasks.entities.Task;

import java.util.List;
import java.util.UUID;

public record TaskListDto(
        UUID id,
        String title,
        String description,
        Double progress,
        Long counter,
        List<Task> tasks
) {}
