<?php
echo "<h2>El usuario ya existe</h2>";
echo <<< HTML
Volviendo a registro de usuarios en 3 segundos...
HTML;
header("Refresh: 3; registrar.php");
?>