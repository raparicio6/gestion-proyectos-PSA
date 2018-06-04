# language: es
Característica: Finalizacion del desarrollo de una tarea

  Escenario: Se finaliza de desarrollar una tarea
    Dado que una tarea con "Validar campo edad mayor a 18" como descripcion se crea
    Cuando se le asigna a un desarrollador con legajo "12345678"
    Entonces el desarrollador la resuelve y finaliza la tarea numero "1"