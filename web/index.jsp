<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Aplicació web java: Visualització de paràmetres del sistema</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="Expires" content="0">
        <meta http-equiv="Cache-Control" content="no-cache">
        <meta http-equiv="Pragma" content="no-cache">
    </head>
    <body>
        <h1>VISUALITZACIÓ DE PARÀMETRES DEL SISTEMA<h1>
        <h2>Si us plau, escriu el teu nom d'usuari i contrasenya: </h2> 
        <form action="Servlet1" method="post" autocomplete="off">
            Nom usuari: <input type="text" name="nom_usuari"/><br/>
            Contrasenya: <input type="password" name="ctr_usuari"/><br/>
            </br>
            <input type="submit" value="Login"/>          
        </form>        
    </body>
</html>
