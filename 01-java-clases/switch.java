int tipoResul = 3;
String mensaje;

// Single case switch.
switch (tipoResul)
{
    case 1: mensaje = "Aprobado";
    break;
    case 2: mensaje = "Desaprobado";
    break;
    case 3: mensaje = "Recuperatorio";
    break;
    default: mensaje = "Examen no cursado";
    break;
}

// Multiple case switch
switch (diaSemana.toLowerCase()) {
    case "lunes":
    tipoDia = "Inicio de semana";
    break;
    case "martes":
    case "míercoles":
    case "jueves":
    tipoDia = "Mediados de semana";
    break;
    case "viernes":
    tipoDia = "Inicio de fin se semana";
    break;
    case "sábado":
    case "domingo":
    tipoDia = "Fin de seman";
    break;
}