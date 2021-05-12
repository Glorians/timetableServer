package ua.csbc.glorians.timetable.server.controllers

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@Controller
class MainController {

    @GetMapping("/home")
    fun home(model: Model): String {
        model.addAttribute("title", "Главная страница")
        model.addAttribute("text", "Рассписание")
        return "home"
    }
}