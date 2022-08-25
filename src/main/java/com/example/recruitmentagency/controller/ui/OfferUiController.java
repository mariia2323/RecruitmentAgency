package com.example.recruitmentagency.controller.ui;
/*
import com.example.recruitmentagency.forms.ItemForm;
import com.example.recruitmentagency.model.Item;
import com.example.recruitmentagency.model.Offer;
import com.example.recruitmentagency.service.item.impls.OfferServiseImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;


    @RequestMapping("/ui/v1/offers/")
    @Controller
    public class OfferUiController {


        @Autowired
        OfferServiseImpl service;

        @GetMapping("")
        public String showAll(Model model){
            model.addAttribute("offers",service.getAll());
            return "offers";
        }
        @GetMapping("/del/{id}")
        public String deleteById(@PathVariable("id") String id) {
            service.delete(id);
            return  "redirect:/ui/v1/items/";
        }

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
/*
import com.example.recruitmentagency.forms.ItemForm;
import com.example.recruitmentagency.forms.OfferForm;
import com.example.recruitmentagency.model.Item;
import com.example.recruitmentagency.model.Offer;
import com.example.recruitmentagency.service.item.interfaces.IItemService;
import com.example.recruitmentagency.service.item.interfaces.IOfferService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/ui/offers")
@AllArgsConstructor
public class OfferUiController {

    private IOfferService service;

    @RequestMapping("/add")
    public String getAll(Model model) {

        List<Offer> offers = service.getAll();
        model.addAttribute("offers", offers);
        return "offers";
    }

    @RequestMapping("/delete/{id}")
    public ModelAndView delete(ModelMap model, @PathVariable String id) {
        service.delete(id);
        return new ModelAndView("redirect:/ui/offers/add", model);
    }

    @RequestMapping("/create")
    public String create(ModelMap model) {
        //service.create();
        OfferForm formToCreate = new OfferForm();
        model.addAttribute("form", formToCreate);
        return "offers-create";
    }

    @PostMapping("/create")
    public ModelAndView create(ModelMap model, @ModelAttribute("form") OfferForm form) {
        Offer offer = new Offer(form.getName(), form.getDescription());
        service.create(offer);
        return new ModelAndView("redirect:/ui/items/add", model);
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
        return new ModelAndView("redirect:/ui/items/add", model);
    }
}
*/


