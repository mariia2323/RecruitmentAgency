package com.example.recruitmentagency.controller.ui;

import com.example.recruitmentagency.forms.EmployerForm;
import com.example.recruitmentagency.forms.ItemForm;
import com.example.recruitmentagency.model.Employer;
import com.example.recruitmentagency.model.Item;
import com.example.recruitmentagency.service.item.impls.EmployerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RequestMapping("/ui/v1/employers/")
@Controller

public class EmployerUiController {

    @Autowired
    EmployerServiceImpl service;

    @GetMapping("")
    public String showAll(Model model) {
        model.addAttribute("employers",service.getAll());
        return "employers";
    }
    @GetMapping("/del/{id}")
    public String deleteById(@PathVariable("id") String id) {
        service.delete(id);
        return  "redirect:/ui/v1/employers/";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addEmployer(Model model){
        EmployerForm employerForm = new EmployerForm();
        model.addAttribute("form", employerForm);
        return "employers-create";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addEmployer(@ModelAttribute("form") EmployerForm form){
        Employer employer = new Employer();
        employer.setName(form.getName());
        employer.setDescription(form.getDescription());
        employer.setCompany(form.getCompany());
        employer.setAddress(form.getAddress());
        employer.setPhone_number(form.getPhone_number());
        service.create(employer);
        return "redirect:/ui/v1/employers/";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String updateEmployer(Model model, @PathVariable("id") String id){
        Employer employerToUpdate = service.get(id);
        EmployerForm employerForm = new EmployerForm();
        employerForm.setId(employerToUpdate.getId());
        employerForm.setName(employerToUpdate.getName());
        employerForm.setDescription(employerToUpdate.getDescription());
        employerForm.setCompany(employerToUpdate.getCompany());
        employerForm.setAddress(employerToUpdate.getAddress());
        employerForm.setPhone_number(employerToUpdate.getPhone_number());
        employerForm.setUpdateAt(employerToUpdate.getUpdatedAt());
        employerForm.setCreatedAt(employerToUpdate.getCreatedAt());
        model.addAttribute("form", employerForm);
        return "employers-update";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    public String updateEmployer( @ModelAttribute("form") EmployerForm form){
        System.out.println(form);
        Employer employertoUpdate = new Employer();
        employertoUpdate.setId(form.getId());
        employertoUpdate.setName(form.getName());
        employertoUpdate.setDescription(form.getDescription());
        employertoUpdate.setCompany(form.getCompany());
        employertoUpdate.setAddress(form.getAddress());
        employertoUpdate.setPhone_number(form.getPhone_number());
        employertoUpdate.setCreatedAt(LocalDateTime.now());
        employertoUpdate.setUpdatedAt(LocalDateTime.now());
        service.update(employertoUpdate);

        return "redirect:/ui/v1/employers/";
    }



}