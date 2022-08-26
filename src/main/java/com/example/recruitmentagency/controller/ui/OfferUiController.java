package com.example.recruitmentagency.controller.ui;

import com.example.recruitmentagency.forms.AcquirerForm;
import com.example.recruitmentagency.forms.OfferForm;
import com.example.recruitmentagency.model.Acquirer;
import com.example.recruitmentagency.model.Offer;
import com.example.recruitmentagency.service.item.impls.AcquirerServiceImpl;
import com.example.recruitmentagency.service.item.impls.OfferServiseImpl;
import com.example.recruitmentagency.service.item.interfaces.IOfferService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

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
        return  "redirect:/ui/v1/offers/";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addAcquirer(Model model){
        OfferForm offersForm = new OfferForm();
        model.addAttribute("form", offersForm);
        return "offers-create";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addOffer(@ModelAttribute("form") OfferForm form){
        Offer offer = new Offer();
        offer.setName(form.getName());
        offer.setDescription(form.getDescription());
        offer.setWorkType(form.getWorkType());
        offer.setJobTitle(form.getJobTitle());
        offer.setWorkExperience(form.getWorkExperience());
        offer.setRate(form.getRate());
        offer.setProjectDescription(form.getProjectDescription());
        service.create(offer);
        return "redirect:/ui/v1/offers/";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String updateOffer(Model model, @PathVariable("id") String id){
        Offer offerToUpdate = service.get(id);
        OfferForm offerForm = new  OfferForm();
        offerForm.setId(offerToUpdate.getId());
        offerForm.setName(offerToUpdate.getName());
        offerForm.setDescription(offerToUpdate.getDescription());
        offerForm.setWorkType(offerToUpdate.getWorkType());
        offerForm.setJobTitle(offerToUpdate.getJobTitle());
        offerForm.setWorkExperience(offerToUpdate.getWorkExperience());
        offerForm.setRate(offerToUpdate.getRate());
        offerForm.setProjectDescription(offerToUpdate.getProjectDescription());
        offerForm.setUpdateAt(offerToUpdate.getUpdatedAt());
        offerForm.setCreatedAt(offerToUpdate.getCreatedAt());
        model.addAttribute("form", offerForm);
        return "offers-update";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    public String updateOffer( @ModelAttribute("form") OfferForm form){
        System.out.println(form);
        Offer offertoUpdate = new Offer();
        offertoUpdate.setId(form.getId());
        offertoUpdate.setName(form.getName());
        offertoUpdate.setDescription(form.getDescription());
        offertoUpdate.setWorkType(form.getWorkType());
        offertoUpdate.setJobTitle(form.getJobTitle());
        offertoUpdate.setWorkExperience(form.getWorkExperience());
        offertoUpdate.setRate(form.getRate());
        offertoUpdate.setProjectDescription(form.getProjectDescription());
        offertoUpdate.setUpdatedAt(form.getUpdateAt());
        offertoUpdate.setCreatedAt(form.getCreatedAt());

        service.update(offertoUpdate);

        return "redirect:/ui/v1/offers/";
    }



}
