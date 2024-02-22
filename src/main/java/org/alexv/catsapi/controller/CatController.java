package org.alexv.catsapi.controller;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.alexv.catsapi.controller.service.CatService;
import org.alexv.catsapi.dto.CatDto;
import org.alexv.catsapi.entity.Cat;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cats")
@RequiredArgsConstructor
public class CatController {

    private final CatService catService;
    @GetMapping
    public List<Cat> getAll() {
        return catService.getAll();
    }

    @PostMapping
    public Cat saveCat(@RequestBody CatDto catDto) {
        return catService.saveCat(catDto);
    }

    // fallback handler
    @RequestMapping("/**")
    public String handleUnknownRoutes(HttpServletRequest request) {
        return "Unknown route: " + request.getRequestURI();
    }
}
