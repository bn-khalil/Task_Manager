package com.bn.tasks.mappers;

import com.bn.tasks.dto.TaskDto;
import com.bn.tasks.dto.TaskListDto;
import com.bn.tasks.entities.TaskList;

public interface TaskListMapper {

    TaskList fromDto(TaskListDto taskListDto );

    TaskListDto toDto ( TaskList taskList );
}
