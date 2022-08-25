package com.example.recruitmentagency.controller.ui;

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
        return  "redirect:/ui/v1/items/";
    }
/*
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addItem(Model model){
        ItemForm itemForm = new ItemForm();
        model.addAttribute("form", itemForm);
        return "addItem";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addItem(@ModelAttribute("form") ItemForm form){
        Item item = new Item();
        item.setName(form.getName());
        item.setDescription(form.getDescription());
        service.create(item);
        return "redirect:/ui/v1/items/";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String updateItem(Model model, @PathVariable("id") String id){
        Item itemToUpdate = service.get(id);
        ItemForm itemForm = new ItemForm();
        itemForm.setId(itemToUpdate.getId());
        itemForm.setName(itemToUpdate.getName());
        itemForm.setDescription(itemToUpdate.getDescription());
        itemForm.setUpdatedAt(itemToUpdate.getUpdatedAt());
        itemForm.setCreatedAt(itemToUpdate.getCreatedAt());
        model.addAttribute("form", itemForm);
        return "updateItem";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    public String updateItem( @ModelAttribute("form") ItemForm form){
        System.out.println(form);
        Item itemtoUpdate = new Item();
        itemtoUpdate.setId(form.getId());
        itemtoUpdate.setName(form.getName());
        itemtoUpdate.setDescription(form.getDescription());
        itemtoUpdate.setCreatedAt(LocalDateTime.now());
        itemtoUpdate.setUpdatedAt(LocalDateTime.now());

        service.update(itemtoUpdate);

        return "redirect:/ui/v1/items/";
    }

*/

}