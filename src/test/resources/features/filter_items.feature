# language: es
Característica: Filter Items
  Como usuario web
  Quiero Filtrar productos
  Para encontrar los que me interesan

  Escenario: filtrar productos por caracteristicas en una determinada categoria
    Cuando "Rodolfo" quiere encontrar "Celulares" "Samsung" con "8GB" de ram
    Entonces debe ver la lista hasta con "100" items

  Escenario: buscar productos por la barra de busqueda
    Cuando "Rodolfo" quiere buscar productos "Samsung" y ordenarlos en un "Grid"
    Entonces debe ver una lista con productos en estilo "Grid"

  Escenario: Buscar horarios de atencion de una tienda Alkosto
    Cuando "Rodolfo" quiere Buscar los horarios de atencion en el "Alkosto Avenida 68" en "Bogota"
    Entonces debe ver la lista hasta con "25" items