#Escenarios de pruebas Unicomfacauca - Facebook
#language: es

  Característica: Validar registro Facebook
    Como un usuario nuevo
    Quiero usar el formulario de Registro de Facebook
    Para crear un nuevo usuario

  @ValidarCreacionNuevoUsuario
  Esquema del escenario: : Validar nuevo registro
    Dado que un nuevo usuario Edison accede a la pagina de facebook
    Cuando el diligencia los campos de resgitro
      | <nombre> | <apellido> | <celular> | <password> | <diaN> | <mesN> | <anioN> | <genero> |
    Y selecciona la opcion Guardar registrate
    Entonces el deberia ver la interfaz de confirmar registro

  Ejemplos:
    | nombre | apellido | celular    | password | diaN | mesN | anioN | genero |
    | Edison | Vasquez  | 3225698885 | Edi12345 | 16   | nov  | 1990  | Hombre |
