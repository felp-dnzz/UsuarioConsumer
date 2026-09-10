package org.example.usuarioconsumer.controller;

import org.example.usuarioconsumer.model.UsuarioInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.example.usuarioconsumer.service.UsuarioInfoService;

@Controller
@RequestMapping("/usuarioInfo")
public class UsuarioInfoController {
    @Autowired
    private UsuarioInfoService usuarioInfoService;

    @GetMapping("/new")
    public String newUsuarioInfoString(Model model) {
        model.addAttribute("usuarioInfo", new UsuarioInfo());
        return "usuarioinfo/form";
    }

    @GetMapping("")
    public String listUsuarioInfoString(Model model) {
        model.addAttribute("listUsuarioInfo", usuarioInfoService.findAll());
        return "usuarioInfo/list";
    }

    @GetMapping("/{id}/edit")
    public String editUsuarioInfoString(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("usuarioInfo", usuarioInfoService.findById(id));
        return "usuarioInfo/form";
    }

    @PostMapping("/save")
    public String saveUsuarioInfo(@ModelAttribute("usuarioInfo") UsuarioInfo usuarioInfo) {
        usuarioInfoService.save(usuarioInfo);
        return "redirect:/usuarioInfo";
    }

    @GetMapping("/{id}/delete")
    public String deleteUsuarioInfo(@PathVariable("id") Integer id) {
        usuarioInfoService.delete(id);
        return "redirect:/usuarioInfo";
    }
}
