package com.laboratorio.laboratorio_reservas.controllers;

import com.laboratorio.laboratorio_reservas.models.Laboratorio;
import com.laboratorio.laboratorio_reservas.services.LaboratorioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controlador REST para gestionar los laboratorios.
 * 
 * Permite obtener la lista de laboratorios disponibles en el sistema.
 * Habilita el acceso desde dominios externos mediante CORS.
 */
@CrossOrigin(origins = {"http://localhost:3001", "https://ambitious-river-02ff82c00.6.azurestaticapps.net"})
@RestController
@RequestMapping("/laboratorios")
public class LaboratorioController {

    /**
     * Servicio que maneja la lógica de negocio relacionada con los laboratorios.
     */
    @Autowired
    private LaboratorioService laboratorioService;

    /**
     * Obtiene la lista de todos los laboratorios disponibles.
     * 
     * @return Lista de objetos {@link Laboratorio} que representan los laboratorios en la base de datos.
     */
    @GetMapping
    public List<Laboratorio> obtenerLaboratorios() {
        return laboratorioService.listarLaboratorios();
    }
}
