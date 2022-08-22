/*package com.example.recruitmentagency.controller.gui;


import com.example.recruitmentagency.model.Item;
import com.example.recruitmentagency.service.item.interfaces.IItemService;
import com.example.recruitmentagency.forms.ItemForm;
import com.example.recruitmentagency.model.Item;
//import com.example.recruitmentagency.service.interfaces.IItemService;
//import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/gui/items")
//@AllArgsConstructor
public class ItemGuiController {

    private IItemService service;

    @RequestMapping("/all")
    public String getAll(Model model) {

        List<Item> items = service.getAll();
        model.addAttribute("items", items);
        return "items";
    }

    @RequestMapping("/delete/{id}")
    public ModelAndView delete(ModelMap model, @PathVariable String id) {
        service.delete(id);
        return new ModelAndView("redirect:/gui/items/all", model);
    }

    @RequestMapping("/create")
    public String create(ModelMap model) {
        //service.create();
        ItemForm formToCreate = new ItemForm();
        model.addAttribute("form", formToCreate);
        return "item-create";
    }

    @PostMapping("/create")
    public ModelAndView create(ModelMap model, @ModelAttribute("form") ItemForm form) {
        Item item = new Item(form.getName(), form.getDescription());
        service.create(item);
        return new ModelAndView("redirect:/gui/items/all", model);
    }

    @RequestMapping("/update/{id}")
    public String update(ModelMap model, @PathVariable String id) {
        Item item = service.get(id);
        ItemForm formToUpdate = new ItemForm(item.getName(),
                item.getDescription());
        model.addAttribute("form", formToUpdate);
        return "item-update";
    }

    @PostMapping("/update/{id}")
    public ModelAndView update(ModelMap model, @ModelAttribute("form") ItemForm form, @PathVariable String id) {
        Item item = service.get(id);
        item.setName(form.getName());
        item.setDescription(form.getDescription());
        service.update(item);
        return new ModelAndView("redirect:/gui/items/all", model);
    }
}
*/