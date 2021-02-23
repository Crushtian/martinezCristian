<?php
session_start();
$existe = false;

if (isset($_SESSION['usuarios'])) {
    
    
    $bd = $_SESSION['usuarios'];

    $nombre = isset($_GET['nombreN']) ? $_GET['nombreN'] : null;
    $pass = isset($_GET['passN']) ? $_GET['passN'] : null;
    
    

    foreach ($bd as $usuarios => $valorU) {

        if ($nombre == $usuarios) {
            $existe = true;
            header('Location: existe.php');
            exit();
        }
    }
    if ($existe == false && $nombre != null && $pass != null) {
        $_SESSION['usuarios'][$nombre] = [
            "pwd" => $pass,
            "mensajes" => []
        ];
    }
    


    echo "<h1>USUARIO REGISTRADO</h1>";
} else {
    $nombre = isset($_GET['nombreN']) ? $_GET['nombreN'] : null;
    $pass = isset($_GET['passN']) ? $_GET['passN'] : null;

    if ($nombre != null && $pass != null) {
        $_SESSION['usuarios'] = array();
        $_SESSION['usuarios'][$nombre] = [
            "pwd" => $pass,
            "mensajes" => []
        ];
    }

    echo "<h1>USUARIO REGISTRADO</h1>";
}

echo <<< HTML
<br>
<a href="registrar.php">Volver a registrar</a>
<br>
<a href="login.php">Volver a login</a>
HTML;

?>