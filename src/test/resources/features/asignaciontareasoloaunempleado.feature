# language: es
Característica: Asignacion de una tarea a un empleado cuando ya tiene otro asignado

  Escenario: Se le asigna una tarea a un empleado, y luego se lo intenta volver a hacer con otro
    Dado que una tarea con "Agregar campo para imagen de perfil." de descripcion se crea
    Cuando se le asigna a desarrollador de legajo "12345678"
    Entonces si se intenta asignar la tarea a otro desarrollador no se lo permite