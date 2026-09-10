package controller;

import model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import service.UsuarioService;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/new")
    public String newUsuarioString(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "usuario/form";
    }

    @GetMapping("")
    public String listUsuarioString(Model model) {
        model.addAttribute("listUsuario", usuarioService.findAll());
        return "usuario/list";
    }

    @GetMapping("/{id}/edit")
    public String editUsuarioString(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("usuario", usuarioService.findById(id));
        return "usuario/form";
    }

    @PostMapping("/save")
    public String saveUsuario(@ModelAttribute("usuario") Usuario usuario) {
        usuarioService.save(usuario);
        return "redirect:/usuario";
    }

    @GetMapping("/{id}/delete")
    public String deleteUsuario(@PathVariable("id") Integer id) {
        usuarioService.delete(id);
        return "redirect:/usuario";
    }
}
