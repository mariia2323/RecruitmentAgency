package com.example.recruitmentagency.controller.ui;

import com.example.recruitmentagency.forms.AgreementForm;
import com.example.recruitmentagency.forms.ItemForm;
import com.example.recruitmentagency.model.Agreement;
import com.example.recruitmentagency.model.Item;
import com.example.recruitmentagency.service.item.impls.AgreementServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RequestMapping("/ui/v1/agreements/")
@Controller
public class AgreementUiController {


    @Autowired
    AgreementServiceImpl service;

    @GetMapping("")
    public String showAll(Model model){
        model.addAttribute("agreements",service.getAll());
        return "agreements";
    }
    @GetMapping("/del/{id}")
    public String deleteById(@PathVariable("id") String id) {
        service.delete(id);
        return  "redirect:/ui/v1/agreements/";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addAgreement(Model model){
        AgreementForm agreementForm = new AgreementForm();
        model.addAttribute("form", agreementForm);
        return "agreements-create";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addAgreement(@ModelAttribute("form") AgreementForm form){
        Agreement agreement = new Agreement();
        agreement.setName(form.getName());
        agreement.setDescription(form.getDescription());
        agreement.setEmployer(form.getEmployer());
        agreement.setAcquirer(form.getAcquirer());
        agreement.setOffer(form.getOffer());
        agreement.setCommission(form.getCommission());
        agreement.setThe_date(form.getThe_date());
        service.create(agreement);
        return "redirect:/ui/v1/agreements/";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String updateItem(Model model, @PathVariable("id") String id){
        Agreement agreementToUpdate = service.get(id);
        AgreementForm agreementForm = new AgreementForm();
        agreementForm.setId(agreementToUpdate.getId());
        agreementForm.setName(agreementToUpdate.getName());
        agreementForm.setDescription(agreementToUpdate.getDescription());
        agreementForm.setUpdateAt(agreementToUpdate.getUpdatedAt());
        agreementForm.setCreatedAt(agreementToUpdate.getCreatedAt());
        agreementForm.setEmployer(agreementToUpdate.getEmployer());
        agreementForm.setAcquirer(agreementToUpdate.getAcquirer());
        agreementForm.setOffer(agreementToUpdate.getOffer());
        agreementForm.setCommission(agreementToUpdate.getCommission());
        agreementForm.setThe_date(agreementToUpdate.getThe_date());
        model.addAttribute("form", agreementForm);
        return "agreements-update";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    public String updateItem( @ModelAttribute("form") AgreementForm form){
        System.out.println(form);
        Agreement agreementtoUpdate = new Agreement();
        agreementtoUpdate.setId(form.getId());
        agreementtoUpdate.setName(form.getName());
        agreementtoUpdate.setDescription(form.getDescription());
        agreementtoUpdate.setCreatedAt(LocalDateTime.now());
        agreementtoUpdate.setUpdatedAt(LocalDateTime.now());
        agreementtoUpdate.setEmployer(form.getEmployer());
        agreementtoUpdate.setAcquirer(form.getAcquirer());
        agreementtoUpdate.setOffer(form.getOffer());
        agreementtoUpdate.setCommission(form.getCommission());
        agreementtoUpdate.setThe_date(form.getThe_date());

        service.update(agreementtoUpdate);

        return "redirect:/ui/v1/agreements/";
    }



}
