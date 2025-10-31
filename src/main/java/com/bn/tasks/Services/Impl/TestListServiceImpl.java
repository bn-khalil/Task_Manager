package com.bn.tasks.Services.Impl;

import com.bn.tasks.Repositories.TaskListRepository;
import com.bn.tasks.Services.TaskListService;
import com.bn.tasks.dto.TaskListDto;
import com.bn.tasks.entities.TaskList;
import com.bn.tasks.mappers.TaskListMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TestListServiceImpl implements TaskListService {

    final private TaskListRepository taskListRepository;
    final private TaskListMapper taskListMapper;

    @Autowired
    public TestListServiceImpl(
            TaskListRepository taskListRepository,
            TaskListMapper taskListMapper
    ) {
        this.taskListRepository = taskListRepository;
        this.taskListMapper = taskListMapper;
    }

    @Override
    public List<TaskListDto> findAllTaskLists() {
        List<TaskList> taskLists = this.taskListRepository.findAll();
        return taskLists.stream().map(this.taskListMapper::toDto).toList();
    }

    @Override
    public TaskListDto findTaskList(UUID taskListId) {
        TaskList taskList = this.taskListRepository.findById(taskListId).orElse(null);
        return this.taskListMapper.toDto(taskList);
    }

    @Override
    public TaskListDto addNewTaskList(TaskListDto taskListDto) {
        TaskList taskList = this.taskListMapper.fromDto(taskListDto);
        taskList = this.taskListRepository.save(taskList);
        return this.taskListMapper.toDto(taskList);
    }
}
