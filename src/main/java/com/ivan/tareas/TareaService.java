package com.ivan.tareas;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class TareaService {
    private List<Tarea> tareas = new ArrayList<>();

    public TareaService() {
        tareas.add(new Tarea(1L, "Aprender Spring Boot", false));
        tareas.add(new Tarea(2L, "Crear primer API", false));
    }

    public List<Tarea> obtenerTodas() {
        return tareas;
    }

    public void añadirTarea(Tarea tarea) {
        tareas.add(tarea);
    }
}
