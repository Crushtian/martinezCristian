<?php
session_start();

$correcto = false;

if (isset($_GET['enviarLista'])) {

    $_SESSION['activo'] = isset($_GET['nombre']) ? $_GET['nombre'] : null;

    if (isset($_SESSION['usuarios'])) {
        $id = isset($_GET['nombre']) ? $_GET['nombre'] : null;
        $pass = isset($_GET['pass']) ? $_GET['pass'] : null;

        $bd = $_SESSION['usuarios'];

        foreach ($bd as $user => $valork) {

            if ($id == $user && $pass == $valork['pwd']) {
                $correcto = true;
            }
        }
    }

    if ($correcto == false) {
        echo <<< HTML
    <h2>usuario y pass incorrecto</h2>
    <br>
    Volviendo a login en 3 segundos...
HTML;
        header("Refresh: 3; login.php");
    } else { // recorremos la array de usuarios para ver a quienes podemos enviar mensajes
        if (isset($_SESSION['usuarios'])) {
            // foreach ($_SESSION['usuarios'][$_SESSION['activo']]['mensajes'] as $key => $value) {
            // echo "Nmensaje:$key &nbsp;&nbsp; REMITENTE:{$value['remitente']}&nbsp;&nbsp; FECHA:{$value['fecha']}&nbsp;&nbsp; TEXTO:{$value['texto']}<br>";
            // }
            $nombreAd = $_SESSION['activo'];
            echo "Usuario actual {$_SESSION['activo']}";

            echo "<h2>Lista de usuarios / mensajes </h2>";

            // sacar contadores mensajes

            foreach ($_SESSION['usuarios'] as $user => $valorUser) {
                $_SESSION['contador'] = 0;

                if ($user != $_SESSION['activo']) {
                    $nombreUser = $user;
                    foreach ($_SESSION['usuarios'][$_SESSION['activo']]['mensajes'] as $key => $valor) {
                        $nombreRemi = $valor['remitente'];
                        if ($nombreUser == $nombreRemi) {
                            $_SESSION['contador'] ++;
                        }
                    }
                    echo $_SESSION['contador'] > 0 ? "$nombreUser ({$_SESSION['contador']})&nbsp;&nbsp;  <a href=\"leer.php?name=$nombreUser&activo={$_SESSION['activo']}\">Leer</a> &nbsp;&nbsp;  <a href=\"escribir.php?name=$user\">Escribir</a><br>" : $nombreUser . "(0) &nbsp;&nbsp;&nbsp;<a href=\"escribir.php?name=$nombreUser\"&activo=\"{$_SESSION['activo']}\">Escribir</a><br>";
                }
                unset($_SESSION['contador']);
            }
        }
        echo "<br><a href=\"login.php\">Volver a Login</a>";
    }

    // parte check

    if (isset($_GET['check']) && $correcto == true) {
        $_SESSION['recordar'] = $_SESSION['activo'];
    }
    
} else {

    if (isset($_GET['enviarMensaje'])) {
        if (isset($_GET['area']) && $_GET['area'] != "") {
            $emisor = $_SESSION['activo'];
            $destino = $_SESSION['destino'];
            $fecha = date("F j, Y, g:i a");

            $_SESSION['usuarios'][$destino]['mensajes'][] = [
                "remitente" => $emisor,
                "fecha" => $fecha,
                "texto" => $_GET['area']
            ];

            // foreach ($_SESSION['usuarios'][$_SESSION['activo']]['mensajes'] as $key => $value) {
            // echo "Nmensaje:$key &nbsp;&nbsp; REMITENTE:{$value['remitente']}&nbsp;&nbsp; FECHA:{$value['fecha']}&nbsp;&nbsp; TEXTO:{$value['texto']}<br>";
            // }
        } else {
            header('Location: listaUsuarios.php');
        }
    }

    echo "Usuario actual {$_SESSION['activo']}";
    echo "<h2>Lista de usuarios / mensajes </h2>";
    $bd = $_SESSION['usuarios'];

    foreach ($_SESSION['usuarios'] as $user => $valorUser) {
        $_SESSION['contador'] = 0;
        if ($user != $_SESSION['activo']) {
            $nombreUser = $user;
            foreach ($_SESSION['usuarios'][$_SESSION['activo']]['mensajes'] as $key => $valor) {
                $nombreRemi = $valor['remitente'];
                if ($nombreUser == $nombreRemi) {
                    $_SESSION['contador'] ++;
                }
            }
            echo $_SESSION['contador'] > 0 ? "$user ({$_SESSION['contador']})&nbsp;&nbsp;  <a href=\"leer.php?name=$user\">Leer</a> &nbsp;&nbsp;  <a href=\"escribir.php?name=$user\">Escribir</a><br>" : $user . "(0) &nbsp;&nbsp;&nbsp;<a href=\"escribir.php?name=$user\">Escribir</a><br>";
        }
        unset($_SESSION['contador']);
    }

    echo "<br><a href=\"login.php\">Volver a Login</a>";
    echo "<br>";
}
?>