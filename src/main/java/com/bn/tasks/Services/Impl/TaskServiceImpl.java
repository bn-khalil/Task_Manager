package com.bn.tasks.Services.Impl;

import com.bn.tasks.Repositories.TaskRepository;
import com.bn.tasks.Services.TaskService;
import com.bn.tasks.dto.TaskDto;
import com.bn.tasks.entities.Task;
import com.bn.tasks.mappers.TaskMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TaskServiceImpl implements TaskService {

    final private TaskRepository taskRepository;
    final private TaskMapper taskMapper;

    @Autowired
    public TaskServiceImpl(TaskRepository taskRepository, TaskMapper taskMapper) {
        this.taskRepository = taskRepository;
        this.taskMapper = taskMapper;
    }

    @Override
    public TaskDto getTask(UUID id) {
        Task task = this.taskRepository.findById(id).orElse(null);
        //error handling here
        return this.taskMapper.toDto(task);
    }

    @Override
    public List<TaskDto> listTasksInTaskList(UUID taskListId) {
        List<Task> tasks = this.taskRepository.findByTaskListId(taskListId);
        //error handling here
        return tasks.stream().map(this.taskMapper::toDto).toList();
    }

    @Override
    public TaskDto addNewTask(TaskDto taskDto) {
        Task task = this.taskMapper.fromDto(taskDto);
        task = this.taskRepository.save(task);
        return this.taskMapper.toDto(task);
    }
}
