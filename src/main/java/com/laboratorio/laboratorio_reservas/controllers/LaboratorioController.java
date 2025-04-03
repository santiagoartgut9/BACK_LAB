package com.laboratorio.laboratorio_reservas.controllers;

import com.laboratorio.laboratorio_reservas.models.Laboratorio;
import com.laboratorio.laboratorio_reservas.services.LaboratorioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:3001", "https://ambitious-river-02ff82c00.6.azurestaticapps.net"}) 
@RestController
@RequestMapping("/laboratorios")
public class LaboratorioController {

    @Autowired
    private LaboratorioService laboratorioService;

    @GetMapping
    public List<Laboratorio> obtenerLaboratorios() {
        return laboratorioService.listarLaboratorios();
    }
}
