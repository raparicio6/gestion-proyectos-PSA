# language: es
Característica: Cierre de tickets (incidencias)

  Escenario: Ticket con feedback positivo
    Dado que un ticket es creado por un cliente con "Los feriados del 2019 no están cargados." como descripcion
    Cuando se resuelve
    Entonces el cliente puede dar un feedback "Se agregaron todos los feriados rápidamente iniciado el inconveniente." de la resolucion del ticket "1"