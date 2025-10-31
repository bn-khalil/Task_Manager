package com.bn.tasks.mappers.impl;

import com.bn.tasks.dto.TaskDto;
import com.bn.tasks.entities.Task;
import com.bn.tasks.mappers.TaskMapper;
import org.springframework.stereotype.Component;

@Component
public class TaskMapperImpl implements TaskMapper {

    @Override
    public Task fromDto(TaskDto taskDto) {
        if (taskDto == null) return null ;

        return new Task(
                taskDto.id(),
                taskDto.title(),
                taskDto.description(),
                taskDto.status(),
                taskDto.priority(),
                taskDto.dateToStart(),
                null,
                null,
                null
        );
    }

    @Override
    public TaskDto toDto(Task task) {
        return new TaskDto(
                task.getId(),
                task.getTitle(),
                task.getDescription(),
                task.getStatus(),
                task.getPriority(),
                task.getDataToStart()
        );
    }
}
