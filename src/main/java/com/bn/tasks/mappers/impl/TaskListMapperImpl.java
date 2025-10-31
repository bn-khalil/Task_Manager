package com.bn.tasks.mappers.impl;

import com.bn.tasks.dto.TaskListDto;
import com.bn.tasks.entities.TaskList;
import com.bn.tasks.mappers.TaskListMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
public class TaskListMapperImpl implements TaskListMapper {
    @Override
    public TaskList fromDto(TaskListDto taskListDto) {
        return new TaskList(
                taskListDto.id(),
                taskListDto.title(),
                taskListDto.description(),
                null,
                null,
        );
    }

    @Override
    public TaskListDto toDto(TaskList taskList) {
        return null;
    }
}
