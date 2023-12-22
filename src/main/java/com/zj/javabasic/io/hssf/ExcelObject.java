package com.zj.javabasic.io.hssf;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * @projectName: Java_Basic
 * @package: com.zj.javabasic.io.hssf
 * @className: ExcelObject
 * @author: By zhangjun
 * @description: TODO
 * @date: 2023/12/19 13:40
 * @version: 1.0
 */
public class ExcelObject {
    // 序号
    private Integer num;
    // 部门
    private String departmentName;
    // 小组
    private String groupName;
    // 小组2
    private String subGroupName;
    // 事务 3行
    private List<String> task;
    // 具体事项 5行
    private List<String> taskDeatil;

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getSubGroupName() {
        return subGroupName;
    }

    public void setSubGroupName(String subGroupName) {
        this.subGroupName = subGroupName;
    }

    public List<String> getTask() {
        return task;
    }

    public void setTask(List<String> task) {
        this.task = task;
    }

    public List<String> getTaskDeatil() {
        return taskDeatil;
    }

    public void setTaskDeatil(List<String> taskDeatil) {
        this.taskDeatil = taskDeatil;
    }
}
