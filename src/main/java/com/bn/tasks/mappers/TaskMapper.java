package com.bn.tasks.mappers;

import com.bn.tasks.dto.TaskDto;
import com.bn.tasks.entities.Task;

public interface TaskMapper {

    Task fromDto( TaskDto taskDto );

    TaskDto toDto ( Task task );
}
