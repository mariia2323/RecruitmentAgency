package com.example.recruitmentagency.controller.ui;

import com.example.recruitmentagency.forms.AcquirerForm;
import com.example.recruitmentagency.model.Acquirer;
import com.example.recruitmentagency.service.item.impls.AcquirerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RequestMapping("/ui/v1/acquirers/")
@Controller
public class AcquirerUiController {


    @Autowired
    AcquirerServiceImpl service;

    @GetMapping("")
    public String showAll(Model model){
        model.addAttribute("acquirers",service.getAll());
        return "acquirers";
    }
    @GetMapping("/del/{id}")
    public String deleteById(@PathVariable("id") String id) {
        service.delete(id);
        return  "redirect:/ui/v1/acquirers/";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addAcquirer(Model model){
        AcquirerForm acquirerForm = new AcquirerForm();
        model.addAttribute("form", acquirerForm);
        return "acquirers-create";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addAcquirer(@ModelAttribute("form") AcquirerForm form){
        Acquirer acquirer = new Acquirer();
        acquirer.setName(form.getName());
        acquirer.setDescription(form.getDescription());
        acquirer.setSurname(form.getSurname());
        acquirer.setPatronymic(form.getPatronymic());
        acquirer.setWorkExperience(form.getWorkExperience());
        acquirer.setWorkType(form.getWorkType());
        acquirer.setOther_data(form.getOther_data());
        acquirer.setDate_of_birth(form.getDate_of_birth());
        acquirer.setEducation(form.getEducation());
        service.create(acquirer);
        return "redirect:/ui/v1/acquirers/";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String updateAcquirer(Model model, @PathVariable("id") String id){
        Acquirer acquirerToUpdate = service.get(id);
        AcquirerForm acquirerForm = new  AcquirerForm();
        acquirerForm.setId(acquirerToUpdate.getId());
        acquirerForm.setName(acquirerToUpdate.getName());
        acquirerForm.setDescription(acquirerToUpdate.getDescription());
        acquirerForm.setUpdateAt(acquirerToUpdate.getUpdatedAt());
        acquirerForm.setCreatedAt(acquirerToUpdate.getCreatedAt());
        acquirerForm.setSurname(acquirerToUpdate.getSurname());
        acquirerForm.setPatronymic(acquirerToUpdate.getPatronymic());
        acquirerForm.setWorkExperience(acquirerToUpdate.getWorkExperience());
        acquirerForm.setWorkType(acquirerToUpdate.getWorkType());
        acquirerForm.setOther_data(acquirerToUpdate.getOther_data());
        acquirerForm.setDate_of_birth(acquirerToUpdate.getDate_of_birth());
        acquirerForm.setEducation(acquirerToUpdate.getEducation());
        model.addAttribute("form", acquirerForm);
        return "acquirers-update";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    public String updateAcquirer( @ModelAttribute("form") AcquirerForm form){
        System.out.println(form);
        Acquirer acquirertoUpdate = new Acquirer();
        acquirertoUpdate.setId(form.getId());
        acquirertoUpdate.setName(form.getName());
        acquirertoUpdate.setDescription(form.getDescription());
        acquirertoUpdate.setSurname(form.getSurname());
        acquirertoUpdate.setCreatedAt(LocalDateTime.now());
        acquirertoUpdate.setUpdatedAt(LocalDateTime.now());
        acquirertoUpdate.setPatronymic(form.getPatronymic());
        acquirertoUpdate.setWorkExperience(form.getWorkExperience());
        acquirertoUpdate.setWorkType(form.getWorkType());
        acquirertoUpdate.setOther_data(form.getOther_data());
        acquirertoUpdate.setDate_of_birth(form.getDate_of_birth());
        acquirertoUpdate.setEducation(form.getEducation());

        service.update(acquirertoUpdate);

        return "redirect:/ui/v1/acquirers/";
    }



}
