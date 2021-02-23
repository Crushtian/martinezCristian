<?php
session_start();


$_SESSION ['destino'] = isset($_GET['name']) ? $_GET['name']: null;


    echo <<< HTML
    
    <form action="listaUsuarios.php">
    De: <input type="text" readonly value="{$_SESSION['activo']}"><br>
    Para:  <input type="text" readonly value="{$_SESSION['destino']}"><br> 
    Escribir el contenido del mensaje:<br>  
    <textarea name="area" placeholder="Escriba su mensaje" rows="8" cols="50"></textarea><br>
    <input type="submit" name="enviarMensaje">    
HTML;


?>