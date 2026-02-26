Feature: Gestión del Catálogo de Libros
  Como un lector de Relatos de Papel
  Quiero consultar la información de un libro específico
  Para decidir si quiero adquirirlo

  Scenario: Obtener detalles de un libro por su ID
    Given que el libro con ID "10" existe en el catálogo
    When realizo una petición GET a "/books/10"
    Then la respuesta debe tener un código de estado 200
    And el título del libro debe ser "Deep Work"