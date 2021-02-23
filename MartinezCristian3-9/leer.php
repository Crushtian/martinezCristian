
<?php
session_start();

echo "usuario actual {$_SESSION['activo']}";

$_SESSION['destino'] = isset($_GET['name']) ? $_GET['name'] : null;

echo "<h2>Lista mensajes de {$_SESSION ['destino']}</h2>";
echo <<< html
<h2>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Fecha&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Texto</h2>
html;

foreach ($_SESSION['usuarios'][$_SESSION['activo']]['mensajes'] as $key => $value) {
    if ($_SESSION['destino'] == $value['remitente']) {
        echo "{$value['fecha']} {$value['texto']}<br>";
        // echo "Nmensaje:$key &nbsp;&nbsp; REMITENTE:{$value['remitente']}&nbsp;&nbsp; FECHA:{$value['fecha']}&nbsp;&nbsp; TEXTO:{$value['texto']}<br>";
    }
}
echo "<br><a href=\"listaUsuarios.php\">Volver a Lista de usuarios</a>";
?>