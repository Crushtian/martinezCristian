<?php
session_start();

echo <<< HTML
    <h1>NUEVO USUARIO</h1>
    <form action="confirmarUsuario.php">
    <label for="nombreN">Nombre&nbsp;</label><input type="text" id="nombreN" name="nombreN" placeholder="Introduce el nombre"><br>
    <label for="passN">Contraseña&nbsp;</label><input type="text" id="passN" name="passN" placeholder="Introduce la contraseña"><br>
    <input type="submit" value="Enviar" name="envioLogin"> 
    </form>
    
HTML;
echo "<br><a href=\"login.php\">Volver a Login</a>";

?>