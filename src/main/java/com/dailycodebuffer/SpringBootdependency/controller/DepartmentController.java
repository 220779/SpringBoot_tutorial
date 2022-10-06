package com.dailycodebuffer.SpringBootdependency.controller;


import com.dailycodebuffer.SpringBootdependency.entity.Department;
import com.dailycodebuffer.SpringBootdependency.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department departments){

        return departmentService.saveDepartment(departments);

    }

    @GetMapping("/departments")
    public List<Department>  fetchDepartmentList () {
        return departmentService.fetchDepartmentList ();
    }

    @GetMapping("/departments/{id}")
    public Department fetchDepartmentById (@PathVariable("id") Long departmentId) {
        return departmentService.fetchDepartmentById(departmentId);
    }

    @DeleteMapping("/department/{id}")
    public String deleteDepartmentById (@PathVariable ("id") Long departmentId){
        departmentService.deleteDepartmentById(departmentId);
        return "department deleted successfully !!";

    }
    @PutMapping("/department/{id}")
    public Department updateDepartment(@PathVariable ("id") Long departmentId,
                                       @RequestBody Department department) {
        return departmentService.updateDepartment(departmentId, department);

    }
    @GetMapping("/department/name/{name}")
    public Department fetchDepartmentByName(@PathVariable("name") String departmentName){

        return departmentService.fetchDepartmentByName(departmentName);

}
